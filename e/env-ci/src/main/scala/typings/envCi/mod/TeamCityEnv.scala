package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.TeamCity
import typings.envCi.envCiStrings.teamcity_
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
  var service: teamcity_
  var slug: String
}

object TeamCityEnv {
  @scala.inline
  def apply(
    build: String,
    commit: String,
    isCi: `true`,
    name: TeamCity,
    service: teamcity_,
    slug: String,
    branch: String = null,
    root: String = null
  ): TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamCityEnv]
  }
}

