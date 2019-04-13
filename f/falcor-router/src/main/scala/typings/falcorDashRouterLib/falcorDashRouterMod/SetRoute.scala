package typings
package falcorDashRouterLib.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRoute
  extends Route
     with RouteDefinition {
  def set(jsonGraph: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.JSONGraph): RouteResult | js.Promise[RouteResult]
}

object SetRoute {
  @scala.inline
  def apply(
    route: java.lang.String,
    set: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.JSONGraph => RouteResult | js.Promise[RouteResult]
  ): SetRoute = {
    val __obj = js.Dynamic.literal(route = route, set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[SetRoute]
  }
}

