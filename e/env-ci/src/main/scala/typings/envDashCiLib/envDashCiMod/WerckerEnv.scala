package typings
package envDashCiLib.envDashCiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WerckerEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.Wercker
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.wercker
  var slug: java.lang.String
}

object WerckerEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    name: envDashCiLib.envDashCiLibStrings.Wercker,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.wercker,
    slug: java.lang.String
  ): WerckerEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service, slug = slug)
  
    __obj.asInstanceOf[WerckerEnv]
  }
}

