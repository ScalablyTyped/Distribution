package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`Visual Studio Team Services`
import typings.envDashCi.envDashCiStrings.vsts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VstsEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var commit: String
  var isPr: Boolean
  var name: `Visual Studio Team Services`
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var root: String
  var service: vsts
}

object VstsEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Visual Studio Team Services`,
    root: String,
    service: vsts,
    pr: String = null,
    prBranch: String = null
  ): VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    __obj.asInstanceOf[VstsEnv]
  }
}

