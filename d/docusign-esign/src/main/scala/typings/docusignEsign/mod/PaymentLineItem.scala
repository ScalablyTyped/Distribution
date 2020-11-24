package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentLineItem extends js.Object {
  
  /**
    * This is a the `tabLabel`
    * that specifies the amount paid
    * for the line items.
    *
    *
    */
  var amountReference: js.UndefOr[String] = js.native
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This is the sender-defined
    * SKU, inventory number, or other item code
    * for the line item.
    *
    */
  var itemCode: js.UndefOr[String] = js.native
  
  /**
    * This is a sender-defined
    * product name, service name,
    * or other designation for the line item.
    *
    */
  var name: js.UndefOr[String] = js.native
}
object PaymentLineItem {
  
  @scala.inline
  def apply(): PaymentLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentLineItem]
  }
  
  @scala.inline
  implicit class PaymentLineItemOps[Self <: PaymentLineItem] (val x: Self) extends AnyVal {
    
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
    def setAmountReference(value: String): Self = this.set("amountReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountReference: Self = this.set("amountReference", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setItemCode(value: String): Self = this.set("itemCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCode: Self = this.set("itemCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
