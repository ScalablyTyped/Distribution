package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDescriptor extends StObject {
  
  var defaultMessage: js.UndefOr[String | js.Array[MessageFormatElement]] = js.undefined
  
  var description: js.UndefOr[String | js.Object] = js.undefined
  
  var id: js.UndefOr[MessageIds] = js.undefined
}
object MessageDescriptor {
  
  inline def apply(): MessageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageDescriptor]
  }
  
  extension [Self <: MessageDescriptor](x: Self) {
    
    inline def setDefaultMessage(value: String | js.Array[MessageFormatElement]): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    inline def setDefaultMessageVarargs(value: MessageFormatElement*): Self = StObject.set(x, "defaultMessage", js.Array(value*))
    
    inline def setDescription(value: String | js.Object): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: MessageIds): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
