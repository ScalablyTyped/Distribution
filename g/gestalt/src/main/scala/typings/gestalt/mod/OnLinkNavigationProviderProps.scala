package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLinkNavigationProviderProps extends StObject {
  
  var onNavigation: js.UndefOr[OnNavigationType] = js.undefined
}
object OnLinkNavigationProviderProps {
  
  inline def apply(): OnLinkNavigationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnLinkNavigationProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnLinkNavigationProviderProps] (val x: Self) extends AnyVal {
    
    inline def setOnNavigation(value: /* args */ OnNavigationArgs => js.UndefOr[EventHandlerType | Null]): Self = StObject.set(x, "onNavigation", js.Any.fromFunction1(value))
    
    inline def setOnNavigationUndefined: Self = StObject.set(x, "onNavigation", js.undefined)
  }
}
