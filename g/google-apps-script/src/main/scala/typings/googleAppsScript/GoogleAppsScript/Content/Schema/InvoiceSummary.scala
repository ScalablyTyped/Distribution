package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceSummary extends js.Object {
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.native
  var customerBalance: js.UndefOr[Amount] = js.native
  var googleBalance: js.UndefOr[Amount] = js.native
  var merchantBalance: js.UndefOr[Amount] = js.native
  var productTotal: js.UndefOr[Amount] = js.native
  var promotionSummaries: js.UndefOr[js.Array[Promotion]] = js.native
}

object InvoiceSummary {
  @scala.inline
  def apply(): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummary]
  }
  @scala.inline
  implicit class InvoiceSummaryOps[Self <: InvoiceSummary] (val x: Self) extends AnyVal {
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
    def setAdditionalChargeSummariesVarargs(value: InvoiceSummaryAdditionalChargeSummary*): Self = this.set("additionalChargeSummaries", js.Array(value :_*))
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[InvoiceSummaryAdditionalChargeSummary]): Self = this.set("additionalChargeSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalChargeSummaries: Self = this.set("additionalChargeSummaries", js.undefined)
    @scala.inline
    def setCustomerBalance(value: Amount): Self = this.set("customerBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerBalance: Self = this.set("customerBalance", js.undefined)
    @scala.inline
    def setGoogleBalance(value: Amount): Self = this.set("googleBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleBalance: Self = this.set("googleBalance", js.undefined)
    @scala.inline
    def setMerchantBalance(value: Amount): Self = this.set("merchantBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantBalance: Self = this.set("merchantBalance", js.undefined)
    @scala.inline
    def setProductTotal(value: Amount): Self = this.set("productTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTotal: Self = this.set("productTotal", js.undefined)
    @scala.inline
    def setPromotionSummariesVarargs(value: Promotion*): Self = this.set("promotionSummaries", js.Array(value :_*))
    @scala.inline
    def setPromotionSummaries(value: js.Array[Promotion]): Self = this.set("promotionSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionSummaries: Self = this.set("promotionSummaries", js.undefined)
  }
  
}

