package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductAmount extends js.Object {
  
  var priceAmount: js.UndefOr[Price] = js.native
  
  var remittedTaxAmount: js.UndefOr[Price] = js.native
  
  var taxAmount: js.UndefOr[Price] = js.native
}
object ProductAmount {
  
  @scala.inline
  def apply(): ProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAmount]
  }
  
  @scala.inline
  implicit class ProductAmountOps[Self <: ProductAmount] (val x: Self) extends AnyVal {
    
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
    def setPriceAmount(value: Price): Self = this.set("priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAmount: Self = this.set("priceAmount", js.undefined)
    
    @scala.inline
    def setRemittedTaxAmount(value: Price): Self = this.set("remittedTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemittedTaxAmount: Self = this.set("remittedTaxAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
  }
}
