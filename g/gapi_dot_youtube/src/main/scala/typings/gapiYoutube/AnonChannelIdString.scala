package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelIdString extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
}

object AnonChannelIdString {
  @scala.inline
  def apply(channelId: String, kind: String): AnonChannelIdString = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelIdString]
  }
}

