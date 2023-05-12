package typings.domNavigation

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationCurrentEntryChangeEventInit
  extends StObject
     with EventInit {
  
  var from: NavigationHistoryEntry
  
  var navigationType: js.UndefOr[NavigationTypeString | Null] = js.undefined
}
object NavigationCurrentEntryChangeEventInit {
  
  inline def apply(from: NavigationHistoryEntry): NavigationCurrentEntryChangeEventInit = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCurrentEntryChangeEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationCurrentEntryChangeEventInit] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: NavigationHistoryEntry): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setNavigationType(value: NavigationTypeString): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
    
    inline def setNavigationTypeNull: Self = StObject.set(x, "navigationType", null)
    
    inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
  }
}
