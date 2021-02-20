package typings.fluxibleRouter

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.baseStoreMod.^
import typings.fluxible.mod.FluxibleContext
import typings.fluxibleRouter.anon.TypeofComponent
import typings.fluxibleRouter.anon.TypeofRouteStore
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-router", "NavLink")
  @js.native
  class NavLink protected ()
    extends Component[NavLinkProps, js.Any, js.Any] {
    def this(props: NavLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavLinkProps, context: js.Any) = this()
  }
  
  @JSImport("fluxible-router", "NavLinkProps")
  @js.native
  class NavLinkProps () extends StObject {
    
    var activeStyle: js.UndefOr[js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var preserveScrollPosition: js.UndefOr[Boolean] = js.native
    
    var routeName: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  
  @JSImport("fluxible-router", "RouteStore")
  @js.native
  class RouteStore protected ()
    extends ^[js.Object] {
    def this(dispatcher: DispatcherInterface) = this()
    
    @JSName("dehydrate")
    def dehydrate_MRouteStore(): js.Any = js.native
    @JSName("dehydrate")
    def dehydrate_MRouteStore(context: FluxibleContext): js.Any = js.native
    
    @JSName("rehydrate")
    def rehydrate_MRouteStore(state: js.Any): Unit = js.native
  }
  /* static members */
  object RouteStore {
    
    @JSImport("fluxible-router", "RouteStore.withStaticRoutes")
    @js.native
    def withStaticRoutes(routes: js.Object): TypeofRouteStore = js.native
  }
  
  @JSImport("fluxible-router", "handleHistory")
  @js.native
  def handleHistory(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
  @JSImport("fluxible-router", "handleHistory")
  @js.native
  def handleHistory(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    opts: js.Object
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = js.native
  
  @JSImport("fluxible-router", "navigateAction")
  @js.native
  def navigateAction(context: FluxibleContext, params: js.Object): js.UndefOr[scala.Nothing] = js.native
}
