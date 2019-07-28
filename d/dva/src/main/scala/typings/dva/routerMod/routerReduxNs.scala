package typings.dva.routerMod

import typings.dva.dvaStrings.`@@router/CALL_HISTORY_METHOD`
import typings.dva.dvaStrings.`@@router/LOCATION_CHANGE`
import typings.history.historyMod.History
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
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

@JSImport("dva/router", "routerRedux")
@js.native
object routerReduxNs extends js.Object {
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

