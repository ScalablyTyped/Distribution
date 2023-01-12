package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPan extends StObject {
  
  var allowPan: js.UndefOr[Boolean] = js.undefined
  
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  
  var allowZoom: js.UndefOr[Boolean] = js.undefined
}
object AllowPan {
  
  inline def apply(): AllowPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowPan] (val x: Self) extends AnyVal {
    
    inline def setAllowPan(value: Boolean): Self = StObject.set(x, "allowPan", value.asInstanceOf[js.Any])
    
    inline def setAllowPanUndefined: Self = StObject.set(x, "allowPan", js.undefined)
    
    inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
    
    inline def setAllowZoom(value: Boolean): Self = StObject.set(x, "allowZoom", value.asInstanceOf[js.Any])
    
    inline def setAllowZoomUndefined: Self = StObject.set(x, "allowZoom", js.undefined)
  }
}
