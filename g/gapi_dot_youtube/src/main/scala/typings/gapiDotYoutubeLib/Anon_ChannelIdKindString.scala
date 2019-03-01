package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdKindString extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that the user subscribed to.
    */
  var channelId: java.lang.String
  /**
    * The type of the API resource.
    */
  var kind: java.lang.String
}

object Anon_ChannelIdKindString {
  @scala.inline
  def apply(channelId: java.lang.String, kind: java.lang.String): Anon_ChannelIdKindString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channelId")(channelId)
    __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Anon_ChannelIdKindString]
  }
}

