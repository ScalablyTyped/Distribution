package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment extends js.Object {
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var paymentAmount: js.UndefOr[String] = js.native
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.native
  var paymentDate: js.UndefOr[String] = js.native
}

object Payment {
  @scala.inline
  def apply(): Payment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payment]
  }
  @scala.inline
  implicit class PaymentOps[Self <: Payment] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPaymentAmount(value: String): Self = this.set("paymentAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentAmount: Self = this.set("paymentAmount", js.undefined)
    @scala.inline
    def setPaymentAmountCurrencyCode(value: String): Self = this.set("paymentAmountCurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentAmountCurrencyCode: Self = this.set("paymentAmountCurrencyCode", js.undefined)
    @scala.inline
    def setPaymentDate(value: String): Self = this.set("paymentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentDate: Self = this.set("paymentDate", js.undefined)
  }
  
}

