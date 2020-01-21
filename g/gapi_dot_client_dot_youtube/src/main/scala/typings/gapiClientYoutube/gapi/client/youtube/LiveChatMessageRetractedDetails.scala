package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageRetractedDetails extends js.Object {
  var retractedMessageId: js.UndefOr[String] = js.undefined
}

object LiveChatMessageRetractedDetails {
  @scala.inline
  def apply(retractedMessageId: String = null): LiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    if (retractedMessageId != null) __obj.updateDynamic("retractedMessageId")(retractedMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatMessageRetractedDetails]
  }
}

