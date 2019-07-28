package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Drone
import typings.envDashCi.envDashCiStrings.drone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroneEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var commit: String
  var isPr: Boolean
  var job: String
  var name: Drone
  var pr: js.UndefOr[String] = js.undefined
  var prBranch: js.UndefOr[String] = js.undefined
  var service: drone
  var slug: String
  var tag: js.UndefOr[String] = js.undefined
}

object DroneEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: Drone,
    service: drone,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): DroneEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, commit = commit, isCi = isCi, isPr = isPr, job = job, name = name, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[DroneEnv]
  }
}

