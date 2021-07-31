package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentLineItem extends StObject {
  
  /**
    * This is a the `tabLabel`
    * that specifies the amount paid
    * for the line items.
    *
    *
    */
  var amountReference: js.UndefOr[String] = js.undefined
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This is the sender-defined
    * SKU, inventory number, or other item code
    * for the line item.
    *
    */
  var itemCode: js.UndefOr[String] = js.undefined
  
  /**
    * This is a sender-defined
    * product name, service name,
    * or other designation for the line item.
    *
    */
  var name: js.UndefOr[String] = js.undefined
}
object PaymentLineItem {
  
  @scala.inline
  def apply(): PaymentLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentLineItem]
  }
  
  @scala.inline
  implicit class PaymentLineItemMutableBuilder[Self <: PaymentLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountReference(value: String): Self = StObject.set(x, "amountReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountReferenceUndefined: Self = StObject.set(x, "amountReference", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setItemCode(value: String): Self = StObject.set(x, "itemCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCodeUndefined: Self = StObject.set(x, "itemCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
