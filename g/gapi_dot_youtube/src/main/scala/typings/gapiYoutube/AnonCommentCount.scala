package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentCount extends js.Object {
  /**
    * The number of comments for the channel.
    */
  var commentCount: Double
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: Double
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: Double
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: Double
}

object AnonCommentCount {
  @scala.inline
  def apply(commentCount: Double, subscriberCount: Double, videoCount: Double, viewCount: Double): AnonCommentCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], subscriberCount = subscriberCount.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentCount]
  }
}

