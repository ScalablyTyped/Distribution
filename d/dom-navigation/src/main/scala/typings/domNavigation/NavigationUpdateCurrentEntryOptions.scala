package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationUpdateCurrentEntryOptions extends StObject {
  
  var state: Any
}
object NavigationUpdateCurrentEntryOptions {
  
  inline def apply(state: Any): NavigationUpdateCurrentEntryOptions = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationUpdateCurrentEntryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationUpdateCurrentEntryOptions] (val x: Self) extends AnyVal {
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
