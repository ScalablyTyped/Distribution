package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralEventEmitter extends js.Object {
  var addEventListener: js.Function = js.native
  var removeEventListener: js.Function = js.native
}

object GeneralEventEmitter {
  @scala.inline
  def apply(addEventListener: js.Function, removeEventListener: js.Function): GeneralEventEmitter = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralEventEmitter]
  }
  @scala.inline
  implicit class GeneralEventEmitterOps[Self <: GeneralEventEmitter] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: js.Function): Self = this.set("addEventListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: js.Function): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
  }
  
}

