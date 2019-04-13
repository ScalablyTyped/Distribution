package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamCityEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.TeamCity
  var root: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.teamcity
  var slug: java.lang.String
}

object TeamCityEnv {
  @scala.inline
  def apply(
    build: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    name: envDashCiLib.envDashCiLibStrings.TeamCity,
    service: envDashCiLib.envDashCiLibStrings.teamcity,
    slug: java.lang.String,
    branch: java.lang.String = null,
    root: java.lang.String = null
  ): TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build, commit = commit, isCi = isCi, name = name, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[TeamCityEnv]
  }
}

