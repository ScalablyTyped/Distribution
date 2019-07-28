package typings.geetest.geetestMod

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
    val __obj = js.Dynamic.literal(challenge = challenge, seccode = seccode, validate = validate)
  
    __obj.asInstanceOf[Result]
  }
}

