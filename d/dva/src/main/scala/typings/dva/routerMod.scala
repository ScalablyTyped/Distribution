package typings.dva

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dva.dvaStrings.history
import typings.dva.dvaStrings.location
import typings.dva.dvaStrings.staticContext
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactRouter.mod.MemoryRouterProps
import typings.reactRouter.mod.Omit
import typings.reactRouter.mod.PromptProps
import typings.reactRouter.mod.RedirectProps
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.RouteProps
import typings.reactRouter.mod.RouterProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.StaticRouterProps
import typings.reactRouter.mod.SwitchProps
import typings.reactRouter.mod.WithRouterProps
import typings.reactRouter.mod.WithRouterStatics
import typings.reactRouter.mod.`match`
import typings.reactRouterDom.mod.BrowserRouterProps
import typings.reactRouterDom.mod.HashRouterProps
import typings.reactRouterDom.mod.LinkProps
import typings.reactRouterDom.mod.NavLinkProps
import typings.reactRouterRedux.mod.ConnectedRouterProps
import typings.reactRouterRedux.mod.RouterAction
import typings.reactRouterRedux.mod.RouterState
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.std.HTMLAnchorElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends Component[BrowserRouterProps, js.Any, js.Any]
  
  @js.native
  class HashRouter ()
    extends Component[HashRouterProps, js.Any, js.Any]
  
  @js.native
  class MemoryRouter ()
    extends Component[MemoryRouterProps, js.Any, js.Any]
  
  @js.native
  class Prompt ()
    extends Component[PromptProps, js.Any, js.Any]
  
  @js.native
  class Redirect ()
    extends Component[RedirectProps, js.Any, js.Any]
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends Component[T, js.Any, js.Any]
  
  @js.native
  class Router ()
    extends Component[RouterProps, js.Any, js.Any]
  
  @js.native
  class StaticRouter ()
    extends Component[StaticRouterProps, js.Any, js.Any]
  
  @js.native
  class Switch ()
    extends Component[SwitchProps, js.Any, js.Any]
  
  def Link[S](
    // TODO: Define this as ...params: Parameters<Link<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typings.reactRouterDom.mod.Link[S]] = js.native
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typings.reactRouterDom.mod.NavLink[S]] = js.native
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useParams with TopLevel[js.Any] */](): Params = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typings.dva.dvaStrings.`match` | staticContext
    ]) with WithRouterProps[C], 
    ComponentState
  ]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends Component[ConnectedRouterProps[State], js.Object, js.Any]
    
    val CALL_HISTORY_METHOD: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
    val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ typings.reactRouterRedux.anon.Router, `match`[js.Object] | Null] = js.native
    def go(n: Double): RouterAction = js.native
    def goBack(): RouterAction = js.native
    def goForward(): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    @js.native
    object routerActions extends js.Object {
      var go: js.Function1[/* n */ Double, RouterAction] = js.native
      var goBack: js.Function0[RouterAction] = js.native
      var goForward: js.Function0[RouterAction] = js.native
      var push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      var replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
    }
    
  }
  
}

