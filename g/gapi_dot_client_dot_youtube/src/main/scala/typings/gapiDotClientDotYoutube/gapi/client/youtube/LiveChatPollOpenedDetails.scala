package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollOpenedDetails extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[LiveChatPollItem]] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
}

object LiveChatPollOpenedDetails {
  @scala.inline
  def apply(id: String = null, items: js.Array[LiveChatPollItem] = null, prompt: String = null): LiveChatPollOpenedDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[LiveChatPollOpenedDetails]
  }
}

