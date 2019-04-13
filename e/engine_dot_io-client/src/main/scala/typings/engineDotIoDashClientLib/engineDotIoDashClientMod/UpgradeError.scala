package typings
package engineDotIoDashClientLib.engineDotIoDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeError
  extends stdLib.Error {
  var transport: java.lang.String
}

object UpgradeError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    transport: java.lang.String,
    stack: java.lang.String = null
  ): UpgradeError = {
    val __obj = js.Dynamic.literal(message = message, name = name, transport = transport)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UpgradeError]
  }
}

