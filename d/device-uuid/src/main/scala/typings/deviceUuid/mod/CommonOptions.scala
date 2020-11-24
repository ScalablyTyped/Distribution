package typings.deviceUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  var isAmaya: Boolean = js.native
  
  var isAndroid: Boolean = js.native
  
  var isAuthoritative: Boolean = js.native
  
  var isBlackberry: Boolean = js.native
  
  var isChrome: Boolean = js.native
  
  var isChromeOS: Boolean = js.native
  
  var isDesktop: Boolean = js.native
  
  var isEdge: Boolean = js.native
  
  var isEpiphany: Boolean = js.native
  
  var isFirefox: Boolean = js.native
  
  var isFlock: Boolean = js.native
  
  var isIE: Boolean = js.native
  
  var isIECompatibilityMode: Boolean = js.native
  
  var isKindleFire: Boolean = js.native
  
  var isKonqueror: Boolean = js.native
  
  var isLinux: Boolean = js.native
  
  var isLinux64: Boolean = js.native
  
  var isMac: Boolean = js.native
  
  var isMobile: Boolean = js.native
  
  var isOmniWeb: Boolean = js.native
  
  var isOpera: Boolean = js.native
  
  var isPhantomJS: Boolean = js.native
  
  var isRaspberry: Boolean = js.native
  
  var isSafari: Boolean = js.native
  
  var isSamsung: Boolean = js.native
  
  var isSeaMonkey: Boolean = js.native
  
  var isSmartTV: Boolean = js.native
  
  var isTablet: Boolean = js.native
  
  var isTouchScreen: Boolean = js.native
  
  var isWebkit: Boolean = js.native
  
  var isWindows: Boolean = js.native
  
  var isiPad: Boolean = js.native
  
  var isiPhone: Boolean = js.native
  
  var isiPod: Boolean = js.native
  
  var silkAccelerated: Boolean = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(
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
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setIsAmaya(value: Boolean): Self = this.set("isAmaya", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAndroid(value: Boolean): Self = this.set("isAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthoritative(value: Boolean): Self = this.set("isAuthoritative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlackberry(value: Boolean): Self = this.set("isBlackberry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = this.set("isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChromeOS(value: Boolean): Self = this.set("isChromeOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDesktop(value: Boolean): Self = this.set("isDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEdge(value: Boolean): Self = this.set("isEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEpiphany(value: Boolean): Self = this.set("isEpiphany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirefox(value: Boolean): Self = this.set("isFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlock(value: Boolean): Self = this.set("isFlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Boolean): Self = this.set("isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIECompatibilityMode(value: Boolean): Self = this.set("isIECompatibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKindleFire(value: Boolean): Self = this.set("isKindleFire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKonqueror(value: Boolean): Self = this.set("isKonqueror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinux(value: Boolean): Self = this.set("isLinux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinux64(value: Boolean): Self = this.set("isLinux64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMac(value: Boolean): Self = this.set("isMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOmniWeb(value: Boolean): Self = this.set("isOmniWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = this.set("isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPhantomJS(value: Boolean): Self = this.set("isPhantomJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRaspberry(value: Boolean): Self = this.set("isRaspberry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSafari(value: Boolean): Self = this.set("isSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSamsung(value: Boolean): Self = this.set("isSamsung", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSeaMonkey(value: Boolean): Self = this.set("isSeaMonkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmartTV(value: Boolean): Self = this.set("isSmartTV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = this.set("isTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTouchScreen(value: Boolean): Self = this.set("isTouchScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebkit(value: Boolean): Self = this.set("isWebkit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindows(value: Boolean): Self = this.set("isWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsiPad(value: Boolean): Self = this.set("isiPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsiPhone(value: Boolean): Self = this.set("isiPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsiPod(value: Boolean): Self = this.set("isiPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilkAccelerated(value: Boolean): Self = this.set("silkAccelerated", value.asInstanceOf[js.Any])
  }
}
