package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeValue extends js.Object {
  var `type`: String
  var value: String
}

object AnonTypeValue {
  @scala.inline
  def apply(`type`: String, value: String): AnonTypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeValue]
  }
}

