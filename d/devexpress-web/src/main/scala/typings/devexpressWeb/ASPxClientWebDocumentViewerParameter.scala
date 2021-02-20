package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientWebDocumentViewerParameter extends StObject {
  
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor = js.native
  
  var isMultiValue: Boolean = js.native
  
  var `type`: js.Any = js.native
  
  var value: js.Any = js.native
}
object ASPxClientWebDocumentViewerParameter {
  
  @scala.inline
  def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: Boolean,
    `type`: js.Any,
    value: js.Any
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerParameterMutableBuilder[Self <: ASPxClientWebDocumentViewerParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetParameterDescriptor(value: () => ASPxDesignerElementParameterDescriptor): Self = StObject.set(x, "getParameterDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMultiValue(value: Boolean): Self = StObject.set(x, "isMultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
