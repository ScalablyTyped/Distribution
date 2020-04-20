package typings.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var challenge: String
  var seccode: String
  var validate: String
}

object Result {
  @scala.inline
  def apply(challenge: String, seccode: String, validate: String): Result = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], seccode = seccode.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

