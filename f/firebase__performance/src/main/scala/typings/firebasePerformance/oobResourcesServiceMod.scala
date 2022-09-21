package typings.firebasePerformance

import typings.firebasePerformance.perfMod.PerformanceController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oobResourcesServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/oob_resources_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupOobResources(performanceController: PerformanceController): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOobResources")(performanceController.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
