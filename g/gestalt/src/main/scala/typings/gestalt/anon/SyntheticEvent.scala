package typings.gestalt.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntheticEvent extends StObject {
  
  var syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]
  
  var value: String
}
object SyntheticEvent {
  
  inline def apply(
    syntheticEvent: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event],
    value: String
  ): SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntheticEvent] (val x: Self) extends AnyVal {
    
    inline def setSyntheticEvent(value: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = StObject.set(x, "syntheticEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
