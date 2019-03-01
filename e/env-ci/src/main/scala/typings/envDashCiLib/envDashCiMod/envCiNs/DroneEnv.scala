package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroneEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var job: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.Drone
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.drone
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object DroneEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    job: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.Drone,
    service: envDashCiLib.envDashCiLibStrings.drone,
    slug: java.lang.String,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null,
    tag: java.lang.String = null
  ): DroneEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branch")(branch)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("isCi")(isCi)
    __obj.updateDynamic("isPr")(isPr)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("slug")(slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[DroneEnv]
  }
}

