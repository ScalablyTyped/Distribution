package typings.firebaseAuth

import typings.std.ServiceWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserUtilWorkerMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/util/worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveServiceWorker(): js.Promise[ServiceWorker | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getActiveServiceWorker")().asInstanceOf[js.Promise[ServiceWorker | Null]]
  
  inline def getServiceWorkerController(): ServiceWorker | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getServiceWorkerController")().asInstanceOf[ServiceWorker | Null]
  
  inline def getWorkerGlobalScope(): ServiceWorker | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getWorkerGlobalScope")().asInstanceOf[ServiceWorker | Null]
  
  inline def isWorker(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWorker")().asInstanceOf[Boolean]
}
