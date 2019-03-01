package typings
package dialogflowLib.dialogflowMod.longrunningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: scala.Double
  var details: js.Array[_]
  var message: java.lang.String
}

object Status {
  @scala.inline
  def apply(code: scala.Double, details: js.Array[_], message: java.lang.String): Status = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Status]
  }
}

