package typings.falcorRouter.mod

import typings.falcor.mod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FalcorRouter extends DataSource {
  
  /**
    * When a route misses on a call, get, or set the unhandledDataSource will
    * have a chance to fulfill that request.
    **/
  def routeUnhandledPathsTo(dataSource: DataSource): Unit = js.native
}
