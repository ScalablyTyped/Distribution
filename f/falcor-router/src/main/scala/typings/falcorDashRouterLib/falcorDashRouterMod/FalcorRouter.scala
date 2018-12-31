package typings
package falcorDashRouterLib.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FalcorRouter
  extends falcorLib.falcorMod.DataSource {
  /**
    * When a route misses on a call, get, or set the unhandledDataSource will
    * have a chance to fulfill that request.
    **/
  def routeUnhandledPathsTo(dataSource: falcorLib.falcorMod.DataSource): scala.Unit = js.native
}

