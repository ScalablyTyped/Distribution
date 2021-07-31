package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  var hide: js.UndefOr[animationConfig] = js.undefined
  
  var show: js.UndefOr[animationConfig] = js.undefined
}
object Hide {
  
  @scala.inline
  def apply(): Hide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: animationConfig): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setShow(value: animationConfig): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
