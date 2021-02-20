package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodWithOptions extends StObject {
  
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
  implicit class PaymentMethodWithOptionsMutableBuilder[Self <: PaymentMethodWithOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportedOptions(value: js.Array[String]): Self = StObject.set(x, "supportedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOptionsUndefined: Self = StObject.set(x, "supportedOptions", js.undefined)
    
    @scala.inline
    def setSupportedOptionsVarargs(value: String*): Self = StObject.set(x, "supportedOptions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
