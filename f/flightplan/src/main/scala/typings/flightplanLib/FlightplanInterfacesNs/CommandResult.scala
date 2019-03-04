package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandResult extends js.Object {
  var code: scala.Double
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object CommandResult {
  @scala.inline
  def apply(code: scala.Double, stderr: java.lang.String, stdout: java.lang.String): CommandResult = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[CommandResult]
  }
}

