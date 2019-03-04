package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Token = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

