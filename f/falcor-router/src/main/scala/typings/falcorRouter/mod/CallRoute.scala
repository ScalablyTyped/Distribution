package typings.falcorRouter.mod

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallRoute
  extends Route
     with RouteDefinition {
  def call(callPath: RoutePathSet, args: js.Array[_]): CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult] = js.native
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
  @scala.inline
  implicit class CallRouteOps[Self <: CallRoute] (val x: Self) extends AnyVal {
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
    def setCall(
      value: (RoutePathSet, js.Array[_]) => CallRouteResult | js.Promise[CallRouteResult] | Observable[CallRouteResult]
    ): Self = this.set("call", js.Any.fromFunction2(value))
  }
  
}

