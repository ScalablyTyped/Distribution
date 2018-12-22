package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitLabEnv extends CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var job: java.lang.String
  var jobUrl: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`GitLab CI/CD`
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.gitlab
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

