package typings.digitalGoodsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseDetails extends StObject {
  
  var itemId: String
  
  var purchaseToken: String
}
object PurchaseDetails {
  
  inline def apply(itemId: String, purchaseToken: String): PurchaseDetails = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], purchaseToken = purchaseToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseDetails] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
  }
}
