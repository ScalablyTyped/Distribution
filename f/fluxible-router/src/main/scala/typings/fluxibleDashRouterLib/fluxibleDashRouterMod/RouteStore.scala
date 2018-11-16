package typings
package fluxibleDashRouterLib.fluxibleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-router", "RouteStore")
@js.native
class RouteStore ()
  extends fluxibleLib.addonsBaseStoreMod.namespaced[js.Object] {
  @JSName("dehydrate")
  def dehydrate_MRouteStore(): js.Any = js.native
  @JSName("dehydrate")
  def dehydrate_MRouteStore(context: fluxibleLib.fluxibleMod.FluxibleContext): js.Any = js.native
  @JSName("rehydrate")
  def rehydrate_MRouteStore(state: js.Any): scala.Unit = js.native
}

@JSImport("fluxible-router", "RouteStore")
@js.native
object RouteStore extends js.Object {
  def withStaticRoutes(routes: js.Object): ScalablyTyped.runtime.Instantiable0[fluxibleDashRouterLib.fluxibleDashRouterMod.RouteStore] = js.native
}

