package typings.expressUseragent

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressUseragent.expressUseragentBooleans.`false`
import typings.expressUseragent.expressUseragentStrings.CaptiveNetwork
import typings.expressUseragent.expressUseragentStrings.Silk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-useragent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-useragent", "Agent")
  @js.native
  val Agent: Details = js.native
  
  @JSImport("express-useragent", "DefaultAgent")
  @js.native
  val DefaultAgent: Details = js.native
  
  @JSImport("express-useragent", "UserAgent")
  @js.native
  class UserAgent () extends StObject {
    
    var Agent: Details = js.native
    
    var DefaultAgent: Details = js.native
    
    def getBrowser(string: String): String = js.native
    
    def getBrowserVersion(string: String): String = js.native
    
    def getOS(string: String): String = js.native
    
    def getPlatform(string: String): String = js.native
    
    def parse(source: String): Details = js.native
    
    def reset(): Details = js.native
    
    def testAndroidTablet(): Unit = js.native
    
    def testBot(): Unit = js.native
    
    def testCaptiveNetwork(): CaptiveNetwork | `false` = js.native
    
    def testCompatibilityMode(): Unit = js.native
    
    def testKindleFire(): String | `false` = js.native
    
    def testMobile(): Unit = js.native
    
    def testNginxGeoIP(): Unit = js.native
    
    def testSilk(): Silk | `false` = js.native
    
    def testSmartTV(): Unit = js.native
    
    def testTablet(): Unit = js.native
    
    def testWebkit(): Unit = js.native
    
    var version: String = js.native
  }
  
  @scala.inline
  def express(): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ js.UndefOr[NextFunction], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("express")().asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ js.UndefOr[NextFunction], 
    Unit
  ]]
  
  @scala.inline
  def getBrowser(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowser")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBrowserVersion(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserVersion")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getOS(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOS")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPlatform(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(source: String): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Details]
  
  @scala.inline
  def reset(): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Details]
  
  @scala.inline
  def testAndroidTablet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testAndroidTablet")().asInstanceOf[Unit]
  
  @scala.inline
  def testBot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testBot")().asInstanceOf[Unit]
  
  @scala.inline
  def testCaptiveNetwork(): CaptiveNetwork | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("testCaptiveNetwork")().asInstanceOf[CaptiveNetwork | `false`]
  
  @scala.inline
  def testCompatibilityMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testCompatibilityMode")().asInstanceOf[Unit]
  
  @scala.inline
  def testKindleFire(): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("testKindleFire")().asInstanceOf[String | `false`]
  
  @scala.inline
  def testMobile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testMobile")().asInstanceOf[Unit]
  
  @scala.inline
  def testNginxGeoIP(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testNginxGeoIP")().asInstanceOf[Unit]
  
  @scala.inline
  def testSilk(): Silk | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("testSilk")().asInstanceOf[Silk | `false`]
  
  @scala.inline
  def testSmartTV(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testSmartTV")().asInstanceOf[Unit]
  
  @scala.inline
  def testTablet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testTablet")().asInstanceOf[Unit]
  
  @scala.inline
  def testWebkit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testWebkit")().asInstanceOf[Unit]
  
  @JSImport("express-useragent", "version")
  @js.native
  val version: String = js.native
  
  trait Details extends StObject {
    
    var browser: String
    
    var geoIp: StringDictionary[js.Any]
    
    var isAmaya: Boolean
    
    var isAndroid: Boolean
    
    var isAndroidTablet: Boolean
    
    var isBada: Boolean
    
    var isBlackberry: Boolean
    
    var isBot: Boolean
    
    var isCaptive: Boolean
    
    var isChrome: Boolean
    
    var isChromeOS: Boolean
    
    var isCurl: Boolean
    
    var isDesktop: Boolean
    
    var isEdge: Boolean
    
    var isEpiphany: Boolean
    
    var isFirefox: Boolean
    
    var isFlock: Boolean
    
    var isIE: Boolean
    
    var isIECompatibilityMode: Boolean
    
    var isKindleFire: Boolean
    
    var isKonqueror: Boolean
    
    var isLinux: Boolean
    
    var isLinux64: Boolean
    
    var isMac: Boolean
    
    var isMobile: Boolean
    
    var isOmniWeb: Boolean
    
    var isOpera: Boolean
    
    var isRaspberry: Boolean
    
    var isSafari: Boolean
    
    var isSamsung: Boolean
    
    var isSeaMonkey: Boolean
    
    var isSilk: Boolean
    
    var isSmartTV: Boolean
    
    var isTablet: Boolean
    
    var isWebkit: Boolean
    
    var isWinJs: Boolean
    
    var isWindows: Boolean
    
    var isWindowsPhone: Boolean
    
    var isiPad: Boolean
    
    var isiPhone: Boolean
    
    var isiPod: Boolean
    
    var os: String
    
    var platform: String
    
    var silkAccelerated: Boolean
    
    var source: String
    
    var version: String
  }
  object Details {
    
    @scala.inline
    def apply(
      browser: String,
      geoIp: StringDictionary[js.Any],
      isAmaya: Boolean,
      isAndroid: Boolean,
      isAndroidTablet: Boolean,
      isBada: Boolean,
      isBlackberry: Boolean,
      isBot: Boolean,
      isCaptive: Boolean,
      isChrome: Boolean,
      isChromeOS: Boolean,
      isCurl: Boolean,
      isDesktop: Boolean,
      isEdge: Boolean,
      isEpiphany: Boolean,
      isFirefox: Boolean,
      isFlock: Boolean,
      isIE: Boolean,
      isIECompatibilityMode: Boolean,
      isKindleFire: Boolean,
      isKonqueror: Boolean,
      isLinux: Boolean,
      isLinux64: Boolean,
      isMac: Boolean,
      isMobile: Boolean,
      isOmniWeb: Boolean,
      isOpera: Boolean,
      isRaspberry: Boolean,
      isSafari: Boolean,
      isSamsung: Boolean,
      isSeaMonkey: Boolean,
      isSilk: Boolean,
      isSmartTV: Boolean,
      isTablet: Boolean,
      isWebkit: Boolean,
      isWinJs: Boolean,
      isWindows: Boolean,
      isWindowsPhone: Boolean,
      isiPad: Boolean,
      isiPhone: Boolean,
      isiPod: Boolean,
      os: String,
      platform: String,
      silkAccelerated: Boolean,
      source: String,
      version: String
    ): Details = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], geoIp = geoIp.asInstanceOf[js.Any], isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAndroidTablet = isAndroidTablet.asInstanceOf[js.Any], isBada = isBada.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isBot = isBot.asInstanceOf[js.Any], isCaptive = isCaptive.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isCurl = isCurl.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSilk = isSilk.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWinJs = isWinJs.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isWindowsPhone = isWindowsPhone.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoIp(value: StringDictionary[js.Any]): Self = StObject.set(x, "geoIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAmaya(value: Boolean): Self = StObject.set(x, "isAmaya", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAndroidTablet(value: Boolean): Self = StObject.set(x, "isAndroidTablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBada(value: Boolean): Self = StObject.set(x, "isBada", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlackberry(value: Boolean): Self = StObject.set(x, "isBlackberry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCaptive(value: Boolean): Self = StObject.set(x, "isCaptive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChromeOS(value: Boolean): Self = StObject.set(x, "isChromeOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurl(value: Boolean): Self = StObject.set(x, "isCurl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEdge(value: Boolean): Self = StObject.set(x, "isEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEpiphany(value: Boolean): Self = StObject.set(x, "isEpiphany", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFlock(value: Boolean): Self = StObject.set(x, "isFlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIECompatibilityMode(value: Boolean): Self = StObject.set(x, "isIECompatibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsKindleFire(value: Boolean): Self = StObject.set(x, "isKindleFire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsKonqueror(value: Boolean): Self = StObject.set(x, "isKonqueror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinux(value: Boolean): Self = StObject.set(x, "isLinux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinux64(value: Boolean): Self = StObject.set(x, "isLinux64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOmniWeb(value: Boolean): Self = StObject.set(x, "isOmniWeb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRaspberry(value: Boolean): Self = StObject.set(x, "isRaspberry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSamsung(value: Boolean): Self = StObject.set(x, "isSamsung", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeaMonkey(value: Boolean): Self = StObject.set(x, "isSeaMonkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSilk(value: Boolean): Self = StObject.set(x, "isSilk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSmartTV(value: Boolean): Self = StObject.set(x, "isSmartTV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWebkit(value: Boolean): Self = StObject.set(x, "isWebkit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWinJs(value: Boolean): Self = StObject.set(x, "isWinJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindows(value: Boolean): Self = StObject.set(x, "isWindows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindowsPhone(value: Boolean): Self = StObject.set(x, "isWindowsPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsiPad(value: Boolean): Self = StObject.set(x, "isiPad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsiPhone(value: Boolean): Self = StObject.set(x, "isiPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsiPod(value: Boolean): Self = StObject.set(x, "isiPod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilkAccelerated(value: Boolean): Self = StObject.set(x, "silkAccelerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var useragent: js.UndefOr[Details] = js.undefined
      }
      object Request {
        
        @scala.inline
        def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setUseragent(value: Details): Self = StObject.set(x, "useragent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUseragentUndefined: Self = StObject.set(x, "useragent", js.undefined)
        }
      }
    }
  }
}
