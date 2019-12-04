package typings.falcorDashRouter.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var route: String
}

object Route {
  @scala.inline
  def apply(route: String): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Route]
  }
}

