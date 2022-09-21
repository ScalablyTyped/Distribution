package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentityInputOption extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var phoneNumberList: js.UndefOr[js.Array[RecipientIdentityPhoneNumber]] = js.undefined
  
  var valueType: js.UndefOr[String] = js.undefined
}
object RecipientIdentityInputOption {
  
  inline def apply(): RecipientIdentityInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityInputOption]
  }
  
  extension [Self <: RecipientIdentityInputOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumberList(value: js.Array[RecipientIdentityPhoneNumber]): Self = StObject.set(x, "phoneNumberList", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberListUndefined: Self = StObject.set(x, "phoneNumberList", js.undefined)
    
    inline def setPhoneNumberListVarargs(value: RecipientIdentityPhoneNumber*): Self = StObject.set(x, "phoneNumberList", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
