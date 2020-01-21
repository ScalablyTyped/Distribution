package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712LegacyField extends js.Object {
  var name: String
  var `type`: String
  var value: js.Any
}

object EIP712LegacyField {
  @scala.inline
  def apply(name: String, `type`: String, value: js.Any): EIP712LegacyField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIP712LegacyField]
  }
}

