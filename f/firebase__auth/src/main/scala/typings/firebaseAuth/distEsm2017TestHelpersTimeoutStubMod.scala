package typings.firebaseAuth

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017TestHelpersTimeoutStubMod {
  
  @JSImport("@firebase/auth/dist/esm2017/test/helpers/timeout_stub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stubSingleTimeout(): TimerTripFn = ^.asInstanceOf[js.Dynamic].applyDynamic("stubSingleTimeout")().asInstanceOf[TimerTripFn]
  inline def stubSingleTimeout(id: Double): TimerTripFn = ^.asInstanceOf[js.Dynamic].applyDynamic("stubSingleTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[TimerTripFn]
  
  inline def stubTimeouts(): TimerMap = ^.asInstanceOf[js.Dynamic].applyDynamic("stubTimeouts")().asInstanceOf[TimerMap]
  inline def stubTimeouts(ids: js.Array[Double]): TimerMap = ^.asInstanceOf[js.Dynamic].applyDynamic("stubTimeouts")(ids.asInstanceOf[js.Any]).asInstanceOf[TimerMap]
  
  type TimerMap = NumberDictionary[TimerTripFn]
  
  type TimerTripFn = js.Function0[Unit]
}
