package typings
package expressDashSlowDashDownLib.expressDashSlowDashDownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request {
  var slowDown: SlowDownRequestAugmentation = js.native
}

