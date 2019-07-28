package typings.envDashCi.envDashCiMod

import typings.envDashCi.envDashCiNumbers.`true`
import typings.envDashCi.envDashCiStrings.Wercker
import typings.envDashCi.envDashCiStrings.wercker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WerckerEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var name: Wercker
  var root: String
  var service: wercker
  var slug: String
}

object WerckerEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Wercker,
    root: String,
    service: wercker,
    slug: String
  ): WerckerEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service, slug = slug)
  
    __obj.asInstanceOf[WerckerEnv]
  }
}

