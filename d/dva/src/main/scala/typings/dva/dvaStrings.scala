package typings.dva

import typings.dva.mod.EffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dvaStrings {
  
  @js.native
  sealed trait takeEvery
    extends StObject
       with EffectType
  inline def takeEvery: takeEvery = "takeEvery".asInstanceOf[takeEvery]
  
  @js.native
  sealed trait takeLatest
    extends StObject
       with EffectType
  inline def takeLatest: takeLatest = "takeLatest".asInstanceOf[takeLatest]
  
  @js.native
  sealed trait throttle
    extends StObject
       with EffectType
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait watcher
    extends StObject
       with EffectType
  inline def watcher: watcher = "watcher".asInstanceOf[watcher]
}
