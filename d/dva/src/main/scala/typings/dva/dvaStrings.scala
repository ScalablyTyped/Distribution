package typings.dva

import typings.dva.dvaMod.EffectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaStrings {
  @js.native
  sealed trait `@@routerSlashCALL_HISTORY_METHOD` extends js.Object
  
  @js.native
  sealed trait `@@routerSlashLOCATION_CHANGE` extends js.Object
  
  @js.native
  sealed trait matchPath extends js.Object
  
  @js.native
  sealed trait takeEvery extends EffectType
  
  @js.native
  sealed trait takeLatest extends EffectType
  
  @js.native
  sealed trait throttle extends EffectType
  
  @js.native
  sealed trait useParams extends js.Object
  
  @js.native
  sealed trait useRouteMatch extends js.Object
  
  @js.native
  sealed trait watcher extends EffectType
  
  @scala.inline
  def `@@routerSlashCALL_HISTORY_METHOD`: `@@routerSlashCALL_HISTORY_METHOD` = "@@router/CALL_HISTORY_METHOD".asInstanceOf[`@@routerSlashCALL_HISTORY_METHOD`]
  @scala.inline
  def `@@routerSlashLOCATION_CHANGE`: `@@routerSlashLOCATION_CHANGE` = "@@router/LOCATION_CHANGE".asInstanceOf[`@@routerSlashLOCATION_CHANGE`]
  @scala.inline
  def matchPath: matchPath = "matchPath".asInstanceOf[matchPath]
  @scala.inline
  def takeEvery: takeEvery = "takeEvery".asInstanceOf[takeEvery]
  @scala.inline
  def takeLatest: takeLatest = "takeLatest".asInstanceOf[takeLatest]
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
  @scala.inline
  def useParams: useParams = "useParams".asInstanceOf[useParams]
  @scala.inline
  def useRouteMatch: useRouteMatch = "useRouteMatch".asInstanceOf[useRouteMatch]
  @scala.inline
  def watcher: watcher = "watcher".asInstanceOf[watcher]
}

