package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallRoute
  extends Route
     with RouteDefinition {
  def call(callPath: RoutePathSet, args: js.Array[_]): CallRouteResult | js.Promise[CallRouteResult]
}

object CallRoute {
  @scala.inline
  def apply(
    call: (RoutePathSet, js.Array[_]) => CallRouteResult | js.Promise[CallRouteResult],
    route: java.lang.String
  ): CallRoute = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), route = route)
  
    __obj.asInstanceOf[CallRoute]
  }
}

