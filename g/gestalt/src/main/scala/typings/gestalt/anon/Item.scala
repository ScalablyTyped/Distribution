package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var event: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement]
  
  var item: js.UndefOr[Label | Null] = js.undefined
}
object Item {
  
  @scala.inline
  def apply(event: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement]): Item = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Label): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
