package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Codeship
import typings.envDashCi.envDashCiStrings.codeship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeshipEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var name: Codeship
  var service: codeship
  var slug: String
}

object CodeshipEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Codeship,
    service: codeship,
    slug: String
  ): CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, service = service, slug = slug)
  
    __obj.asInstanceOf[CodeshipEnv]
  }
}

