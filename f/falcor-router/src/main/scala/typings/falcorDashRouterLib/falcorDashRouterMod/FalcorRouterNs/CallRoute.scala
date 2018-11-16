package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CallRoute extends Route {
  def call(callPath: RoutePathSet, args: js.Array[_]): CallRouteResult | stdLib.Promise[CallRouteResult]
}

