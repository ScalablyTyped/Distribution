package typings.gestalt.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]
}
object `2` {
  
  inline def apply(event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
