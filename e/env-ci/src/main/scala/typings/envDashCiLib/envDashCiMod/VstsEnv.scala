package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VstsEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.`Visual Studio Team Services`
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.vsts
}

object VstsEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    name: envDashCiLib.envDashCiLibStrings.`Visual Studio Team Services`,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.vsts,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null
  ): VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    __obj.asInstanceOf[VstsEnv]
  }
}

