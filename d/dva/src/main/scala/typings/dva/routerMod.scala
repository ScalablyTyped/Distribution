package typings.dva

import org.scalablytyped.runtime.StringDictionary
import typings.dva.dvaStrings.`@@router/CALL_HISTORY_METHOD`
import typings.dva.dvaStrings.`@@router/LOCATION_CHANGE`
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.Omit
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.WithRouterProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.reactDashRouterDashRedux.Anon_Router
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterAction
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter
  
  @js.native
  class HashRouter ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter
  
  @js.native
  class Link[S] ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Link[S]
  
  @js.native
  class MemoryRouter ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.MemoryRouter
  
  @js.native
  class NavLink[S] ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLink[S]
  
  @js.native
  class Prompt ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Prompt
  
  @js.native
  class Redirect ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Route[T]
  
  @js.native
  class Router ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Router
  
  @js.native
  class StaticRouter ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.StaticRouter
  
  @js.native
  class Switch ()
    extends typings.reactDashRouterDashDom.reactDashRouterDashDomMod.Switch
  
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useParams with js.Any */](): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ p in keyof Params ]: string}
    */ typings.dva.dvaStrings.useParams with js.Any = js.native
  def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[(Omit[P, String]) with WithRouterProps[C], ComponentState]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouter[State]
    
    val CALL_HISTORY_METHOD: `@@router/CALL_HISTORY_METHOD` = js.native
    val LOCATION_CHANGE: `@@router/LOCATION_CHANGE` = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ Anon_Router, `match`[js.Object] | Null] = js.native
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

