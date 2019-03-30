package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollEditedDetails extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[LiveChatPollItem]] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatPollEditedDetails {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    items: js.Array[LiveChatPollItem] = null,
    prompt: java.lang.String = null
  ): LiveChatPollEditedDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[LiveChatPollEditedDetails]
  }
}

