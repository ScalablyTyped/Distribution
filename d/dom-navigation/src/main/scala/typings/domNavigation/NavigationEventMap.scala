package typings.domNavigation

import typings.std.ErrorEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventMap extends StObject {
  
  var currententrychange: NavigationCurrentEntryChangeEvent
  
  var navigate: NavigateEvent
  
  var navigateerror: ErrorEvent
  
  var navigatesuccess: Event
}
object NavigationEventMap {
  
  inline def apply(
    currententrychange: NavigationCurrentEntryChangeEvent,
    navigate: NavigateEvent,
    navigateerror: ErrorEvent,
    navigatesuccess: Event
  ): NavigationEventMap = {
    val __obj = js.Dynamic.literal(currententrychange = currententrychange.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], navigateerror = navigateerror.asInstanceOf[js.Any], navigatesuccess = navigatesuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationEventMap] (val x: Self) extends AnyVal {
    
    inline def setCurrententrychange(value: NavigationCurrentEntryChangeEvent): Self = StObject.set(x, "currententrychange", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: NavigateEvent): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
    
    inline def setNavigateerror(value: ErrorEvent): Self = StObject.set(x, "navigateerror", value.asInstanceOf[js.Any])
    
    inline def setNavigatesuccess(value: Event): Self = StObject.set(x, "navigatesuccess", value.asInstanceOf[js.Any])
  }
}
