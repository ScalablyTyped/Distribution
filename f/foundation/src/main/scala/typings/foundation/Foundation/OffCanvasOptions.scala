package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/offcanvas.html#optional-javascript-configuration
trait OffCanvasOptions extends StObject {
  
  var close_on_click: js.UndefOr[Boolean] = js.undefined
  
  var open_method: js.UndefOr[String] = js.undefined
}
object OffCanvasOptions {
  
  inline def apply(): OffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffCanvasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffCanvasOptions] (val x: Self) extends AnyVal {
    
    inline def setClose_on_click(value: Boolean): Self = StObject.set(x, "close_on_click", value.asInstanceOf[js.Any])
    
    inline def setClose_on_clickUndefined: Self = StObject.set(x, "close_on_click", js.undefined)
    
    inline def setOpen_method(value: String): Self = StObject.set(x, "open_method", value.asInstanceOf[js.Any])
    
    inline def setOpen_methodUndefined: Self = StObject.set(x, "open_method", js.undefined)
  }
}
