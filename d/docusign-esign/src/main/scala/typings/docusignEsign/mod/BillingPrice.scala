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
  
  @scala.inline
  def apply(): BillingPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPrice]
  }
  
  @scala.inline
  implicit class BillingPriceMutableBuilder[Self <: BillingPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginQuantity(value: String): Self = StObject.set(x, "beginQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginQuantityUndefined: Self = StObject.set(x, "beginQuantity", js.undefined)
    
    @scala.inline
    def setEndQuantity(value: String): Self = StObject.set(x, "endQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndQuantityUndefined: Self = StObject.set(x, "endQuantity", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
