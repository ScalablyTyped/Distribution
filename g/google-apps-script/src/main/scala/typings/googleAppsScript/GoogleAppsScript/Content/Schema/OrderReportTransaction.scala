package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderReportTransaction extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.native
  var disbursementCreationDate: js.UndefOr[String] = js.native
  var disbursementDate: js.UndefOr[String] = js.native
  var disbursementId: js.UndefOr[String] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var productAmount: js.UndefOr[Amount] = js.native
  var productAmountWithRemittedTax: js.UndefOr[ProductAmount] = js.native
  var transactionDate: js.UndefOr[String] = js.native
}

object OrderReportTransaction {
  @scala.inline
  def apply(): OrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderReportTransaction]
  }
  @scala.inline
  implicit class OrderReportTransactionOps[Self <: OrderReportTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisbursementAmount(value: Price): Self = this.set("disbursementAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementAmount: Self = this.set("disbursementAmount", js.undefined)
    @scala.inline
    def setDisbursementCreationDate(value: String): Self = this.set("disbursementCreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementCreationDate: Self = this.set("disbursementCreationDate", js.undefined)
    @scala.inline
    def setDisbursementDate(value: String): Self = this.set("disbursementDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementDate: Self = this.set("disbursementDate", js.undefined)
    @scala.inline
    def setDisbursementId(value: String): Self = this.set("disbursementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisbursementId: Self = this.set("disbursementId", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    @scala.inline
    def setProductAmount(value: Amount): Self = this.set("productAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductAmount: Self = this.set("productAmount", js.undefined)
    @scala.inline
    def setProductAmountWithRemittedTax(value: ProductAmount): Self = this.set("productAmountWithRemittedTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductAmountWithRemittedTax: Self = this.set("productAmountWithRemittedTax", js.undefined)
    @scala.inline
    def setTransactionDate(value: String): Self = this.set("transactionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionDate: Self = this.set("transactionDate", js.undefined)
  }
  
}

