package typings.falcorDashRouter.falcorDashRouterMod

import typings.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallRoute
  extends Route
     with RouteDefinition {
  def call(callPath: RoutePathSet, args: js.Array[_]): CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult]
}

object CallRoute {
  @scala.inline
  def apply(
    call: (RoutePathSet, js.Array[_]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult],
    route: String
  ): CallRoute = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallRoute]
  }
}

