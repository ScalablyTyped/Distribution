package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeatDiscount extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var beginSeatCount: js.UndefOr[String] = js.native
  
  /**
    * The percent of the discount.
    *
    * Example: `"0.00"`
    */
  var discountPercent: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var endSeatCount: js.UndefOr[String] = js.native
}
object SeatDiscount {
  
  @scala.inline
  def apply(): SeatDiscount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeatDiscount]
  }
  
  @scala.inline
  implicit class SeatDiscountMutableBuilder[Self <: SeatDiscount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginSeatCount(value: String): Self = StObject.set(x, "beginSeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginSeatCountUndefined: Self = StObject.set(x, "beginSeatCount", js.undefined)
    
    @scala.inline
    def setDiscountPercent(value: String): Self = StObject.set(x, "discountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountPercentUndefined: Self = StObject.set(x, "discountPercent", js.undefined)
    
    @scala.inline
    def setEndSeatCount(value: String): Self = StObject.set(x, "endSeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSeatCountUndefined: Self = StObject.set(x, "endSeatCount", js.undefined)
  }
}
