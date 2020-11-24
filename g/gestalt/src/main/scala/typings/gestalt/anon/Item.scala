package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var event: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement] = js.native
  
  var item: js.UndefOr[Label | Null] = js.native
}
object Item {
  
  @scala.inline
  def apply(event: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement]): Item = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: FocusEvent[HTMLInputElement] | KeyboardEvent[HTMLInputElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Label): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setItemNull: Self = this.set("item", null)
  }
}
