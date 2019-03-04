package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: StatusCode
  var details: js.Array[_]
  var message: java.lang.String
}

object Status {
  @scala.inline
  def apply(code: StatusCode, details: js.Array[_], message: java.lang.String): Status = {
    val __obj = js.Dynamic.literal(code = code, details = details, message = message)
  
    __obj.asInstanceOf[Status]
  }
}

