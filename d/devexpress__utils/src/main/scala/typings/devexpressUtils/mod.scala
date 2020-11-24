package typings.devexpressUtils

import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Browser () extends js.Object
  /* static members */
  @js.native
  object Browser extends js.Object {
    
    var AndroidChromeBrowser: Boolean = js.native
    
    var AndroidDefaultBrowser: Boolean = js.native
    
    var AndroidMobilePlatform: Boolean = js.native
    
    var Chrome: Boolean = js.native
    
    var Edge: Boolean = js.native
    
    var Firefox: Boolean = js.native
    
    def GetBrowserVersion(
      userAgent: String,
      matches: RegExpExecArray,
      tridentPattern: String,
      ieCompatibleVersionString: String
    ): Double = js.native
    
    var HardwareAcceleration: Boolean = js.native
    
    var IE: Boolean = js.native
    
    def IdentUserAgent(userAgent: String): Unit = js.native
    def IdentUserAgent(userAgent: String, ignoreDocumentMode: Boolean): Unit = js.native
    
    var Info: String = js.native
    
    var MSTouchUI: Boolean = js.native
    
    var MacOSMobilePlatform: Boolean = js.native
    
    var MacOSPlatform: Boolean = js.native
    
    var MajorVersion: Double = js.native
    
    var MobileUI: Boolean = js.native
    
    var Mozilla: Boolean = js.native
    
    var Netscape: Boolean = js.native
    
    var NetscapeFamily: Boolean = js.native
    
    var Opera: Boolean = js.native
    
    var PlaformMajorVersion: String = js.native
    
    var Safari: Boolean = js.native
    
    var SamsungAndroidDevice: Boolean = js.native
    
    var TouchUI: Boolean = js.native
    
    var UserAgent: String = js.native
    
    var Version: Double = js.native
    
    var VirtualKeyboardSupported: Boolean = js.native
    
    var WebKitFamily: Boolean = js.native
    
    var WebKitTouchUI: Boolean = js.native
    
    var WindowsPhonePlatform: Boolean = js.native
    
    var WindowsPlatform: Boolean = js.native
    
    var _foo: Unit = js.native
    
    def fillDocumentElementBrowserTypeClassNames(browserTypesOrderedList: js.Array[String]): Unit = js.native
    
    def fillUserAgentInfo(browserTypesOrderedList: js.Array[String], browserType: String, version: Double, platform: String): Unit = js.native
    def fillUserAgentInfo(
      browserTypesOrderedList: js.Array[String],
      browserType: String,
      version: Double,
      platform: String,
      isSamsungAndroidDevice: Boolean
    ): Unit = js.native
    
    var getIECompatibleVersionString: js.Any = js.native
    
    var getVersionFromMatches: js.Any = js.native
    
    var getVersionFromTrident: js.Any = js.native
    
    var indentPlatformMajorVersion: js.Any = js.native
    
    def isTouchEnabled(): Boolean = js.native
  }
}
