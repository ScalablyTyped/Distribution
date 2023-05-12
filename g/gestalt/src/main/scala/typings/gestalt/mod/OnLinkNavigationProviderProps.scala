package typings.gestalt.mod

import typings.gestalt.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLinkNavigationProviderProps extends StObject {
  
  var children: Node
  
  var onNavigation: js.UndefOr[js.Function1[/* args */ Href, js.UndefOr[EventHandlerType | Null]]] = js.undefined
}
object OnLinkNavigationProviderProps {
  
  inline def apply(): OnLinkNavigationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnLinkNavigationProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnLinkNavigationProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnNavigation(value: /* args */ Href => js.UndefOr[EventHandlerType | Null]): Self = StObject.set(x, "onNavigation", js.Any.fromFunction1(value))
    
    inline def setOnNavigationUndefined: Self = StObject.set(x, "onNavigation", js.undefined)
  }
}
