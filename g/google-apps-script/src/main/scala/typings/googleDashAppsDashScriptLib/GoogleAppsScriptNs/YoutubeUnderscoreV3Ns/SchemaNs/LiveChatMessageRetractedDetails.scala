package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageRetractedDetails extends js.Object {
  var retractedMessageId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatMessageRetractedDetails {
  @scala.inline
  def apply(retractedMessageId: java.lang.String = null): LiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    if (retractedMessageId != null) __obj.updateDynamic("retractedMessageId")(retractedMessageId)
    __obj.asInstanceOf[LiveChatMessageRetractedDetails]
  }
}

