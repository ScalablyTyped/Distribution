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
  
  inline def apply(): PaymentLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentLineItem]
  }
  
  extension [Self <: PaymentLineItem](x: Self) {
    
    inline def setAmountReference(value: String): Self = StObject.set(x, "amountReference", value.asInstanceOf[js.Any])
    
    inline def setAmountReferenceUndefined: Self = StObject.set(x, "amountReference", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setItemCode(value: String): Self = StObject.set(x, "itemCode", value.asInstanceOf[js.Any])
    
    inline def setItemCodeUndefined: Self = StObject.set(x, "itemCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
