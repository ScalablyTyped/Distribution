package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializationServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/initialization_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitializationPromise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializationPromise")().asInstanceOf[js.Promise[Unit]]
  
  inline def isPerfInitialized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPerfInitialized")().asInstanceOf[Boolean]
}
