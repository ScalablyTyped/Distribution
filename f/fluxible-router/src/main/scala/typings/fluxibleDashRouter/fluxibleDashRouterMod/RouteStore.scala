package typings.fluxibleDashRouter.fluxibleDashRouterMod

import typings.fluxible.fluxibleMod.FluxibleContext
import typings.fluxibleDashRouter.TypeofClassRouteStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-router", "RouteStore")
@js.native
class RouteStore ()
  extends typings.fluxible.addonsBaseStoreMod.^[js.Object] {
  @JSName("dehydrate")
  def dehydrate_MRouteStore(): js.Any = js.native
  @JSName("dehydrate")
  def dehydrate_MRouteStore(context: FluxibleContext): js.Any = js.native
  @JSName("rehydrate")
  def rehydrate_MRouteStore(state: js.Any): Unit = js.native
}

/* static members */
@JSImport("fluxible-router", "RouteStore")
@js.native
object RouteStore extends js.Object {
  def withStaticRoutes(routes: js.Object): TypeofClassRouteStore = js.native
}

