package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.AnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxOverlayAnimation extends StObject {
  
  /**
    * An object that defines the animation properties used when the UI component is being hidden.
    */
  var hide: js.UndefOr[AnimationConfig] = js.undefined
  
  /**
    * An object that defines the animation properties used when the UI component is being shown.
    */
  var show: js.UndefOr[AnimationConfig] = js.undefined
}
object dxOverlayAnimation {
  
  inline def apply(): dxOverlayAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxOverlayAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxOverlayAnimation] (val x: Self) extends AnyVal {
    
    inline def setHide(value: AnimationConfig): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: AnimationConfig): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
