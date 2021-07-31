package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTabIndex extends StObject {
  
  var activeTabIndex: Double
  
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}
object ActiveTabIndex {
  
  @scala.inline
  def apply(
    activeTabIndex: Double,
    event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  
  @scala.inline
  implicit class ActiveTabIndexMutableBuilder[Self <: ActiveTabIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
