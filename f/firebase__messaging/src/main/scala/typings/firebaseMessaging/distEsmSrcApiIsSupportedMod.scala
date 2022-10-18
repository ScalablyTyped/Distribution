package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiIsSupportedMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/api/isSupported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSwSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def isWindowSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowSupported")().asInstanceOf[js.Promise[Boolean]]
}
