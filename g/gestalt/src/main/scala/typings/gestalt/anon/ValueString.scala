package typings.gestalt.anon

import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueString extends js.Object {
  
  var event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event] = js.native
  
  var value: String = js.native
}
object ValueString {
  
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event], value: String): ValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit class ValueStringOps[Self <: ValueString] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
