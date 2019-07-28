package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.`AWS CodeBuild`
import typings.envDashCi.envDashCiStrings.codebuild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeBuildEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var name: `AWS CodeBuild`
  var root: String
  var service: codebuild
}

object CodeBuildEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `AWS CodeBuild`,
    root: String,
    service: codebuild
  ): CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service)
  
    __obj.asInstanceOf[CodeBuildEnv]
  }
}

