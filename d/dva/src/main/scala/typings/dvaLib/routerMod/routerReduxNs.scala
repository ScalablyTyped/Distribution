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
  
  val CALL_HISTORY_METHOD: dvaLib.dvaLibStrings.`@@router/CALL_HISTORY_METHOD` = js.native
  val LOCATION_CHANGE: dvaLib.dvaLibStrings.`@@router/LOCATION_CHANGE` = js.native
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
  @js.native
  object routerActions extends js.Object {
    @JSName("goBack")
    var goBack_Original: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
    @JSName("goForward")
    var goForward_Original: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
    @JSName("go")
    var go_Original: js.Function1[
        /* n */ scala.Double, 
        reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
      ] = js.native
    @JSName("push")
    var push_Original: js.Function2[
        /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
        /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
        reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
      ] = js.native
    @JSName("replace")
    var replace_Original: js.Function2[
        /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
        /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
        reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
      ] = js.native
    /* Expanded */ def go(n: scala.Double): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    /* Expanded */ def goBack(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    /* Expanded */ def goForward(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    /* Expanded */ def push(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    def push(
      location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
      state: historyLib.historyMod.LocationState
    ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    /* Expanded */ def replace(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
    def replace(
      location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
      state: historyLib.historyMod.LocationState
    ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  }
  
}

