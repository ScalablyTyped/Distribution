package typings.firebaseInstallations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: Double
  var message: String
  var status: String
}

object Code {
  @scala.inline
  def apply(code: Double, message: String, status: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

