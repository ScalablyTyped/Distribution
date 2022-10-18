package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedHeader extends StObject {
  
  var formattedHeader: String | Null
  
  var formattedParams: String | Null
  
  var formattedReturnType: String | Null
  
  var name: String | Null
}
object FormattedHeader {
  
  inline def apply(): FormattedHeader = {
    val __obj = js.Dynamic.literal(formattedHeader = null, formattedParams = null, formattedReturnType = null, name = null)
    __obj.asInstanceOf[FormattedHeader]
  }
  
  extension [Self <: FormattedHeader](x: Self) {
    
    inline def setFormattedHeader(value: String): Self = StObject.set(x, "formattedHeader", value.asInstanceOf[js.Any])
    
    inline def setFormattedHeaderNull: Self = StObject.set(x, "formattedHeader", null)
    
    inline def setFormattedParams(value: String): Self = StObject.set(x, "formattedParams", value.asInstanceOf[js.Any])
    
    inline def setFormattedParamsNull: Self = StObject.set(x, "formattedParams", null)
    
    inline def setFormattedReturnType(value: String): Self = StObject.set(x, "formattedReturnType", value.asInstanceOf[js.Any])
    
    inline def setFormattedReturnTypeNull: Self = StObject.set(x, "formattedReturnType", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
