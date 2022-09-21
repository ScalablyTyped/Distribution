package typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOption extends StObject {
  
  var id: String
  
  var location: js.UndefOr[Location] = js.undefined
  
  var value: js.Array[MessageFormatElement]
}
object SelectOption {
  
  inline def apply(id: String, value: js.Array[MessageFormatElement]): SelectOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
  
  extension [Self <: SelectOption](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setValue(value: js.Array[MessageFormatElement]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: MessageFormatElement*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
