package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderReportTransaction extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.undefined
  var disbursementCreationDate: js.UndefOr[String] = js.undefined
  var disbursementDate: js.UndefOr[String] = js.undefined
  var disbursementId: js.UndefOr[String] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var merchantOrderId: js.UndefOr[String] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
  var productAmount: js.UndefOr[Amount] = js.undefined
  var productAmountWithRemittedTax: js.UndefOr[ProductAmount] = js.undefined
  var transactionDate: js.UndefOr[String] = js.undefined
}

object OrderReportTransaction {
  @scala.inline
  def apply(
    disbursementAmount: Price = null,
    disbursementCreationDate: String = null,
    disbursementDate: String = null,
    disbursementId: String = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    orderId: String = null,
    productAmount: Amount = null,
    productAmountWithRemittedTax: ProductAmount = null,
    transactionDate: String = null
  ): OrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    if (disbursementAmount != null) __obj.updateDynamic("disbursementAmount")(disbursementAmount.asInstanceOf[js.Any])
    if (disbursementCreationDate != null) __obj.updateDynamic("disbursementCreationDate")(disbursementCreationDate.asInstanceOf[js.Any])
    if (disbursementDate != null) __obj.updateDynamic("disbursementDate")(disbursementDate.asInstanceOf[js.Any])
    if (disbursementId != null) __obj.updateDynamic("disbursementId")(disbursementId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (productAmount != null) __obj.updateDynamic("productAmount")(productAmount.asInstanceOf[js.Any])
    if (productAmountWithRemittedTax != null) __obj.updateDynamic("productAmountWithRemittedTax")(productAmountWithRemittedTax.asInstanceOf[js.Any])
    if (transactionDate != null) __obj.updateDynamic("transactionDate")(transactionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderReportTransaction]
  }
}

