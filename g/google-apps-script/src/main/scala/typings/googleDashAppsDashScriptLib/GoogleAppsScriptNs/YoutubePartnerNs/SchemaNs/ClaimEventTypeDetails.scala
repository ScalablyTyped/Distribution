package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimEventTypeDetails extends js.Object {
  var appealExplanation: js.UndefOr[java.lang.String] = js.undefined
  var disputeNotes: js.UndefOr[java.lang.String] = js.undefined
  var disputeReason: js.UndefOr[java.lang.String] = js.undefined
  var updateStatus: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimEventTypeDetails {
  @scala.inline
  def apply(
    appealExplanation: java.lang.String = null,
    disputeNotes: java.lang.String = null,
    disputeReason: java.lang.String = null,
    updateStatus: java.lang.String = null
  ): ClaimEventTypeDetails = {
    val __obj = js.Dynamic.literal()
    if (appealExplanation != null) __obj.updateDynamic("appealExplanation")(appealExplanation)
    if (disputeNotes != null) __obj.updateDynamic("disputeNotes")(disputeNotes)
    if (disputeReason != null) __obj.updateDynamic("disputeReason")(disputeReason)
    if (updateStatus != null) __obj.updateDynamic("updateStatus")(updateStatus)
    __obj.asInstanceOf[ClaimEventTypeDetails]
  }
}

