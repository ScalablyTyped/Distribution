package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBlock extends js.Object {
  var adBlock: js.UndefOr[Boolean] = js.native
  var addBehavior: js.UndefOr[Boolean] = js.native
  var audio: js.UndefOr[Boolean] = js.native
  var availableScreenResolution: js.UndefOr[Boolean] = js.native
  var canvas: js.UndefOr[Boolean] = js.native
  var colorDepth: js.UndefOr[Boolean] = js.native
  var cpuClass: js.UndefOr[Boolean] = js.native
  var deviceMemory: js.UndefOr[Boolean] = js.native
  /**
    * DNT depends on incognito mode for some browsers (Chrome) and it's impossible to detect incognito mode
    */
  var doNotTrack: js.UndefOr[Boolean] = js.native
  /**
    * Unreliable on Windows, see https://github.com/Valve/fingerprintjs2/issues/375
    */
  var enumerateDevices: js.UndefOr[Boolean] = js.native
  var fonts: js.UndefOr[Boolean] = js.native
  var fontsFlash: js.UndefOr[Boolean] = js.native
  var hardwareConcurrency: js.UndefOr[Boolean] = js.native
  var hasLiedBrowser: js.UndefOr[Boolean] = js.native
  var hasLiedLanguages: js.UndefOr[Boolean] = js.native
  var hasLiedOs: js.UndefOr[Boolean] = js.native
  var hasLiedResolution: js.UndefOr[Boolean] = js.native
  var indexedDb: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[Boolean] = js.native
  var localStorage: js.UndefOr[Boolean] = js.native
  var openDatabase: js.UndefOr[Boolean] = js.native
  /**
    * devicePixelRatio depends on browser zoom, and it's impossible to detect browser zoom
    */
  var pixelRatio: js.UndefOr[Boolean] = js.native
  var platform: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var screenResolution: js.UndefOr[Boolean] = js.native
  var sessionStorage: js.UndefOr[Boolean] = js.native
  var timezone: js.UndefOr[Boolean] = js.native
  var timezoneOffset: js.UndefOr[Boolean] = js.native
  var touchSupport: js.UndefOr[Boolean] = js.native
  var userAgent: js.UndefOr[Boolean] = js.native
  var webgl: js.UndefOr[Boolean] = js.native
  var webglVendorAndRenderer: js.UndefOr[Boolean] = js.native
}

object AdBlock {
  @scala.inline
  def apply(): AdBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBlock]
  }
  @scala.inline
  implicit class AdBlockOps[Self <: AdBlock] (val x: Self) extends AnyVal {
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
    def setAdBlock(value: Boolean): Self = this.set("adBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdBlock: Self = this.set("adBlock", js.undefined)
    @scala.inline
    def setAddBehavior(value: Boolean): Self = this.set("addBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBehavior: Self = this.set("addBehavior", js.undefined)
    @scala.inline
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setAvailableScreenResolution(value: Boolean): Self = this.set("availableScreenResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableScreenResolution: Self = this.set("availableScreenResolution", js.undefined)
    @scala.inline
    def setCanvas(value: Boolean): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setColorDepth(value: Boolean): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDepth: Self = this.set("colorDepth", js.undefined)
    @scala.inline
    def setCpuClass(value: Boolean): Self = this.set("cpuClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuClass: Self = this.set("cpuClass", js.undefined)
    @scala.inline
    def setDeviceMemory(value: Boolean): Self = this.set("deviceMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMemory: Self = this.set("deviceMemory", js.undefined)
    @scala.inline
    def setDoNotTrack(value: Boolean): Self = this.set("doNotTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoNotTrack: Self = this.set("doNotTrack", js.undefined)
    @scala.inline
    def setEnumerateDevices(value: Boolean): Self = this.set("enumerateDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumerateDevices: Self = this.set("enumerateDevices", js.undefined)
    @scala.inline
    def setFonts(value: Boolean): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setFontsFlash(value: Boolean): Self = this.set("fontsFlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontsFlash: Self = this.set("fontsFlash", js.undefined)
    @scala.inline
    def setHardwareConcurrency(value: Boolean): Self = this.set("hardwareConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareConcurrency: Self = this.set("hardwareConcurrency", js.undefined)
    @scala.inline
    def setHasLiedBrowser(value: Boolean): Self = this.set("hasLiedBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLiedBrowser: Self = this.set("hasLiedBrowser", js.undefined)
    @scala.inline
    def setHasLiedLanguages(value: Boolean): Self = this.set("hasLiedLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLiedLanguages: Self = this.set("hasLiedLanguages", js.undefined)
    @scala.inline
    def setHasLiedOs(value: Boolean): Self = this.set("hasLiedOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLiedOs: Self = this.set("hasLiedOs", js.undefined)
    @scala.inline
    def setHasLiedResolution(value: Boolean): Self = this.set("hasLiedResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLiedResolution: Self = this.set("hasLiedResolution", js.undefined)
    @scala.inline
    def setIndexedDb(value: Boolean): Self = this.set("indexedDb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexedDb: Self = this.set("indexedDb", js.undefined)
    @scala.inline
    def setLanguage(value: Boolean): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    @scala.inline
    def setOpenDatabase(value: Boolean): Self = this.set("openDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenDatabase: Self = this.set("openDatabase", js.undefined)
    @scala.inline
    def setPixelRatio(value: Boolean): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPlatform(value: Boolean): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setScreenResolution(value: Boolean): Self = this.set("screenResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenResolution: Self = this.set("screenResolution", js.undefined)
    @scala.inline
    def setSessionStorage(value: Boolean): Self = this.set("sessionStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionStorage: Self = this.set("sessionStorage", js.undefined)
    @scala.inline
    def setTimezone(value: Boolean): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setTimezoneOffset(value: Boolean): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneOffset: Self = this.set("timezoneOffset", js.undefined)
    @scala.inline
    def setTouchSupport(value: Boolean): Self = this.set("touchSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSupport: Self = this.set("touchSupport", js.undefined)
    @scala.inline
    def setUserAgent(value: Boolean): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setWebgl(value: Boolean): Self = this.set("webgl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebgl: Self = this.set("webgl", js.undefined)
    @scala.inline
    def setWebglVendorAndRenderer(value: Boolean): Self = this.set("webglVendorAndRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebglVendorAndRenderer: Self = this.set("webglVendorAndRenderer", js.undefined)
  }
  
}

