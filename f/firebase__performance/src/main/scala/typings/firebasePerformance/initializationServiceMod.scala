package typings.firebasePerformance

import typings.firebasePerformance.perfMod.PerformanceController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializationServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/initialization_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitializationPromise(performanceController: PerformanceController): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializationPromise")(performanceController.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def isPerfInitialized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPerfInitialized")().asInstanceOf[Boolean]
}
