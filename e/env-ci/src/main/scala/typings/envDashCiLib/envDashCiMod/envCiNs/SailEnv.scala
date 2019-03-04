package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SailEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.`Sail CI`
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.sail
  var slug: java.lang.String
}

object SailEnv {
  @scala.inline
  def apply(
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    name: envDashCiLib.envDashCiLibStrings.`Sail CI`,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.sail,
    slug: java.lang.String,
    branch: java.lang.String = null,
    pr: java.lang.String = null
  ): SailEnv = {
    val __obj = js.Dynamic.literal(commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    __obj.asInstanceOf[SailEnv]
  }
}

