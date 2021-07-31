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
  
  @scala.inline
  def apply(): BillingDiscount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDiscount]
  }
  
  @scala.inline
  implicit class BillingDiscountMutableBuilder[Self <: BillingDiscount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginQuantity(value: String): Self = StObject.set(x, "beginQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginQuantityUndefined: Self = StObject.set(x, "beginQuantity", js.undefined)
    
    @scala.inline
    def setDiscount(value: String): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    @scala.inline
    def setEndQuantity(value: String): Self = StObject.set(x, "endQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndQuantityUndefined: Self = StObject.set(x, "endQuantity", js.undefined)
  }
}
