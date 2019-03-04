package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

