package typings.falcorRouter.mod

import typings.falcorJsonGraph.mod.JSONGraph
import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRoute
  extends Route
     with RouteDefinition {
  def set(jsonGraph: JSONGraph): RouteResult | js.Promise[RouteResult] | Observable[RouteResult] = js.native
}

object SetRoute {
  @scala.inline
  def apply(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): SetRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[SetRoute]
  }
  @scala.inline
  implicit class SetRouteOps[Self <: SetRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSet(value: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

