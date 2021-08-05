package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingDiscount extends StObject {
  
  /**
    * Reserved: TBD
    */
  var beginQuantity: js.UndefOr[String] = js.undefined
  
  var discount: js.UndefOr[String] = js.undefined
  
  var endQuantity: js.UndefOr[String] = js.undefined
}
object BillingDiscount {
  
  inline def apply(): BillingDiscount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDiscount]
  }
  
  extension [Self <: BillingDiscount](x: Self) {
    
    inline def setBeginQuantity(value: String): Self = StObject.set(x, "beginQuantity", value.asInstanceOf[js.Any])
    
    inline def setBeginQuantityUndefined: Self = StObject.set(x, "beginQuantity", js.undefined)
    
    inline def setDiscount(value: String): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setEndQuantity(value: String): Self = StObject.set(x, "endQuantity", value.asInstanceOf[js.Any])
    
    inline def setEndQuantityUndefined: Self = StObject.set(x, "endQuantity", js.undefined)
  }
}
