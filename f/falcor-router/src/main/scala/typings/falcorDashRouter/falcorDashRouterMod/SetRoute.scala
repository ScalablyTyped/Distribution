package typings.falcorDashRouter.falcorDashRouterMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraph
import typings.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRoute
  extends Route
     with RouteDefinition {
  def set(jsonGraph: JSONGraph): RouteResult | js.Promise[RouteResult] | Observable[RouteResult]
}

object SetRoute {
  @scala.inline
  def apply(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): SetRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[SetRoute]
  }
}

