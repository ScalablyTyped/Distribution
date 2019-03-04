package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentCount extends js.Object {
  /**
    * The number of comments for the channel.
    */
  var commentCount: scala.Double
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: scala.Double
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: scala.Double
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: scala.Double
}

object Anon_CommentCount {
  @scala.inline
  def apply(
    commentCount: scala.Double,
    subscriberCount: scala.Double,
    videoCount: scala.Double,
    viewCount: scala.Double
  ): Anon_CommentCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount, subscriberCount = subscriberCount, videoCount = videoCount, viewCount = viewCount)
  
    __obj.asInstanceOf[Anon_CommentCount]
  }
}

