package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/remote_config_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfig(iid: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(iid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
