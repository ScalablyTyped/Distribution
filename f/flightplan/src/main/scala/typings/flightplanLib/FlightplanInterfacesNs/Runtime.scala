package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runtime extends js.Object {
  var hosts: js.Array[Host]
  var options: js.Any
  var target: java.lang.String
  var task: java.lang.String
}

object Runtime {
  @scala.inline
  def apply(hosts: js.Array[Host], options: js.Any, target: java.lang.String, task: java.lang.String): Runtime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hosts")(hosts)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[Runtime]
  }
}

