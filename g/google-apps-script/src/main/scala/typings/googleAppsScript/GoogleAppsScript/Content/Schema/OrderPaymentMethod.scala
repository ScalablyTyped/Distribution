package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderPaymentMethod extends js.Object {
  var billingAddress: js.UndefOr[OrderAddress] = js.native
  var expirationMonth: js.UndefOr[Double] = js.native
  var expirationYear: js.UndefOr[Double] = js.native
  var lastFourDigits: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OrderPaymentMethod {
  @scala.inline
  def apply(): OrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPaymentMethod]
  }
  @scala.inline
  implicit class OrderPaymentMethodOps[Self <: OrderPaymentMethod] (val x: Self) extends AnyVal {
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
    def setBillingAddress(value: OrderAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setExpirationMonth(value: Double): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    @scala.inline
    def setExpirationYear(value: Double): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    @scala.inline
    def setLastFourDigits(value: String): Self = this.set("lastFourDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFourDigits: Self = this.set("lastFourDigits", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

