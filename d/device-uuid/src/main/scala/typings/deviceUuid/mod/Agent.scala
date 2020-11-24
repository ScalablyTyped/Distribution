package typings.deviceUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agent extends CommonOptions {
  
  var browser: String = js.native
  
  var colorDepth: Double = js.native
  
  var cpuCores: Double = js.native
  
  var geoIp: Headers = js.native
  
  def hashInt(s: String): String = js.native
  
  def hashMD5(s: String): String = js.native
  
  var isAndroidTablet: Boolean = js.native
  
  var isBada: Boolean = js.native
  
  var isBot: Boolean = js.native
  
  var isCaptive: Boolean = js.native
  
  var isCurl: Boolean = js.native
  
  var isSilk: Boolean = js.native
  
  var isUC: Boolean = js.native
  
  var isWinJs: Boolean = js.native
  
  var language: String = js.native
  
  var os: String = js.native
  
  var pixelDepth: Double = js.native
  
  var platform: String = js.native
  
  var resolution: js.Tuple2[Double, Double] = js.native
  
  var source: String = js.native
  
  var version: String = js.native
}
object Agent {
  
  @scala.inline
  def apply(
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
  implicit class AgentOps[Self <: Agent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDepth(value: Double): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCores(value: Double): Self = this.set("cpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoIp(value: Headers): Self = this.set("geoIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashInt(value: String => String): Self = this.set("hashInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHashMD5(value: String => String): Self = this.set("hashMD5", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAndroidTablet(value: Boolean): Self = this.set("isAndroidTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBada(value: Boolean): Self = this.set("isBada", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBot(value: Boolean): Self = this.set("isBot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaptive(value: Boolean): Self = this.set("isCaptive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurl(value: Boolean): Self = this.set("isCurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSilk(value: Boolean): Self = this.set("isSilk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUC(value: Boolean): Self = this.set("isUC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWinJs(value: Boolean): Self = this.set("isWinJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDepth(value: Double): Self = this.set("pixelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: js.Tuple2[Double, Double]): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
