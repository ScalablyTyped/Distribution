package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Bamboo
import typings.envDashCi.envDashCiStrings.bamboo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BambooEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var job: String
  var name: Bamboo
  var root: String
  var service: bamboo
}

object BambooEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    name: Bamboo,
    root: String,
    service: bamboo
  ): BambooEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, job = job, name = name, root = root, service = service)
  
    __obj.asInstanceOf[BambooEnv]
  }
}

