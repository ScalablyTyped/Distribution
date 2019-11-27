package typings.fluxibleDashRouter

import typings.fluxible.fluxibleMod.FluxibleContext
import typings.fluxibleDashRouter.fluxibleDashRouterMod.NavLinkProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-router", JSImport.Namespace)
@js.native
object fluxibleDashRouterMod extends js.Object {
  @js.native
  class NavLink ()
    extends Component[NavLinkProps, js.Any, js.Any]
  
  @js.native
  class NavLinkProps () extends js.Object {
    var activeStyle: js.UndefOr[js.Object] = js.native
    var className: js.UndefOr[String] = js.native
    var href: js.UndefOr[String] = js.native
    var preserveScrollPosition: js.UndefOr[Boolean] = js.native
    var routeName: js.UndefOr[String] = js.native
    var `type`: js.UndefOr[String] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BaseStore * / any */ @js.native
  class RouteStore () extends js.Object {
    def dehydrate(): js.Any = js.native
    def dehydrate(context: FluxibleContext): js.Any = js.native
    def rehydrate(state: js.Any): Unit = js.native
  }
  
  def handleHistory(Component: TypeofClassComponent): TypeofClassComponent = js.native
  def handleHistory(Component: TypeofClassComponent, opts: js.Object): TypeofClassComponent = js.native
  def navigateAction(context: FluxibleContext, params: js.Object): js.UndefOr[scala.Nothing] = js.native
  /* static members */
  @js.native
  object RouteStore extends js.Object {
    def withStaticRoutes(routes: js.Object): TypeofClassRouteStore = js.native
  }
  
}

