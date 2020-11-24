package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeatDiscount extends js.Object {
  
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
  implicit class SeatDiscountOps[Self <: SeatDiscount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginSeatCount(value: String): Self = this.set("beginSeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginSeatCount: Self = this.set("beginSeatCount", js.undefined)
    
    @scala.inline
    def setDiscountPercent(value: String): Self = this.set("discountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscountPercent: Self = this.set("discountPercent", js.undefined)
    
    @scala.inline
    def setEndSeatCount(value: String): Self = this.set("endSeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndSeatCount: Self = this.set("endSeatCount", js.undefined)
  }
}
