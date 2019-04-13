package typings
package dvaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaLibStrings {
  @js.native
  sealed trait `@@router/CALL_HISTORY_METHOD` extends js.Object
  
  @js.native
  sealed trait `@@router/LOCATION_CHANGE` extends js.Object
  
  @js.native
  sealed trait matchPath extends js.Object
  
  @js.native
  sealed trait takeEvery
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait takeLatest
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait throttle
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait watcher
    extends dvaLib.dvaMod.EffectType
  
  @scala.inline
  def `@@router/CALL_HISTORY_METHOD`: `@@router/CALL_HISTORY_METHOD` = "@@router/CALL_HISTORY_METHOD".asInstanceOf[`@@router/CALL_HISTORY_METHOD`]
  @scala.inline
  def `@@router/LOCATION_CHANGE`: `@@router/LOCATION_CHANGE` = "@@router/LOCATION_CHANGE".asInstanceOf[`@@router/LOCATION_CHANGE`]
  @scala.inline
  def matchPath: matchPath = "matchPath".asInstanceOf[matchPath]
  @scala.inline
  def takeEvery: takeEvery = "takeEvery".asInstanceOf[takeEvery]
  @scala.inline
  def takeLatest: takeLatest = "takeLatest".asInstanceOf[takeLatest]
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
  @scala.inline
  def watcher: watcher = "watcher".asInstanceOf[watcher]
}

