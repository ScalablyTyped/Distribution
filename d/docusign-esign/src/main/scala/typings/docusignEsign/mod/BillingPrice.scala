package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPrice extends StObject {
  
  /**
    * Reserved: TBD
    */
  var beginQuantity: js.UndefOr[String] = js.undefined
  
  var endQuantity: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.undefined
}
object BillingPrice {
  
  inline def apply(): BillingPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPrice] (val x: Self) extends AnyVal {
    
    inline def setBeginQuantity(value: String): Self = StObject.set(x, "beginQuantity", value.asInstanceOf[js.Any])
    
    inline def setBeginQuantityUndefined: Self = StObject.set(x, "beginQuantity", js.undefined)
    
    inline def setEndQuantity(value: String): Self = StObject.set(x, "endQuantity", value.asInstanceOf[js.Any])
    
    inline def setEndQuantityUndefined: Self = StObject.set(x, "endQuantity", js.undefined)
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
