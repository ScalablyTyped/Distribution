package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TeamCityEnv extends CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.TeamCity
  var root: js.UndefOr[java.lang.String] = js.undefined
  var service: envDashCiLib.envDashCiLibStrings.teamcity
  var slug: java.lang.String
}

