package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

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
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EIP712LegacyField]
  }
}

