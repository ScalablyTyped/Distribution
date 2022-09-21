package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTabIndex extends StObject {
  
  var activeTabIndex: Double
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}
object ActiveTabIndex {
  
  inline def apply(
    activeTabIndex: Double,
    dangerouslyDisableOnNavigation: () => Unit,
    event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], dangerouslyDisableOnNavigation = js.Any.fromFunction0(dangerouslyDisableOnNavigation), event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  
  extension [Self <: ActiveTabIndex](x: Self) {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
