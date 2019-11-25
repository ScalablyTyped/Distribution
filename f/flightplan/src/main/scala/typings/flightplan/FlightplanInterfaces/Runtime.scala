package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runtime extends js.Object {
  var hosts: js.Array[Host]
  var options: js.Any
  var target: String
  var task: String
}

object Runtime {
  @scala.inline
  def apply(hosts: js.Array[Host], options: js.Any, target: String, task: String): Runtime = {
    val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Runtime]
  }
}

