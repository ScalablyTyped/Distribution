package typings.expressDashSlowDashDown.expressDashSlowDashDownMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown extends Request {
  var slowDown: SlowDownRequestAugmentation = js.native
}

