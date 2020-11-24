package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPrice extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var beginQuantity: js.UndefOr[String] = js.native
  
  var endQuantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.native
}
object BillingPrice {
  
  @scala.inline
  def apply(): BillingPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPrice]
  }
  
  @scala.inline
  implicit class BillingPriceOps[Self <: BillingPrice] (val x: Self) extends AnyVal {
    
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
    def setBeginQuantity(value: String): Self = this.set("beginQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginQuantity: Self = this.set("beginQuantity", js.undefined)
    
    @scala.inline
    def setEndQuantity(value: String): Self = this.set("endQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndQuantity: Self = this.set("endQuantity", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: String): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
}
