package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.gapi.iframes.Iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcPlatformBrowserIframeIframeMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/iframe/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openIframe(auth: AuthInternal): js.Promise[Iframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openIframe")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Iframe]]
}
