package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
}
object `0` {
  
  inline def apply(
    event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
  ): `0` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setEvent(
      value: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
