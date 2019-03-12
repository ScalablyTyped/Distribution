package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoute
  extends Route
     with RouteDefinition {
  def get(pathset: RoutePathSet): RouteResult | js.Promise[RouteResult]
}

object GetRoute {
  @scala.inline
  def apply(get: RoutePathSet => RouteResult | js.Promise[RouteResult], route: java.lang.String): GetRoute = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), route = route)
  
    __obj.asInstanceOf[GetRoute]
  }
}

