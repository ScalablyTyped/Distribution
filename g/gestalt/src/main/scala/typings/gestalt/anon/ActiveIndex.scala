package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIndex extends StObject {
  
  var activeIndex: Double
  
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}
object ActiveIndex {
  
  inline def apply(
    activeIndex: Double,
    event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  
  extension [Self <: ActiveIndex](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
