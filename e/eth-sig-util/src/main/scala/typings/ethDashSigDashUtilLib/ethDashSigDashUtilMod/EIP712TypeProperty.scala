package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712TypeProperty extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object EIP712TypeProperty {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): EIP712TypeProperty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EIP712TypeProperty]
  }
}

