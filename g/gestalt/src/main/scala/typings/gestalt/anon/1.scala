package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
}
object `1` {
  
  inline def apply(
    dangerouslyDisableOnNavigation: () => Unit,
    event: (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
  ): `1` = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = js.Any.fromFunction0(dangerouslyDisableOnNavigation), event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setEvent(value: (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
