package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimEventTypeDetails extends js.Object {
  var appealExplanation: js.UndefOr[String] = js.undefined
  var disputeNotes: js.UndefOr[String] = js.undefined
  var disputeReason: js.UndefOr[String] = js.undefined
  var updateStatus: js.UndefOr[String] = js.undefined
}

object ClaimEventTypeDetails {
  @scala.inline
  def apply(
    appealExplanation: String = null,
    disputeNotes: String = null,
    disputeReason: String = null,
    updateStatus: String = null
  ): ClaimEventTypeDetails = {
    val __obj = js.Dynamic.literal()
    if (appealExplanation != null) __obj.updateDynamic("appealExplanation")(appealExplanation)
    if (disputeNotes != null) __obj.updateDynamic("disputeNotes")(disputeNotes)
    if (disputeReason != null) __obj.updateDynamic("disputeReason")(disputeReason)
    if (updateStatus != null) __obj.updateDynamic("updateStatus")(updateStatus)
    __obj.asInstanceOf[ClaimEventTypeDetails]
  }
}

