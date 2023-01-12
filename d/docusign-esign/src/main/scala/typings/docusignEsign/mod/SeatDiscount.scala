package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeatDiscount extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var beginSeatCount: js.UndefOr[String] = js.undefined
  
  /**
    * The percent of the discount.
    *
    * Example: `"0.00"`
    */
  var discountPercent: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var endSeatCount: js.UndefOr[String] = js.undefined
}
object SeatDiscount {
  
  inline def apply(): SeatDiscount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeatDiscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeatDiscount] (val x: Self) extends AnyVal {
    
    inline def setBeginSeatCount(value: String): Self = StObject.set(x, "beginSeatCount", value.asInstanceOf[js.Any])
    
    inline def setBeginSeatCountUndefined: Self = StObject.set(x, "beginSeatCount", js.undefined)
    
    inline def setDiscountPercent(value: String): Self = StObject.set(x, "discountPercent", value.asInstanceOf[js.Any])
    
    inline def setDiscountPercentUndefined: Self = StObject.set(x, "discountPercent", js.undefined)
    
    inline def setEndSeatCount(value: String): Self = StObject.set(x, "endSeatCount", value.asInstanceOf[js.Any])
    
    inline def setEndSeatCountUndefined: Self = StObject.set(x, "endSeatCount", js.undefined)
  }
}
