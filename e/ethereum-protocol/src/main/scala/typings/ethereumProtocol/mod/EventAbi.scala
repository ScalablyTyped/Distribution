package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAbi extends AbiDefinition {
  var anonymous: Boolean = js.native
  var inputs: js.Array[EventParameter] = js.native
  var name: String = js.native
  var `type`: Event = js.native
}

object EventAbi {
  @scala.inline
  def apply(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAbi]
  }
  @scala.inline
  implicit class EventAbiOps[Self <: EventAbi] (val x: Self) extends AnyVal {
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: EventParameter*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[EventParameter]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Event): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

