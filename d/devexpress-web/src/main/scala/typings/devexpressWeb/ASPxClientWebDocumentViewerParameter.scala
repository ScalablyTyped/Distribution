package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerParameter extends StObject {
  
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor
  
  var isMultiValue: Boolean
  
  var `type`: js.Any
  
  var value: js.Any
}
object ASPxClientWebDocumentViewerParameter {
  
  inline def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: Boolean,
    `type`: js.Any,
    value: js.Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  
  extension [Self <: ASPxClientWebDocumentViewerParameter](x: Self) {
    
    inline def setGetParameterDescriptor(value: () => ASPxDesignerElementParameterDescriptor): Self = StObject.set(x, "getParameterDescriptor", js.Any.fromFunction0(value))
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "isMultiValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
