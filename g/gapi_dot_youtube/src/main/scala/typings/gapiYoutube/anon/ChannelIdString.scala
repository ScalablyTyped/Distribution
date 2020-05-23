package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdString extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
}

object ChannelIdString {
  @scala.inline
  def apply(channelId: String, kind: String): ChannelIdString = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdString]
  }
}

