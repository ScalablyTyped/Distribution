package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runtime extends js.Object {
  var hosts: js.Array[Host] = js.native
  var options: js.Any = js.native
  var target: String = js.native
  var task: String = js.native
}

object Runtime {
  @scala.inline
  def apply(hosts: js.Array[Host], options: js.Any, target: String, task: String): Runtime = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  @scala.inline
  implicit class RuntimeOps[Self <: Runtime] (val x: Self) extends AnyVal {
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
    def setHostsVarargs(value: Host*): Self = this.set("hosts", js.Array(value :_*))
    @scala.inline
    def setHosts(value: js.Array[Host]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: String): Self = this.set("task", value.asInstanceOf[js.Any])
  }
  
}

