package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BambooEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var job: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.Bamboo
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.bamboo
}

object BambooEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    job: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.Bamboo,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.bamboo
  ): BambooEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branch")(branch)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildUrl")(buildUrl)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("isCi")(isCi)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[BambooEnv]
  }
}

