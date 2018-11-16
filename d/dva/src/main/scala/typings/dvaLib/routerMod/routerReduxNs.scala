package typings
package dvaLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", "routerRedux")
@js.native
object routerReduxNs extends js.Object {
  @js.native
  class ConnectedRouter[State] ()
    extends reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.ConnectedRouter[State]
  
  val CALL_HISTORY_METHOD: /* @@router/CALL_HISTORY_METHOD */ java.lang.String = js.native
  val LOCATION_CHANGE: /* @@router/LOCATION_CHANGE */ java.lang.String = js.native
  val routerActions: reactDashRouterDashReduxLib.Anon_Replace = js.native
  val routerReducer: reduxLib.reduxMod.Reducer[
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterState, 
    reduxLib.reduxMod.AnyAction
  ] = js.native
  def createMatchSelector(path: java.lang.String): js.Function1[
    /* state */ reactDashRouterDashReduxLib.Anon_Router, 
    reactDashRouterLib.reactDashRouterMod.`match`[js.Object] | scala.Null
  ] = js.native
  def go(n: scala.Double): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def goBack(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def goForward(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def push(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def push(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def replace(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def replace(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def routerMiddleware(history: historyLib.historyMod.History[historyLib.historyMod.LocationState]): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
}

