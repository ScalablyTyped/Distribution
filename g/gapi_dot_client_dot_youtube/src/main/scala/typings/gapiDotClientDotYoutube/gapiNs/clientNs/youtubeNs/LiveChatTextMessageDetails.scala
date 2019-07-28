package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatTextMessageDetails extends js.Object {
  /** The user's message. */
  var messageText: js.UndefOr[String] = js.undefined
}

object LiveChatTextMessageDetails {
  @scala.inline
  def apply(messageText: String = null): LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    __obj.asInstanceOf[LiveChatTextMessageDetails]
  }
}

