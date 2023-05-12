package typings.domNavigation

import typings.domNavigation.domNavigationStrings.`after-transition`
import typings.domNavigation.domNavigationStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInterceptOptions extends StObject {
  
  var focusReset: js.UndefOr[`after-transition` | manual] = js.undefined
  
  var handler: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var scroll: js.UndefOr[`after-transition` | manual] = js.undefined
}
object NavigationInterceptOptions {
  
  inline def apply(): NavigationInterceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationInterceptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationInterceptOptions] (val x: Self) extends AnyVal {
    
    inline def setFocusReset(value: `after-transition` | manual): Self = StObject.set(x, "focusReset", value.asInstanceOf[js.Any])
    
    inline def setFocusResetUndefined: Self = StObject.set(x, "focusReset", js.undefined)
    
    inline def setHandler(value: () => js.Promise[Unit]): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setScroll(value: `after-transition` | manual): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
