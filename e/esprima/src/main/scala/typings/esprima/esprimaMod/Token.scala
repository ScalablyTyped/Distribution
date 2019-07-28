package typings.esprima.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `type`: String
  var value: String
}

object Token {
  @scala.inline
  def apply(`type`: String, value: String): Token = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

