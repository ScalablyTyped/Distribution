package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollEditedDetails extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[LiveChatPollItem]] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
}

object LiveChatPollEditedDetails {
  @scala.inline
  def apply(id: String = null, items: js.Array[LiveChatPollItem] = null, prompt: String = null): LiveChatPollEditedDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatPollEditedDetails]
  }
}

