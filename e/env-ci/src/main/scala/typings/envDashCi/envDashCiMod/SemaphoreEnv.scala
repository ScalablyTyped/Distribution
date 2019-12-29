package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiBooleans.`true`
import typings.envDashCi.envDashCiStrings.Semaphore
import typings.envDashCi.envDashCiStrings.semaphore_
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
  var service: semaphore_
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
    service: semaphore_,
    slug: String,
    branch: String = null,
    pr: String = null,
    prBranch: String = null
  ): SemaphoreEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemaphoreEnv]
  }
}

