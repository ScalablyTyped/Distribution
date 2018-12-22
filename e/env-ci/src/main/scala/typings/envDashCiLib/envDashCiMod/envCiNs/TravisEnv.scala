package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TravisEnv extends CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var job: java.lang.String
  var jobUrl: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`Travis CI`
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: java.lang.String
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.travis
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

