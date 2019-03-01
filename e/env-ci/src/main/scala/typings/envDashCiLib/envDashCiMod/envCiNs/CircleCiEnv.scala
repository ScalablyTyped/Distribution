package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleCiEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var job: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.CircleCI
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.circleci
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object CircleCiEnv {
  @scala.inline
  def apply(
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    job: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.CircleCI,
    service: envDashCiLib.envDashCiLibStrings.circleci,
    slug: java.lang.String,
    branch: java.lang.String = null,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null,
    tag: java.lang.String = null
  ): CircleCiEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildUrl")(buildUrl)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("isCi")(isCi)
    __obj.updateDynamic("isPr")(isPr)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("slug")(slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[CircleCiEnv]
  }
}

