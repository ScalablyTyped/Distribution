package typings.deviceUuid

import typings.deviceUuid.deviceUuidBooleans.`false`
import typings.deviceUuid.deviceUuidStrings.CaptiveNetwork
import typings.deviceUuid.deviceUuidStrings.Silk
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("device-uuid", "DeviceUUID")
  @js.native
  open class DeviceUUID () extends StObject {
    
    var Agent: typings.deviceUuid.mod.Agent = js.native
    
    var DefaultAgent: Agent = js.native
    
    def get(): String = js.native
    def get(customData: Record[String, String | Boolean]): String = js.native
    
    def getBrowser(s: String): String = js.native
    
    def getBrowserVersion(s: String): js.UndefOr[String] = js.native
    
    def getCPU(): Unit = js.native
    
    def getColorDepth(): Unit = js.native
    
    /** [sic] */
    def getLaguage(): Unit = js.native
    
    def getOS(s: String): String = js.native
    
    def getPixelDepth(): Unit = js.native
    
    def getPlatform(s: String): String = js.native
    
    def getScreenResolution(): Unit = js.native
    
    var options: Options = js.native
    
    def parse(): Agent = js.native
    def parse(source: String): Agent = js.native
    
    def reset(): DeviceUUID = js.native
    
    def testAndroidTablet(): Unit = js.native
    
    def testBot(): Unit = js.native
    
    def testCaptiveNetwork(): `false` | CaptiveNetwork = js.native
    
    def testCompatibilityMode(): Unit = js.native
    
    def testKindleFire(): String | `false` = js.native
    
    def testMobile(): Unit = js.native
    
    def testNginxGeoIP(headers: Headers): Unit = js.native
    
    def testSilk(): `false` | Silk = js.native
    
    def testSmartTV(): Unit = js.native
    
    def testTablet(): Unit = js.native
    
    def testTouchSupport(): Unit = js.native
    
    var version: String = js.native
  }
  
  trait Agent
    extends StObject
       with CommonOptions {
    
    var browser: String
    
    var colorDepth: Double
    
    var cpuCores: Double
    
    var geoIp: Headers
    
    def hashInt(s: String): String
    
    def hashMD5(s: String): String
    
    var isAndroidTablet: Boolean
    
    var isBada: Boolean
    
    var isBot: Boolean
    
    var isCaptive: Boolean
    
    var isCurl: Boolean
    
    var isSilk: Boolean
    
    var isUC: Boolean
    
    var isWinJs: Boolean
    
    var language: String
    
    var os: String
    
    var pixelDepth: Double
    
    var platform: String
    
    var resolution: js.Tuple2[Double, Double]
    
    var source: String
    
    var version: String
  }
  object Agent {
    
    inline def apply(
      browser: String,
      colorDepth: Double,
      cpuCores: Double,
      geoIp: Headers,
      hashInt: String => String,
      hashMD5: String => String,
      isAmaya: Boolean,
      isAndroid: Boolean,
      isAndroidTablet: Boolean,
      isAuthoritative: Boolean,
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
      isPhantomJS: Boolean,
      isRaspberry: Boolean,
      isSafari: Boolean,
      isSamsung: Boolean,
      isSeaMonkey: Boolean,
      isSilk: Boolean,
      isSmartTV: Boolean,
      isTablet: Boolean,
      isTouchScreen: Boolean,
      isUC: Boolean,
      isWebkit: Boolean,
      isWinJs: Boolean,
      isWindows: Boolean,
      isiPad: Boolean,
      isiPhone: Boolean,
      isiPod: Boolean,
      language: String,
      os: String,
      pixelDepth: Double,
      platform: String,
      resolution: js.Tuple2[Double, Double],
      silkAccelerated: Boolean,
      source: String,
      version: String
    ): Agent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], cpuCores = cpuCores.asInstanceOf[js.Any], geoIp = geoIp.asInstanceOf[js.Any], hashInt = js.Any.fromFunction1(hashInt), hashMD5 = js.Any.fromFunction1(hashMD5), isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAndroidTablet = isAndroidTablet.asInstanceOf[js.Any], isAuthoritative = isAuthoritative.asInstanceOf[js.Any], isBada = isBada.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isBot = isBot.asInstanceOf[js.Any], isCaptive = isCaptive.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isCurl = isCurl.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isPhantomJS = isPhantomJS.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSilk = isSilk.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isTouchScreen = isTouchScreen.asInstanceOf[js.Any], isUC = isUC.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWinJs = isWinJs.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
      
      inline def setCpuCores(value: Double): Self = StObject.set(x, "cpuCores", value.asInstanceOf[js.Any])
      
      inline def setGeoIp(value: Headers): Self = StObject.set(x, "geoIp", value.asInstanceOf[js.Any])
      
      inline def setHashInt(value: String => String): Self = StObject.set(x, "hashInt", js.Any.fromFunction1(value))
      
      inline def setHashMD5(value: String => String): Self = StObject.set(x, "hashMD5", js.Any.fromFunction1(value))
      
      inline def setIsAndroidTablet(value: Boolean): Self = StObject.set(x, "isAndroidTablet", value.asInstanceOf[js.Any])
      
      inline def setIsBada(value: Boolean): Self = StObject.set(x, "isBada", value.asInstanceOf[js.Any])
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setIsCaptive(value: Boolean): Self = StObject.set(x, "isCaptive", value.asInstanceOf[js.Any])
      
      inline def setIsCurl(value: Boolean): Self = StObject.set(x, "isCurl", value.asInstanceOf[js.Any])
      
      inline def setIsSilk(value: Boolean): Self = StObject.set(x, "isSilk", value.asInstanceOf[js.Any])
      
      inline def setIsUC(value: Boolean): Self = StObject.set(x, "isUC", value.asInstanceOf[js.Any])
      
      inline def setIsWinJs(value: Boolean): Self = StObject.set(x, "isWinJs", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonOptions extends StObject {
    
    var isAmaya: Boolean
    
    var isAndroid: Boolean
    
    var isAuthoritative: Boolean
    
    var isBlackberry: Boolean
    
    var isChrome: Boolean
    
    var isChromeOS: Boolean
    
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
    
    var isPhantomJS: Boolean
    
    var isRaspberry: Boolean
    
    var isSafari: Boolean
    
    var isSamsung: Boolean
    
    var isSeaMonkey: Boolean
    
    var isSmartTV: Boolean
    
    var isTablet: Boolean
    
    var isTouchScreen: Boolean
    
    var isWebkit: Boolean
    
    var isWindows: Boolean
    
    var isiPad: Boolean
    
    var isiPhone: Boolean
    
    var isiPod: Boolean
    
    var silkAccelerated: Boolean
  }
  object CommonOptions {
    
    inline def apply(
      isAmaya: Boolean,
      isAndroid: Boolean,
      isAuthoritative: Boolean,
      isBlackberry: Boolean,
      isChrome: Boolean,
      isChromeOS: Boolean,
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
      isPhantomJS: Boolean,
      isRaspberry: Boolean,
      isSafari: Boolean,
      isSamsung: Boolean,
      isSeaMonkey: Boolean,
      isSmartTV: Boolean,
      isTablet: Boolean,
      isTouchScreen: Boolean,
      isWebkit: Boolean,
      isWindows: Boolean,
      isiPad: Boolean,
      isiPhone: Boolean,
      isiPod: Boolean,
      silkAccelerated: Boolean
    ): CommonOptions = {
      val __obj = js.Dynamic.literal(isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAuthoritative = isAuthoritative.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isPhantomJS = isPhantomJS.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isTouchScreen = isTouchScreen.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      inline def setIsAmaya(value: Boolean): Self = StObject.set(x, "isAmaya", value.asInstanceOf[js.Any])
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsAuthoritative(value: Boolean): Self = StObject.set(x, "isAuthoritative", value.asInstanceOf[js.Any])
      
      inline def setIsBlackberry(value: Boolean): Self = StObject.set(x, "isBlackberry", value.asInstanceOf[js.Any])
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsChromeOS(value: Boolean): Self = StObject.set(x, "isChromeOS", value.asInstanceOf[js.Any])
      
      inline def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsEdge(value: Boolean): Self = StObject.set(x, "isEdge", value.asInstanceOf[js.Any])
      
      inline def setIsEpiphany(value: Boolean): Self = StObject.set(x, "isEpiphany", value.asInstanceOf[js.Any])
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsFlock(value: Boolean): Self = StObject.set(x, "isFlock", value.asInstanceOf[js.Any])
      
      inline def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
      
      inline def setIsIECompatibilityMode(value: Boolean): Self = StObject.set(x, "isIECompatibilityMode", value.asInstanceOf[js.Any])
      
      inline def setIsKindleFire(value: Boolean): Self = StObject.set(x, "isKindleFire", value.asInstanceOf[js.Any])
      
      inline def setIsKonqueror(value: Boolean): Self = StObject.set(x, "isKonqueror", value.asInstanceOf[js.Any])
      
      inline def setIsLinux(value: Boolean): Self = StObject.set(x, "isLinux", value.asInstanceOf[js.Any])
      
      inline def setIsLinux64(value: Boolean): Self = StObject.set(x, "isLinux64", value.asInstanceOf[js.Any])
      
      inline def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsOmniWeb(value: Boolean): Self = StObject.set(x, "isOmniWeb", value.asInstanceOf[js.Any])
      
      inline def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
      
      inline def setIsPhantomJS(value: Boolean): Self = StObject.set(x, "isPhantomJS", value.asInstanceOf[js.Any])
      
      inline def setIsRaspberry(value: Boolean): Self = StObject.set(x, "isRaspberry", value.asInstanceOf[js.Any])
      
      inline def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
      
      inline def setIsSamsung(value: Boolean): Self = StObject.set(x, "isSamsung", value.asInstanceOf[js.Any])
      
      inline def setIsSeaMonkey(value: Boolean): Self = StObject.set(x, "isSeaMonkey", value.asInstanceOf[js.Any])
      
      inline def setIsSmartTV(value: Boolean): Self = StObject.set(x, "isSmartTV", value.asInstanceOf[js.Any])
      
      inline def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
      
      inline def setIsTouchScreen(value: Boolean): Self = StObject.set(x, "isTouchScreen", value.asInstanceOf[js.Any])
      
      inline def setIsWebkit(value: Boolean): Self = StObject.set(x, "isWebkit", value.asInstanceOf[js.Any])
      
      inline def setIsWindows(value: Boolean): Self = StObject.set(x, "isWindows", value.asInstanceOf[js.Any])
      
      inline def setIsiPad(value: Boolean): Self = StObject.set(x, "isiPad", value.asInstanceOf[js.Any])
      
      inline def setIsiPhone(value: Boolean): Self = StObject.set(x, "isiPhone", value.asInstanceOf[js.Any])
      
      inline def setIsiPod(value: Boolean): Self = StObject.set(x, "isiPod", value.asInstanceOf[js.Any])
      
      inline def setSilkAccelerated(value: Boolean): Self = StObject.set(x, "silkAccelerated", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = Record[String, String]
  
  trait Options
    extends StObject
       with CommonOptions {
    
    var colorDepth: Boolean
    
    var cpuCores: Boolean
    
    var language: Boolean
    
    var os: Boolean
    
    var pixelDepth: Boolean
    
    var platform: Boolean
    
    var resolution: Boolean
    
    var source: Boolean
    
    var version: Boolean
  }
  object Options {
    
    inline def apply(
      colorDepth: Boolean,
      cpuCores: Boolean,
      isAmaya: Boolean,
      isAndroid: Boolean,
      isAuthoritative: Boolean,
      isBlackberry: Boolean,
      isChrome: Boolean,
      isChromeOS: Boolean,
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
      isPhantomJS: Boolean,
      isRaspberry: Boolean,
      isSafari: Boolean,
      isSamsung: Boolean,
      isSeaMonkey: Boolean,
      isSmartTV: Boolean,
      isTablet: Boolean,
      isTouchScreen: Boolean,
      isWebkit: Boolean,
      isWindows: Boolean,
      isiPad: Boolean,
      isiPhone: Boolean,
      isiPod: Boolean,
      language: Boolean,
      os: Boolean,
      pixelDepth: Boolean,
      platform: Boolean,
      resolution: Boolean,
      silkAccelerated: Boolean,
      source: Boolean,
      version: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(colorDepth = colorDepth.asInstanceOf[js.Any], cpuCores = cpuCores.asInstanceOf[js.Any], isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAuthoritative = isAuthoritative.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isPhantomJS = isPhantomJS.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isTouchScreen = isTouchScreen.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColorDepth(value: Boolean): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
      
      inline def setCpuCores(value: Boolean): Self = StObject.set(x, "cpuCores", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: Boolean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Boolean): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPixelDepth(value: Boolean): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Boolean): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Boolean): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
