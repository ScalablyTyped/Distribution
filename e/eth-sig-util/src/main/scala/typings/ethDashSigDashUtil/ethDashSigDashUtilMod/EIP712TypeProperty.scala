package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712TypeProperty extends js.Object {
  var name: String
  var `type`: String
}

object EIP712TypeProperty {
  @scala.inline
  def apply(name: String, `type`: String): EIP712TypeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIP712TypeProperty]
  }
}

