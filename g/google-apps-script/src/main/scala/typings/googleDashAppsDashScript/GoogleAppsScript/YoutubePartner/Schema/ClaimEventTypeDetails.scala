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
    if (appealExplanation != null) __obj.updateDynamic("appealExplanation")(appealExplanation.asInstanceOf[js.Any])
    if (disputeNotes != null) __obj.updateDynamic("disputeNotes")(disputeNotes.asInstanceOf[js.Any])
    if (disputeReason != null) __obj.updateDynamic("disputeReason")(disputeReason.asInstanceOf[js.Any])
    if (updateStatus != null) __obj.updateDynamic("updateStatus")(updateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimEventTypeDetails]
  }
}

