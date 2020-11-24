package typings.deviceUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends CommonOptions {
  
  var colorDepth: Boolean = js.native
  
  var cpuCores: Boolean = js.native
  
  var language: Boolean = js.native
  
  var os: Boolean = js.native
  
  var pixelDepth: Boolean = js.native
  
  var platform: Boolean = js.native
  
  var resolution: Boolean = js.native
  
  var source: Boolean = js.native
  
  var version: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setColorDepth(value: Boolean): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCores(value: Boolean): Self = this.set("cpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Boolean): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Boolean): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDepth(value: Boolean): Self = this.set("pixelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Boolean): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: Boolean): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Boolean): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
