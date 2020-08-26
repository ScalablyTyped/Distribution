package typings.falcorRouter.mod

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoute
  extends Route
     with RouteDefinition {
  def get(pathset: RoutePathSet): RouteResult | js.Promise[RouteResult] | Observable[RouteResult] = js.native
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
  @scala.inline
  implicit class GetRouteOps[Self <: GetRoute] (val x: Self) extends AnyVal {
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
    def setGet(value: RoutePathSet => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

