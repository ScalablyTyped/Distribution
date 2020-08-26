package typings.firebaseStorage.anon

import typings.firebaseStorageTypes.mod.TaskEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STATECHANGED extends js.Object {
  var STATE_CHANGED: TaskEvent = js.native
}

object STATECHANGED {
  @scala.inline
  def apply(STATE_CHANGED: TaskEvent): STATECHANGED = {
    val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATECHANGED]
  }
  @scala.inline
  implicit class STATECHANGEDOps[Self <: STATECHANGED] (val x: Self) extends AnyVal {
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
    def setSTATE_CHANGED(value: TaskEvent): Self = this.set("STATE_CHANGED", value.asInstanceOf[js.Any])
  }
  
}

