package typings.firebasePerformance

import typings.firebasePerformance.perfMod.PerformanceController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/remote_config_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfig(performanceController: PerformanceController, iid: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(performanceController.asInstanceOf[js.Any], iid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
