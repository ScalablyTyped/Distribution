package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonCiEnv extends CiEnv {
  var branch: js.UndefOr[String] = js.undefined
  var commit: js.UndefOr[String] = js.undefined
  var isCi: `false`
}

object NonCiEnv {
  @scala.inline
  def apply(isCi: `false`, branch: String = null, commit: String = null): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = isCi)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    __obj.asInstanceOf[NonCiEnv]
  }
}

