package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router
  extends typings.koaDashRouter.koaDashRouterMod.^[js.Any, typings.eggDashView.eggMod.Context] {
  /**
    * restful router api
    */
  def resources(name: String, prefix: String, middleware: js.Any*): Router = js.native
}

