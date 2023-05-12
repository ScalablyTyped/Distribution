package typings.domNavigation

import typings.domNavigation.domNavigationStrings.auto
import typings.domNavigation.domNavigationStrings.push
import typings.domNavigation.domNavigationStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigateOptions
  extends StObject
     with NavigationOptions {
  
  var history: js.UndefOr[auto | push | replace] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object NavigationNavigateOptions {
  
  inline def apply(): NavigationNavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationNavigateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationNavigateOptions] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: auto | push | replace): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
