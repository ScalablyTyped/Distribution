package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.TeamCity
import typings.envDashCi.envDashCiStrings.teamcity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamCityEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: js.UndefOr[String] = js.undefined
  var build: String
  var commit: String
  var name: TeamCity
  var root: js.UndefOr[String] = js.undefined
  var service: teamcity
  var slug: String
}

object TeamCityEnv {
  @scala.inline
  def apply(
    build: String,
    commit: String,
    isCi: `true`,
    name: TeamCity,
    service: teamcity,
    slug: String,
    branch: String = null,
    root: String = null
  ): TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build, commit = commit, isCi = isCi, name = name, service = service, slug = slug)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[TeamCityEnv]
  }
}

