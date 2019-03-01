package typings
package engineDotIoDashClientLib.engineDotIoDashClientMod.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeError
  extends nodeLib.Error {
  var transport: java.lang.String
}

object UpgradeError {
  @scala.inline
  def apply(transport: java.lang.String, stack: java.lang.String = null): UpgradeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transport")(transport)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UpgradeError]
  }
}

