package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentCount extends js.Object {
  /**
    * The number of comments for the channel.
    */
  var commentCount: Double = js.native
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: Double = js.native
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: Double = js.native
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: Double = js.native
}

object CommentCount {
  @scala.inline
  def apply(commentCount: Double, subscriberCount: Double, videoCount: Double, viewCount: Double): CommentCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], subscriberCount = subscriberCount.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentCount]
  }
  @scala.inline
  implicit class CommentCountOps[Self <: CommentCount] (val x: Self) extends AnyVal {
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
    def setSubscriberCount(value: Double): Self = this.set("subscriberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoCount(value: Double): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewCount(value: Double): Self = this.set("viewCount", value.asInstanceOf[js.Any])
  }
  
}

