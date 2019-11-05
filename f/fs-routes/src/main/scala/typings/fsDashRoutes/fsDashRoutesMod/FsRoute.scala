package typings.fsDashRoutes.fsDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsRoute extends js.Object {
  var path: String
  var route: String
}

object FsRoute {
  @scala.inline
  def apply(path: String, route: String): FsRoute = {
    val __obj = js.Dynamic.literal(path = path, route = route)
  
    __obj.asInstanceOf[FsRoute]
  }
}

