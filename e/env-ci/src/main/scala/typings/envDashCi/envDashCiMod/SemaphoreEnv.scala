package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Semaphore
import typings.envDashCi.envDashCiStrings.semaphore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemaphoreEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var build: String
  var commit: String
  var isPr: Boolean
  var name: Semaphore
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var root: String
  var service: semaphore
  var slug: String
}

object SemaphoreEnv {
  @scala.inline
  def apply(
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Semaphore,
    root: String,
    service: semaphore,
    slug: String,
    branch: String = null,
    pr: String = null,
    prBranch: String = null
  ): SemaphoreEnv = {
    val __obj = js.Dynamic.literal(build = build, commit = commit, isCi = isCi, isPr = isPr, name = name, root = root, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    __obj.asInstanceOf[SemaphoreEnv]
  }
}

