package typings.firebaseInstallations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Double
  var message: String
  var status: String
}

object AnonCode {
  @scala.inline
  def apply(code: Double, message: String, status: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

