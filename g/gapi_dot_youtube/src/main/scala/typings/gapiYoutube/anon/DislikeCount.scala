package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DislikeCount extends js.Object {
  /**
    * The number of comments for the video.
    */
  var commentCount: Double = js.native
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: Double = js.native
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: Double = js.native
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: Double = js.native
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: Double = js.native
}

object DislikeCount {
  @scala.inline
  def apply(
    commentCount: Double,
    dislikeCount: Double,
    favoriteCount: Double,
    likeCount: Double,
    viewCount: Double
  ): DislikeCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], dislikeCount = dislikeCount.asInstanceOf[js.Any], favoriteCount = favoriteCount.asInstanceOf[js.Any], likeCount = likeCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DislikeCount]
  }
  @scala.inline
  implicit class DislikeCountOps[Self <: DislikeCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommentCount(value: Double): Self = this.set("commentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDislikeCount(value: Double): Self = this.set("dislikeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavoriteCount(value: Double): Self = this.set("favoriteCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLikeCount(value: Double): Self = this.set("likeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewCount(value: Double): Self = this.set("viewCount", value.asInstanceOf[js.Any])
  }
  
}

