package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.gapi.iframes.Iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPlatformBrowserIframeIframeMod {
  
  @JSImport("@firebase/auth/dist/src/platform_browser/iframe/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openIframe(auth: AuthInternal): js.Promise[Iframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openIframe")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Iframe]]
}
