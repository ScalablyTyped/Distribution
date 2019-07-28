package typings.flightplan.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandResult extends js.Object {
  var code: Double
  var stderr: String
  var stdout: String
}

object CommandResult {
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): CommandResult = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[CommandResult]
  }
}

