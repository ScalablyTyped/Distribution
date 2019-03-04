package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitriseEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.Bitrise
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.bitrise
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object BitriseEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    name: envDashCiLib.envDashCiLibStrings.Bitrise,
    service: envDashCiLib.envDashCiLibStrings.bitrise,
    slug: java.lang.String,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null,
    tag: java.lang.String = null
  ): BitriseEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, name = name, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BitriseEnv]
  }
}

