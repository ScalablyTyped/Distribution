package typings.expoWebBrowser

import typings.expoWebBrowser.anon.Message
import typings.expoWebBrowser.anon.SkipRedirectCheck
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoWebBrowserWebMod {
  
  @JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dismissAuthSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAuthSession")().asInstanceOf[Unit]
    
    inline def maybeCompleteAuthSession(hasSkipRedirectCheck: SkipRedirectCheck): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeCompleteAuthSession")(hasSkipRedirectCheck.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.name")
    @js.native
    val name: String = js.native
    
    inline def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
    inline def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
    inline def openAuthSessionAsync(url: String, redirectUrl: String, openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], openOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
    inline def openAuthSessionAsync(url: String, redirectUrl: Unit, openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], openOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
    
    inline def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserResult]]
    inline def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any], browserParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserResult]]
  }
  
  inline def featureObjectToString(features: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("featureObjectToString")(features.asInstanceOf[js.Any]).asInstanceOf[String]
}
