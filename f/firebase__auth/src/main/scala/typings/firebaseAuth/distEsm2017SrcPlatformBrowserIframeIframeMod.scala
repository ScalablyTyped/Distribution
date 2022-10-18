package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.gapi.iframes.Iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcPlatformBrowserIframeIframeMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/iframe/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openIframe(auth: AuthInternal): js.Promise[Iframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openIframe")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Iframe]]
}
