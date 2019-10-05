package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollItem extends js.Object {
  /** Plain text description of the item. */
  var description: js.UndefOr[String] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
}

object LiveChatPollItem {
  @scala.inline
  def apply(description: String = null, itemId: String = null): LiveChatPollItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    __obj.asInstanceOf[LiveChatPollItem]
  }
}

