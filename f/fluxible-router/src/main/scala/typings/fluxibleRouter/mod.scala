package typings.fluxibleRouter

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.mod.FluxibleContext
import typings.fluxibleRouter.anon.TypeofComponent
import typings.fluxibleRouter.anon.TypeofRouteStore
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluxible-router", "NavLink")
  @js.native
  open class NavLink protected () extends Component[NavLinkProps, Any, Any] {
    def this(props: NavLinkProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: NavLinkProps, context: Any) = this()
  }
  
  @JSImport("fluxible-router", "NavLinkProps")
  @js.native
  open class NavLinkProps () extends StObject {
    
    var activeClass: js.UndefOr[String] = js.native
    
    var activeElement: js.UndefOr[String] = js.native
    
    var activeStyle: js.UndefOr[js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var followLink: js.UndefOr[Boolean] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var navParams: js.UndefOr[js.Object] = js.native
    
    var preserveScrollPosition: js.UndefOr[Boolean] = js.native
    
    var queryParams: js.UndefOr[js.Object] = js.native
    
    var replaceState: js.UndefOr[Boolean] = js.native
    
    var routeName: js.UndefOr[String] = js.native
    
    var stopPropagation: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var validate: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("fluxible-router", "RouteStore")
  @js.native
  open class RouteStore protected ()
    extends typings.fluxible.addonsBaseStoreMod.^[js.Object] {
    def this(dispatcher: DispatcherInterface) = this()
    
    @JSName("dehydrate")
    def dehydrate_MRouteStore(): Any = js.native
    @JSName("dehydrate")
    def dehydrate_MRouteStore(context: FluxibleContext): Any = js.native
    
    @JSName("rehydrate")
    def rehydrate_MRouteStore(state: Any): Unit = js.native
  }
  /* static members */
  object RouteStore {
    
    @JSImport("fluxible-router", "RouteStore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withStaticRoutes(routes: js.Object): TypeofRouteStore = ^.asInstanceOf[js.Dynamic].applyDynamic("withStaticRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[TypeofRouteStore]
  }
  
  inline def handleHistory(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("handleHistory")(Component.asInstanceOf[js.Any]).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  inline def handleHistory(
    Component: TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ]),
    opts: js.Object
  ): TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("handleHistory")(Component.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TypeofComponent & (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
    Component[js.Object, js.Object, js.Object]
  ])]
  
  inline def navigateAction(context: FluxibleContext, params: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateAction")(context.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
