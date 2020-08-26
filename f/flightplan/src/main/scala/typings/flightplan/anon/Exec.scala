package typings.flightplan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec extends js.Object {
  var exec: js.Any = js.native
}

object Exec {
  @scala.inline
  def apply(exec: js.Any): Exec = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exec]
  }
  @scala.inline
  implicit class ExecOps[Self <: Exec] (val x: Self) extends AnyVal {
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
    def setExec(value: js.Any): Self = this.set("exec", value.asInstanceOf[js.Any])
  }
  
}

