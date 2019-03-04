package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRoute
  extends Route
     with RouteDefinition {
  def set(jsonGraph: falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraph): RouteResult | js.Promise[RouteResult]
}

object SetRoute {
  @scala.inline
  def apply(
    route: java.lang.String,
    set: js.Function1[
      falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraph, 
      RouteResult | js.Promise[RouteResult]
    ]
  ): SetRoute = {
    val __obj = js.Dynamic.literal(route = route, set = set)
  
    __obj.asInstanceOf[SetRoute]
  }
}

