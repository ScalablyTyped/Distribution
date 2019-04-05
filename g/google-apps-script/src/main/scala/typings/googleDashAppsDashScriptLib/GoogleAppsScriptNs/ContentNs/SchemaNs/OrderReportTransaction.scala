package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderReportTransaction extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.undefined
  var disbursementCreationDate: js.UndefOr[java.lang.String] = js.undefined
  var disbursementDate: js.UndefOr[java.lang.String] = js.undefined
  var disbursementId: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var productAmount: js.UndefOr[Amount] = js.undefined
  var productAmountWithRemittedTax: js.UndefOr[ProductAmount] = js.undefined
  var transactionDate: js.UndefOr[java.lang.String] = js.undefined
}

object OrderReportTransaction {
  @scala.inline
  def apply(
    disbursementAmount: Price = null,
    disbursementCreationDate: java.lang.String = null,
    disbursementDate: java.lang.String = null,
    disbursementId: java.lang.String = null,
    merchantId: java.lang.String = null,
    merchantOrderId: java.lang.String = null,
    orderId: java.lang.String = null,
    productAmount: Amount = null,
    productAmountWithRemittedTax: ProductAmount = null,
    transactionDate: java.lang.String = null
  ): OrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    if (disbursementAmount != null) __obj.updateDynamic("disbursementAmount")(disbursementAmount)
    if (disbursementCreationDate != null) __obj.updateDynamic("disbursementCreationDate")(disbursementCreationDate)
    if (disbursementDate != null) __obj.updateDynamic("disbursementDate")(disbursementDate)
    if (disbursementId != null) __obj.updateDynamic("disbursementId")(disbursementId)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (productAmount != null) __obj.updateDynamic("productAmount")(productAmount)
    if (productAmountWithRemittedTax != null) __obj.updateDynamic("productAmountWithRemittedTax")(productAmountWithRemittedTax)
    if (transactionDate != null) __obj.updateDynamic("transactionDate")(transactionDate)
    __obj.asInstanceOf[OrderReportTransaction]
  }
}

