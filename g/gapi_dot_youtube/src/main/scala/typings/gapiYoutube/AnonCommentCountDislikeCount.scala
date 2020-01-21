package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentCountDislikeCount extends js.Object {
  /**
    * The number of comments for the video.
    */
  var commentCount: Double
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: Double
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: Double
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: Double
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: Double
}

object AnonCommentCountDislikeCount {
  @scala.inline
  def apply(
    commentCount: Double,
    dislikeCount: Double,
    favoriteCount: Double,
    likeCount: Double,
    viewCount: Double
  ): AnonCommentCountDislikeCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], dislikeCount = dislikeCount.asInstanceOf[js.Any], favoriteCount = favoriteCount.asInstanceOf[js.Any], likeCount = likeCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentCountDislikeCount]
  }
}

