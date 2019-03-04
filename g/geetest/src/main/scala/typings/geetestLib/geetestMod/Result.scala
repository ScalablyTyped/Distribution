package typings
package geetestLib.geetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var challenge: java.lang.String
  var seccode: java.lang.String
  var validate: java.lang.String
}

object Result {
  @scala.inline
  def apply(challenge: java.lang.String, seccode: java.lang.String, validate: java.lang.String): Result = {
    val __obj = js.Dynamic.literal(challenge = challenge, seccode = seccode, validate = validate)
  
    __obj.asInstanceOf[Result]
  }
}

