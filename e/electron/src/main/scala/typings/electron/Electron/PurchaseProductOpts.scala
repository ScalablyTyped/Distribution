package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseProductOpts extends StObject {
  
  /**
    * The number of items the user wants to purchase.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The string that associates the transaction with a user account on your service
    * (applicationUsername).
    */
  var username: js.UndefOr[String] = js.undefined
}
object PurchaseProductOpts {
  
  inline def apply(): PurchaseProductOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseProductOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseProductOpts] (val x: Self) extends AnyVal {
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
