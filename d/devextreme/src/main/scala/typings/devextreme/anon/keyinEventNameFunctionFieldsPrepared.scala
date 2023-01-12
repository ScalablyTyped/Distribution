package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in devextreme.devextreme.DevExpress.data.PivotGridDataSource.EventName ]:? std.Function} */
trait keyinEventNameFunctionFieldsPrepared extends StObject {
  
  var changed: js.UndefOr[js.Function] = js.undefined
  
  var fieldsPrepared: js.UndefOr[js.Function] = js.undefined
  
  var loadError: js.UndefOr[js.Function] = js.undefined
  
  var loadingChanged: js.UndefOr[js.Function] = js.undefined
}
object keyinEventNameFunctionFieldsPrepared {
  
  inline def apply(): keyinEventNameFunctionFieldsPrepared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinEventNameFunctionFieldsPrepared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinEventNameFunctionFieldsPrepared] (val x: Self) extends AnyVal {
    
    inline def setChanged(value: js.Function): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setFieldsPrepared(value: js.Function): Self = StObject.set(x, "fieldsPrepared", value.asInstanceOf[js.Any])
    
    inline def setFieldsPreparedUndefined: Self = StObject.set(x, "fieldsPrepared", js.undefined)
    
    inline def setLoadError(value: js.Function): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    inline def setLoadingChanged(value: js.Function): Self = StObject.set(x, "loadingChanged", value.asInstanceOf[js.Any])
    
    inline def setLoadingChangedUndefined: Self = StObject.set(x, "loadingChanged", js.undefined)
  }
}
