package typings.gestalt.anon

import typings.gestalt.mod.ComboBoxItemType
import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var event: (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]) | KeyboardEvent[HTMLInputElement]
  
  var item: ComboBoxItemType
}
object Item {
  
  inline def apply(
    event: (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]) | KeyboardEvent[HTMLInputElement],
    item: ComboBoxItemType
  ): Item = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setEvent(
      value: (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]) | KeyboardEvent[HTMLInputElement]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ComboBoxItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
