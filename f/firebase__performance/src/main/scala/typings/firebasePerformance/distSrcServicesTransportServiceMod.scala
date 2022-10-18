package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServicesTransportServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/transport_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetTransportService(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTransportService")().asInstanceOf[Unit]
  
  inline def setupTransportService(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupTransportService")().asInstanceOf[Unit]
  
  inline def transportHandler(serializer: js.Function1[/* repeated */ Any, String]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("transportHandler")(serializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
}
