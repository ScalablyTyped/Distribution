package typings.dva

import typings.dva.mod.EffectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dvaStrings {
  
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  
  @scala.inline
  def matchPath: matchPath = "matchPath".asInstanceOf[matchPath]
  
  @scala.inline
  def staticContext: staticContext = "staticContext".asInstanceOf[staticContext]
  
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
  
  @js.native
  sealed trait history extends js.Object
  
  @js.native
  sealed trait location extends js.Object
  
  @js.native
  sealed trait `match` extends js.Object
  
  @js.native
  sealed trait matchPath extends js.Object
  
  @js.native
  sealed trait staticContext extends js.Object
  
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
}
