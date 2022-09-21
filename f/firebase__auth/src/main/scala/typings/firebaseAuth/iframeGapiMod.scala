package typings.firebaseAuth

import typings.firebaseAuth.gapi.iframes.Context
import typings.firebaseAuth.srcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeGapiMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/iframe/gapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadGapi(auth: AuthInternal): js.Promise[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("_loadGapi")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Context]]
  
  inline def resetLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetLoader")().asInstanceOf[Unit]
}
