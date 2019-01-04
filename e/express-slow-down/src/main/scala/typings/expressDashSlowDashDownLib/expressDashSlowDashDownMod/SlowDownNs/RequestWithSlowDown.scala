package typings
package expressDashSlowDashDownLib.expressDashSlowDashDownMod.SlowDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown
  extends expressLib.expressMod.eNs.Request {
  var slowDown: SlowDownRequestAugmentation = js.native
}

