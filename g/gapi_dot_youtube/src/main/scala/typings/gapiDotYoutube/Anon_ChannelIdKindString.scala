package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdKindString extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
}

object Anon_ChannelIdKindString {
  @scala.inline
  def apply(channelId: String, kind: String): Anon_ChannelIdKindString = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdKindString]
  }
}

