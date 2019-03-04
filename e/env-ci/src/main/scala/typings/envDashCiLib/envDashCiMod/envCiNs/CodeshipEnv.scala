package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeshipEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.Codeship
  var service: envDashCiLib.envDashCiLibStrings.codeship
  var slug: java.lang.String
}

object CodeshipEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    name: envDashCiLib.envDashCiLibStrings.Codeship,
    service: envDashCiLib.envDashCiLibStrings.codeship,
    slug: java.lang.String
  ): CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, service = service, slug = slug)
  
    __obj.asInstanceOf[CodeshipEnv]
  }
}

