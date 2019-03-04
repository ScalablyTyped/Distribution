package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemaphoreEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.Semaphore
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.semaphore
  var slug: java.lang.String
}

object SemaphoreEnv {
  @scala.inline
  def apply(
    build: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    name: envDashCiLib.envDashCiLibStrings.Semaphore,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.semaphore,
    slug: java.lang.String,
    branch: java.lang.String = null,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null
  ): SemaphoreEnv = {
    val __obj = js.Dynamic.literal(build = build, commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    __obj.asInstanceOf[SemaphoreEnv]
  }
}

