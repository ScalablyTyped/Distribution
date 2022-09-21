package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var supportedOptions: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var `type`: js.UndefOr[String] = js.undefined
}
object PaymentMethodWithOptions {
  
  inline def apply(): PaymentMethodWithOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodWithOptions]
  }
  
  extension [Self <: PaymentMethodWithOptions](x: Self) {
    
    inline def setSupportedOptions(value: js.Array[String]): Self = StObject.set(x, "supportedOptions", value.asInstanceOf[js.Any])
    
    inline def setSupportedOptionsUndefined: Self = StObject.set(x, "supportedOptions", js.undefined)
    
    inline def setSupportedOptionsVarargs(value: String*): Self = StObject.set(x, "supportedOptions", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
