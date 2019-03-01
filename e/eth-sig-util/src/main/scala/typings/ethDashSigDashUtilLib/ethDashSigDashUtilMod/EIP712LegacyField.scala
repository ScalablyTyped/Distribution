package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712LegacyField extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var value: js.Any
}

object EIP712LegacyField {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, value: js.Any): EIP712LegacyField = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EIP712LegacyField]
  }
}

