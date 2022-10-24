package typings.dva

import typings.history.mod.History
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactRouter.anon.Data
import typings.reactRouter.anon.Revalidate
import typings.reactRouter.distLibComponentsMod.AwaitProps
import typings.reactRouter.distLibComponentsMod.MemoryRouterProps
import typings.reactRouter.distLibComponentsMod.NavigateProps
import typings.reactRouter.distLibComponentsMod.OutletProps
import typings.reactRouter.distLibComponentsMod.RouteProps
import typings.reactRouter.distLibComponentsMod.RouterProps
import typings.reactRouter.distLibComponentsMod.RouterProviderProps
import typings.reactRouter.distLibComponentsMod.RoutesProps
import typings.reactRouter.distLibContextMod.DataRouterContextObject
import typings.reactRouter.distLibContextMod.LocationContextObject
import typings.reactRouter.distLibContextMod.NavigationContextObject
import typings.reactRouter.distLibContextMod.RouteContextObject
import typings.reactRouter.distLibContextMod.RouteMatch
import typings.reactRouter.distLibContextMod.RouteObject
import typings.reactRouter.distLibHooksMod.NavigateFunction
import typings.reactRouterDom.anon.Basename
import typings.reactRouterDom.anon.PreventScrollReset
import typings.reactRouterDom.anon.Relative
import typings.reactRouterDom.distDomMod.URLSearchParamsInit
import typings.reactRouterDom.mod.BrowserRouterProps
import typings.reactRouterDom.mod.FetcherWithComponents
import typings.reactRouterDom.mod.FormProps
import typings.reactRouterDom.mod.HashRouterProps
import typings.reactRouterDom.mod.HistoryRouterProps
import typings.reactRouterDom.mod.LinkProps
import typings.reactRouterDom.mod.NavLinkProps
import typings.reactRouterDom.mod.ScrollRestorationProps
import typings.reactRouterDom.mod.SetURLSearchParams
import typings.reactRouterDom.mod.SubmitFunction
import typings.reactRouterRedux.mod.ConnectedRouterProps
import typings.reactRouterRedux.mod.RouterAction
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.anon.PartialPath
import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distHistoryMod.Path
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.Fetcher
import typings.remixRunRouter.distRouterMod.Navigation
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distRouterMod.RouterState
import typings.remixRunRouter.distRouterMod.StaticHandlerContext
import typings.remixRunRouter.distUtilsMod.AgnosticRouteMatch
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DeferredData
import typings.remixRunRouter.distUtilsMod.JsonFunction
import typings.remixRunRouter.distUtilsMod.ParamParseKey
import typings.remixRunRouter.distUtilsMod.PathMatch
import typings.remixRunRouter.distUtilsMod.PathPattern
import typings.remixRunRouter.distUtilsMod.RedirectFunction
import typings.std.HTMLAnchorElement
import typings.std.HTMLFormElement
import typings.std.MouseEvent
import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("dva/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dva/router", "AbortedDeferredError")
  @js.native
  open class AbortedDeferredError ()
    extends typings.reactRouterDom.mod.AbortedDeferredError
  
  inline def Await(param0: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def BrowserRouter(param0: BrowserRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BrowserRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("dva/router", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps & RefAttributes[HTMLFormElement]] = js.native
  
  inline def HashRouter(param0: HashRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HashRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("dva/router", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[LinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  inline def MemoryRouter(param0: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("dva/router", "NavLink")
  @js.native
  val NavLink: ForwardRefExoticComponent[NavLinkProps & RefAttributes[HTMLAnchorElement]] = js.native
  
  inline def Navigate(param0: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("dva/router", "NavigationType")
  @js.native
  object NavigationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    /* "POP" */ val Pop: typings.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
    
    /* "PUSH" */ val Push: typings.remixRunRouter.distHistoryMod.Action.Push & String = js.native
    
    /* "REPLACE" */ val Replace: typings.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
  }
  
  inline def Outlet(props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Route(_props: RouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def RouterProvider(param0: RouterProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Routes(param0: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  object ScrollRestoration {
    
    inline def apply(param0: ScrollRestorationProps): Null = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("dva/router", "ScrollRestoration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dva/router", "ScrollRestoration.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dva/router", "UNSAFE_DataRouterContext")
  @js.native
  val UNSAFEDataRouterContext: Context[DataRouterContextObject | Null] = js.native
  
  @JSImport("dva/router", "UNSAFE_DataRouterStateContext")
  @js.native
  val UNSAFEDataRouterStateContext: Context[RouterState | Null] = js.native
  
  @JSImport("dva/router", "UNSAFE_DataStaticRouterContext")
  @js.native
  val UNSAFEDataStaticRouterContext: Context[StaticHandlerContext | Null] = js.native
  
  inline def UNSAFEEnhanceManualRouteObjects(routes: js.Array[RouteObject]): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_enhanceManualRouteObjects")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  
  @JSImport("dva/router", "UNSAFE_LocationContext")
  @js.native
  val UNSAFELocationContext: Context[LocationContextObject] = js.native
  
  @JSImport("dva/router", "UNSAFE_NavigationContext")
  @js.native
  val UNSAFENavigationContext: Context[NavigationContextObject] = js.native
  
  @JSImport("dva/router", "UNSAFE_RouteContext")
  @js.native
  val UNSAFERouteContext: Context[RouteContextObject] = js.native
  
  inline def createBrowserRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createBrowserRouter(routes: js.Array[RouteObject], opts: Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def createHashRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createHashRouter(routes: js.Array[RouteObject], opts: Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createHashRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def createMemoryRouter(routes: js.Array[RouteObject]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createMemoryRouter(routes: js.Array[RouteObject], opts: typings.reactRouter.anon.Basename): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryRouter")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  inline def createPath(param0: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromChildren(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def createRoutesFromElements(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromElements(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromElements")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def createSearchParams(): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createSearchParams")().asInstanceOf[URLSearchParams]
  inline def createSearchParams(init: URLSearchParamsInit): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createSearchParams")(init.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  
  inline def defer(data: Record[String, Any]): DeferredData = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(data.asInstanceOf[js.Any]).asInstanceOf[DeferredData]
  
  inline def generatePath[Path /* <: String */](path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generatePath[Path /* <: String */](
    path: Path,
    params: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @remix-run/router.@remix-run/router/dist/utils.PathParam<Path> ]: string} */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isRouteErrorResponse(e: Any): /* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRouteErrorResponse")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.ErrorResponse */ Boolean]
  
  @JSImport("dva/router", "json")
  @js.native
  val json: JsonFunction = js.native
  
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path, pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def matchPath[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path], pathname: String): PathMatch[ParamKey] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pattern.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: String, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  inline def matchRoutes[RouteObjectType /* <: AgnosticRouteObject */](routes: js.Array[RouteObjectType], locationArg: PartialLocation, basename: String): (js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any], basename.asInstanceOf[js.Any])).asInstanceOf[(js.Array[AgnosticRouteMatch[String, RouteObjectType]]) | Null]
  
  inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
  
  @JSImport("dva/router", "redirect")
  @js.native
  val redirect: RedirectFunction = js.native
  
  inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[ReactElement | Null]
  inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def resolvePath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def resolvePath(to: To, fromPathname: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(to.asInstanceOf[js.Any], fromPathname.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  object routerRedux {
    
    @JSImport("dva/router", "routerRedux")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dva/router", "routerRedux.CALL_HISTORY_METHOD")
    @js.native
    val CALL_HISTORY_METHOD: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
    
    @JSImport("dva/router", "routerRedux.ConnectedRouter")
    @js.native
    open class ConnectedRouter[State] protected ()
      extends typings.reactRouterRedux.mod.ConnectedRouter[State] {
      def this(props: ConnectedRouterProps[State]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ConnectedRouterProps[State], context: Any) = this()
    }
    
    @JSImport("dva/router", "routerRedux.LOCATION_CHANGE")
    @js.native
    val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
    
    inline def createMatchSelector(path: String): js.Function1[
        /* state */ typings.reactRouterRedux.anon.Router, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match */ Any) | Null
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchSelector")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* state */ typings.reactRouterRedux.anon.Router, 
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match */ Any) | Null
      ]]
    
    inline def go(n: Double): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
    
    inline def goBack(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[RouterAction]
    
    inline def goForward(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[RouterAction]
    
    inline def push(
      location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any
    ): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
    inline def push(
      location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
    ): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
    
    inline def replace(
      location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any
    ): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
    inline def replace(
      location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
    ): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
    
    object routerActions {
      
      @JSImport("dva/router", "routerRedux.routerActions")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("dva/router", "routerRedux.routerActions.go")
      @js.native
      def go: js.Function1[/* n */ Double, RouterAction] = js.native
      
      @JSImport("dva/router", "routerRedux.routerActions.goBack")
      @js.native
      def goBack: js.Function0[RouterAction] = js.native
      inline def goBack_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goBack")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.goForward")
      @js.native
      def goForward: js.Function0[RouterAction] = js.native
      inline def goForward_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goForward")(x.asInstanceOf[js.Any])
      
      inline def go_=(x: js.Function1[/* n */ Double, RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("go")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.push")
      @js.native
      def push: js.Function2[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
            /* state */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
            ], 
            RouterAction
          ] = js.native
      inline def push_=(
        x: js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
              /* state */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
              ], 
              RouterAction
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.replace")
      @js.native
      def replace: js.Function2[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
            /* state */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
            ], 
            RouterAction
          ] = js.native
      inline def replace_=(
        x: js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
              /* state */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
              ], 
              RouterAction
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
    }
    
    inline def routerMiddleware(history: History): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("routerMiddleware")(history.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
    
    @JSImport("dva/router", "routerRedux.routerReducer")
    @js.native
    val routerReducer: Reducer[typings.reactRouterRedux.mod.RouterState, AnyAction] = js.native
  }
  
  object unstableHistoryRouter {
    
    /**
      * A `<Router>` that accepts a pre-instantiated history object. It's important
      * to note that using your own history object is highly discouraged and may add
      * two versions of the history library to your bundles unless you use the same
      * version of the history library that React Router uses internally.
      */
    inline def apply(param0: HistoryRouterProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("dva/router", "unstable_HistoryRouter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dva/router", "unstable_HistoryRouter.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def useActionData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionData")().asInstanceOf[Any]
  
  inline def useAsyncError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncError")().asInstanceOf[Any]
  
  inline def useAsyncValue(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncValue")().asInstanceOf[Any]
  
  inline def useFetcher[TData](): FetcherWithComponents[TData] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFetcher")().asInstanceOf[FetcherWithComponents[TData]]
  
  inline def useFetchers(): js.Array[Fetcher[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFetchers")().asInstanceOf[js.Array[Fetcher[Any]]]
  
  inline def useFormAction(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormAction")().asInstanceOf[String]
  inline def useFormAction(action: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormAction")(action.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useFormAction(action: String, param1: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useFormAction")(action.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useFormAction(action: Unit, param1: Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useFormAction")(action.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useHref(to: To): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useHref(to: To, param1: typings.reactRouter.anon.Relative): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useHref")(to.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useInRouterContext(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useInRouterContext")().asInstanceOf[Boolean]
  
  inline def useLinkClickHandler[E /* <: typings.std.Element */](to: To): js.Function1[/* event */ typings.react.mod.MouseEvent[E, MouseEvent], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkClickHandler")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ typings.react.mod.MouseEvent[E, MouseEvent], Unit]]
  inline def useLinkClickHandler[E /* <: typings.std.Element */](to: To, param1: PreventScrollReset): js.Function1[/* event */ typings.react.mod.MouseEvent[E, MouseEvent], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLinkClickHandler")(to.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ typings.react.mod.MouseEvent[E, MouseEvent], Unit]]
  
  inline def useLoaderData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoaderData")().asInstanceOf[Any]
  
  inline def useLocation(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[Location]
  
  inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: Path): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
  inline def useMatch[ParamKey /* <: ParamParseKey[Path] */, Path /* <: String */](pattern: PathPattern[Path]): PathMatch[ParamKey] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pattern.asInstanceOf[js.Any]).asInstanceOf[PathMatch[ParamKey] | Null]
  
  inline def useMatches(): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[js.Array[Data]]
  
  inline def useNavigate(): NavigateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[NavigateFunction]
  
  inline def useNavigation(): Navigation = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[Navigation]
  
  inline def useNavigationType(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationType")().asInstanceOf[Action]
  
  inline def useOutlet(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")().asInstanceOf[ReactElement | Null]
  inline def useOutlet(context: Any): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutlet")(context.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def useOutletContext[Context](): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("useOutletContext")().asInstanceOf[Context]
  
  inline def useParams[ParamsOrKey /* <: String | (Record[String, js.UndefOr[String]]) */](): /* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [ParamsOrKey] extends [string] ? @remix-run/router.@remix-run/router/dist/utils.Params<ParamsOrKey> : std.Partial<ParamsOrKey> */ js.Any]
  
  inline def useResolvedPath(to: To): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def useResolvedPath(to: To, param1: typings.reactRouter.anon.Relative): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("useResolvedPath")(to.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def useRevalidator(): Revalidate = ^.asInstanceOf[js.Dynamic].applyDynamic("useRevalidator")().asInstanceOf[Revalidate]
  
  inline def useRouteError(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteError")().asInstanceOf[Any]
  
  inline def useRouteLoaderData(routeId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouteLoaderData")(routeId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useRoutes(routes: js.Array[RouteObject]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def useRoutes(routes: js.Array[RouteObject], locationArg: typings.reactRouter.anon.PartialLocation): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routes.asInstanceOf[js.Any], locationArg.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def useSearchParams(): js.Tuple2[URLSearchParams, SetURLSearchParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParams")().asInstanceOf[js.Tuple2[URLSearchParams, SetURLSearchParams]]
  inline def useSearchParams(defaultInit: URLSearchParamsInit): js.Tuple2[URLSearchParams, SetURLSearchParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParams")(defaultInit.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[URLSearchParams, SetURLSearchParams]]
  
  inline def useSubmit(): SubmitFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubmit")().asInstanceOf[SubmitFunction]
}
