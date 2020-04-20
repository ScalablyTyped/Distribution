package typings.falcorRouter.mod

import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoute
  extends Route
     with RouteDefinition {
  def get(pathset: RoutePathSet): RouteResult | js.Promise[RouteResult] | Observable[RouteResult]
}

object GetRoute {
  @scala.inline
  def apply(
    get: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult],
    route: String
  ): GetRoute = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoute]
  }
}

