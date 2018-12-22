package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SemaphoreEnv extends CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var build: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.Semaphore
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.semaphore
  var slug: java.lang.String
}

