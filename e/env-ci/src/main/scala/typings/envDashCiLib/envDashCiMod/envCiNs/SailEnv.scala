package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SailEnv extends CiEnvBase {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var commit: java.lang.String
  var isPr: scala.Boolean
  var name: envDashCiLib.envDashCiLibStrings.`Sail CI`
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.sail
  var slug: java.lang.String
}

