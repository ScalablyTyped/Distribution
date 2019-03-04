package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: scala.Double
  var details: js.Array[js.Object]
  var message: java.lang.String
}

object Status {
  @scala.inline
  def apply(code: scala.Double, details: js.Array[js.Object], message: java.lang.String): Status = {
    val __obj = js.Dynamic.literal(code = code, details = details, message = message)
  
    __obj.asInstanceOf[Status]
  }
}

