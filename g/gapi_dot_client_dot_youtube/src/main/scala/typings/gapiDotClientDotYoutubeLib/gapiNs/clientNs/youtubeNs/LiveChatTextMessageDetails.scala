package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatTextMessageDetails extends js.Object {
  /** The user's message. */
  var messageText: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatTextMessageDetails {
  @scala.inline
  def apply(messageText: java.lang.String = null): LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    __obj.asInstanceOf[LiveChatTextMessageDetails]
  }
}

