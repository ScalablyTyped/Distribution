package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodWithOptions extends js.Object {
  
  /**
    * The payment options that are compatible with the payment method in the `type` property.
    *
    * Possible values are:
    *
    * - `save`
    * - `save_and_authorize`
    * - `authorize`
    */
  var supportedOptions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of a payment method that the gateway accepts.
    *
    * Possible values are:
    *
    * - `CreditCard`
    * - `ApplePay`
    * - `AndroidPay`
    * - `BankAccount`
    * - `PayPal`
    */
  var `type`: js.UndefOr[String] = js.native
}
object PaymentMethodWithOptions {
  
  @scala.inline
  def apply(): PaymentMethodWithOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodWithOptions]
  }
  
  @scala.inline
  implicit class PaymentMethodWithOptionsOps[Self <: PaymentMethodWithOptions] (val x: Self) extends AnyVal {
    
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
    def setSupportedOptionsVarargs(value: String*): Self = this.set("supportedOptions", js.Array(value :_*))
    
    @scala.inline
    def setSupportedOptions(value: js.Array[String]): Self = this.set("supportedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedOptions: Self = this.set("supportedOptions", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
