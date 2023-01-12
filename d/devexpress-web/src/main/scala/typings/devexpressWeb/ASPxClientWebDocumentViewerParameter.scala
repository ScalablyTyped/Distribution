package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerParameter extends StObject {
  
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor
  
  var isMultiValue: Boolean
  
  var `type`: Any
  
  var value: Any
}
object ASPxClientWebDocumentViewerParameter {
  
  inline def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: Boolean,
    `type`: Any,
    value: Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientWebDocumentViewerParameter] (val x: Self) extends AnyVal {
    
    inline def setGetParameterDescriptor(value: () => ASPxDesignerElementParameterDescriptor): Self = StObject.set(x, "getParameterDescriptor", js.Any.fromFunction0(value))
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "isMultiValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
