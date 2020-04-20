package typings.flightplan.FlightplanInterfaces

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandResult]
  }
}

