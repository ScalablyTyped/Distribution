package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTabIndex extends StObject {
  
  var activeTabIndex: Double
  
  var dangerouslydangerouslyDisableOnNavigation: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ActiveTabIndex {
  
  inline def apply(activeTabIndex: Double): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveTabIndex] (val x: Self) extends AnyVal {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setDangerouslydangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslydangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setDangerouslydangerouslyDisableOnNavigationUndefined: Self = StObject.set(x, "dangerouslydangerouslyDisableOnNavigation", js.undefined)
  }
}
