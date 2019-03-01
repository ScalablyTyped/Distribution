package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CiEnvBase extends js.Object {
  var isCi: envDashCiLib.envDashCiLibNumbers.`true`
}

object CiEnvBase {
  @scala.inline
  def apply(isCi: envDashCiLib.envDashCiLibNumbers.`true`): CiEnvBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCi")(isCi)
    __obj.asInstanceOf[CiEnvBase]
  }
}

