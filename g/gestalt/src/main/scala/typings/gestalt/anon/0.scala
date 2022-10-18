package typings.gestalt.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val event: typings.react.mod.SyntheticEvent[Element, typings.std.Event]
}
object `0` {
  
  inline def apply(event: typings.react.mod.SyntheticEvent[Element, typings.std.Event]): `0` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
