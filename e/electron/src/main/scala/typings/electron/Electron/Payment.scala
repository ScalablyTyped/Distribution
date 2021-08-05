package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payment extends StObject {
  
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
  
  inline def apply(productIdentifier: String, quantity: Double): Payment = {
    val __obj = js.Dynamic.literal(productIdentifier = productIdentifier.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  
  extension [Self <: Payment](x: Self) {
    
    inline def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
