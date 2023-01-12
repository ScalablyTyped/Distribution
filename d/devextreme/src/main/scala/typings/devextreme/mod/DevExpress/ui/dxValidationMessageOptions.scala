package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidationMessageOptions
  extends StObject
     with dxOverlayOptions[dxValidationMessage] {
  
  var boundary: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[js.Object] = js.undefined
  
  var positionRequest: js.UndefOr[String] = js.undefined
  
  var validationErrors: js.UndefOr[js.Array[js.Object] | Null] = js.undefined
}
object dxValidationMessageOptions {
  
  inline def apply(): dxValidationMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxValidationMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setBoundary(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOffset(value: js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPositionRequest(value: String): Self = StObject.set(x, "positionRequest", value.asInstanceOf[js.Any])
    
    inline def setPositionRequestUndefined: Self = StObject.set(x, "positionRequest", js.undefined)
    
    inline def setValidationErrors(value: js.Array[js.Object]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsNull: Self = StObject.set(x, "validationErrors", null)
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: js.Object*): Self = StObject.set(x, "validationErrors", js.Array(value*))
  }
}
