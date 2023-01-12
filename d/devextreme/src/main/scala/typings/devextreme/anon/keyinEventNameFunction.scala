package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in devextreme.devextreme.DevExpress.core.EventName ]:? std.Function} */
trait keyinEventNameFunction extends StObject {
  
  var orientationChanged: js.UndefOr[js.Function] = js.undefined
}
object keyinEventNameFunction {
  
  inline def apply(): keyinEventNameFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinEventNameFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinEventNameFunction] (val x: Self) extends AnyVal {
    
    inline def setOrientationChanged(value: js.Function): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    
    inline def setOrientationChangedUndefined: Self = StObject.set(x, "orientationChanged", js.undefined)
  }
}
