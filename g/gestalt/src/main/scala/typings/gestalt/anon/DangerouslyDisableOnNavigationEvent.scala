package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerouslyDisableOnNavigationEvent extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
}
object DangerouslyDisableOnNavigationEvent {
  
  inline def apply(
    dangerouslyDisableOnNavigation: () => Unit,
    event: (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
  ): DangerouslyDisableOnNavigationEvent = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = js.Any.fromFunction0(dangerouslyDisableOnNavigation), event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerouslyDisableOnNavigationEvent]
  }
  
  extension [Self <: DangerouslyDisableOnNavigationEvent](x: Self) {
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setEvent(
      value: (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
