package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payment extends StObject {
  
  /**
    * An opaque identifier for the user’s account on your system.
    */
  var applicationUsername: String
  
  /**
    * The details of the discount offer to apply to the payment.
    */
  var paymentDiscount: js.UndefOr[PaymentDiscount] = js.undefined
  
  /**
    * The identifier of the purchased product.
    */
  var productIdentifier: String
  
  /**
    * The quantity purchased.
    */
  var quantity: Double
}
object Payment {
  
  inline def apply(applicationUsername: String, productIdentifier: String, quantity: Double): Payment = {
    val __obj = js.Dynamic.literal(applicationUsername = applicationUsername.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
    
    inline def setApplicationUsername(value: String): Self = StObject.set(x, "applicationUsername", value.asInstanceOf[js.Any])
    
    inline def setPaymentDiscount(value: PaymentDiscount): Self = StObject.set(x, "paymentDiscount", value.asInstanceOf[js.Any])
    
    inline def setPaymentDiscountUndefined: Self = StObject.set(x, "paymentDiscount", js.undefined)
    
    inline def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
