package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiBooleans.`true`
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
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[VstsEnv]
  }
}

