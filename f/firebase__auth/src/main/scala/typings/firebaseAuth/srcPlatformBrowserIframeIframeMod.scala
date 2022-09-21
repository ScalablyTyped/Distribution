package typings.firebaseAuth

import typings.firebaseAuth.gapi.iframes.Iframe
import typings.firebaseAuth.nodeEsmSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformBrowserIframeIframeMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/iframe/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openIframe(auth: AuthInternal): js.Promise[Iframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openIframe")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Iframe]]
}
