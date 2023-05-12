package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.Android
import typings.firebaseAuth.firebaseAuthStrings.Blackberry
import typings.firebaseAuth.firebaseAuthStrings.Chrome
import typings.firebaseAuth.firebaseAuthStrings.Edge
import typings.firebaseAuth.firebaseAuthStrings.Firefox
import typings.firebaseAuth.firebaseAuthStrings.IEMobile
import typings.firebaseAuth.firebaseAuthStrings.Opera
import typings.firebaseAuth.firebaseAuthStrings.Other
import typings.firebaseAuth.firebaseAuthStrings.Safari
import typings.firebaseAuth.firebaseAuthStrings.Silk
import typings.firebaseAuth.firebaseAuthStrings.Webos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreUtilBrowserMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/util/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBrowserName(userAgent: String): BrowserName | String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getBrowserName")(userAgent.asInstanceOf[js.Any]).asInstanceOf[BrowserName | String]
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroid")().asInstanceOf[Boolean]
  inline def isAndroid(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isAndroid")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlackBerry(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBlackBerry")().asInstanceOf[Boolean]
  inline def isBlackBerry(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBlackBerry")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isChromeIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isChromeIOS")().asInstanceOf[Boolean]
  inline def isChromeIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isChromeIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFirefox")().asInstanceOf[Boolean]
  inline def isFirefox(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFirefox")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIE10(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIE10")().asInstanceOf[Boolean]
  
  inline def isIEMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIEMobile")().asInstanceOf[Boolean]
  inline def isIEMobile(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIEMobile")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS")().asInstanceOf[Boolean]
  inline def isIOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOS7Or8(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS7Or8")().asInstanceOf[Boolean]
  inline def isIOS7Or8(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOS7Or8")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOSStandalone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOSStandalone")().asInstanceOf[Boolean]
  inline def isIOSStandalone(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIOSStandalone")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIframe(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isIframe")().asInstanceOf[Boolean]
  
  inline def isMobileBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isMobileBrowser")().asInstanceOf[Boolean]
  inline def isMobileBrowser(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isMobileBrowser")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isSafari")().asInstanceOf[Boolean]
  inline def isSafari(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isSafari")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWebOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWebOS")().asInstanceOf[Boolean]
  inline def isWebOS(ua: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isWebOS")(ua.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.Android
    - typings.firebaseAuth.firebaseAuthStrings.Blackberry
    - typings.firebaseAuth.firebaseAuthStrings.Edge
    - typings.firebaseAuth.firebaseAuthStrings.Firefox
    - typings.firebaseAuth.firebaseAuthStrings.IE
    - typings.firebaseAuth.firebaseAuthStrings.IEMobile
    - typings.firebaseAuth.firebaseAuthStrings.Opera
    - typings.firebaseAuth.firebaseAuthStrings.Other
    - typings.firebaseAuth.firebaseAuthStrings.Chrome
    - typings.firebaseAuth.firebaseAuthStrings.Safari
    - typings.firebaseAuth.firebaseAuthStrings.Silk
    - typings.firebaseAuth.firebaseAuthStrings.Webos
  */
  trait BrowserName extends StObject
  object BrowserName {
    
    inline def ANDROID: Android = "Android".asInstanceOf[Android]
    
    inline def BLACKBERRY: Blackberry = "Blackberry".asInstanceOf[Blackberry]
    
    inline def CHROME: Chrome = "Chrome".asInstanceOf[Chrome]
    
    inline def EDGE: Edge = "Edge".asInstanceOf[Edge]
    
    inline def FIREFOX: Firefox = "Firefox".asInstanceOf[Firefox]
    
    inline def IE: typings.firebaseAuth.firebaseAuthStrings.IE = "IE".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.IE]
    
    inline def IEMOBILE: IEMobile = "IEMobile".asInstanceOf[IEMobile]
    
    inline def OPERA: Opera = "Opera".asInstanceOf[Opera]
    
    inline def OTHER: Other = "Other".asInstanceOf[Other]
    
    inline def SAFARI: Safari = "Safari".asInstanceOf[Safari]
    
    inline def SILK: Silk = "Silk".asInstanceOf[Silk]
    
    inline def WEBOS: Webos = "Webos".asInstanceOf[Webos]
  }
}
