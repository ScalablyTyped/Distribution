package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonCiEnv extends CiEnv {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var commit: js.UndefOr[java.lang.String] = js.undefined
  var isCi: envDashCiLib.envDashCiLibNumbers.`false`
}

object NonCiEnv {
  @scala.inline
  def apply(
    isCi: envDashCiLib.envDashCiLibNumbers.`false`,
    branch: java.lang.String = null,
    commit: java.lang.String = null
  ): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = isCi)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    __obj.asInstanceOf[NonCiEnv]
  }
}

