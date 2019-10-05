package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[String] = js.undefined
}

object LiveChatMessageDeletedDetails {
  @scala.inline
  def apply(deletedMessageId: String = null): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    if (deletedMessageId != null) __obj.updateDynamic("deletedMessageId")(deletedMessageId)
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
}

