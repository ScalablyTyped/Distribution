package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeBuildEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`AWS CodeBuild`
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.codebuild
}

object CodeBuildEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    name: envDashCiLib.envDashCiLibStrings.`AWS CodeBuild`,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.codebuild
  ): CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service)
  
    __obj.asInstanceOf[CodeBuildEnv]
  }
}

