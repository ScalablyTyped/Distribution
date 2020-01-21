package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderreportsListDisbursementsResponse extends js.Object {
  var disbursements: js.UndefOr[js.Array[OrderReportDisbursement]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object OrderreportsListDisbursementsResponse {
  @scala.inline
  def apply(
    disbursements: js.Array[OrderReportDisbursement] = null,
    kind: String = null,
    nextPageToken: String = null
  ): OrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    if (disbursements != null) __obj.updateDynamic("disbursements")(disbursements.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderreportsListDisbursementsResponse]
  }
}

