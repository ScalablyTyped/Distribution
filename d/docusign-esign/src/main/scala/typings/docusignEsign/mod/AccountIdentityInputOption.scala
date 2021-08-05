package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdentityInputOption extends StObject {
  
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  var optionName: js.UndefOr[String] = js.undefined
  
  var valueType: js.UndefOr[String] = js.undefined
}
object AccountIdentityInputOption {
  
  inline def apply(): AccountIdentityInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityInputOption]
  }
  
  extension [Self <: AccountIdentityInputOption](x: Self) {
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setOptionName(value: String): Self = StObject.set(x, "optionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "optionName", js.undefined)
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
