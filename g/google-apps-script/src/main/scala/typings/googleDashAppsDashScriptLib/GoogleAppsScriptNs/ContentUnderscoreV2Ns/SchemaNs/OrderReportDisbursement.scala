package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderReportDisbursement extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.undefined
  var disbursementCreationDate: js.UndefOr[java.lang.String] = js.undefined
  var disbursementDate: js.UndefOr[java.lang.String] = js.undefined
  var disbursementId: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
}

object OrderReportDisbursement {
  @scala.inline
  def apply(
    disbursementAmount: Price = null,
    disbursementCreationDate: java.lang.String = null,
    disbursementDate: java.lang.String = null,
    disbursementId: java.lang.String = null,
    merchantId: java.lang.String = null
  ): OrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    if (disbursementAmount != null) __obj.updateDynamic("disbursementAmount")(disbursementAmount)
    if (disbursementCreationDate != null) __obj.updateDynamic("disbursementCreationDate")(disbursementCreationDate)
    if (disbursementDate != null) __obj.updateDynamic("disbursementDate")(disbursementDate)
    if (disbursementId != null) __obj.updateDynamic("disbursementId")(disbursementId)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    __obj.asInstanceOf[OrderReportDisbursement]
  }
}

