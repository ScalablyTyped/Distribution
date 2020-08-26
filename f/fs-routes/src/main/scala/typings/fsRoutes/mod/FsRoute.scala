package typings.fsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsRoute extends js.Object {
  var path: String = js.native
  var route: String = js.native
}

object FsRoute {
  @scala.inline
  def apply(path: String, route: String): FsRoute = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsRoute]
  }
  @scala.inline
  implicit class FsRouteOps[Self <: FsRoute] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

