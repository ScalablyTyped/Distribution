package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBlock extends js.Object {
  var adBlock: js.UndefOr[Boolean] = js.undefined
  var addBehavior: js.UndefOr[Boolean] = js.undefined
  var audio: js.UndefOr[Boolean] = js.undefined
  var availableScreenResolution: js.UndefOr[Boolean] = js.undefined
  var canvas: js.UndefOr[Boolean] = js.undefined
  var colorDepth: js.UndefOr[Boolean] = js.undefined
  var cpuClass: js.UndefOr[Boolean] = js.undefined
  var deviceMemory: js.UndefOr[Boolean] = js.undefined
  /**
    * DNT depends on incognito mode for some browsers (Chrome) and it's impossible to detect incognito mode
    */
  var doNotTrack: js.UndefOr[Boolean] = js.undefined
  /**
    * Unreliable on Windows, see https://github.com/Valve/fingerprintjs2/issues/375
    */
  var enumerateDevices: js.UndefOr[Boolean] = js.undefined
  var fonts: js.UndefOr[Boolean] = js.undefined
  var fontsFlash: js.UndefOr[Boolean] = js.undefined
  var hardwareConcurrency: js.UndefOr[Boolean] = js.undefined
  var hasLiedBrowser: js.UndefOr[Boolean] = js.undefined
  var hasLiedLanguages: js.UndefOr[Boolean] = js.undefined
  var hasLiedOs: js.UndefOr[Boolean] = js.undefined
  var hasLiedResolution: js.UndefOr[Boolean] = js.undefined
  var indexedDb: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Boolean] = js.undefined
  var localStorage: js.UndefOr[Boolean] = js.undefined
  var openDatabase: js.UndefOr[Boolean] = js.undefined
  /**
    * devicePixelRatio depends on browser zoom, and it's impossible to detect browser zoom
    */
  var pixelRatio: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[Boolean] = js.undefined
  var screenResolution: js.UndefOr[Boolean] = js.undefined
  var sessionStorage: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[Boolean] = js.undefined
  var timezoneOffset: js.UndefOr[Boolean] = js.undefined
  var touchSupport: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[Boolean] = js.undefined
  var webgl: js.UndefOr[Boolean] = js.undefined
  var webglVendorAndRenderer: js.UndefOr[Boolean] = js.undefined
}

object AdBlock {
  @scala.inline
  def apply(
    adBlock: js.UndefOr[Boolean] = js.undefined,
    addBehavior: js.UndefOr[Boolean] = js.undefined,
    audio: js.UndefOr[Boolean] = js.undefined,
    availableScreenResolution: js.UndefOr[Boolean] = js.undefined,
    canvas: js.UndefOr[Boolean] = js.undefined,
    colorDepth: js.UndefOr[Boolean] = js.undefined,
    cpuClass: js.UndefOr[Boolean] = js.undefined,
    deviceMemory: js.UndefOr[Boolean] = js.undefined,
    doNotTrack: js.UndefOr[Boolean] = js.undefined,
    enumerateDevices: js.UndefOr[Boolean] = js.undefined,
    fonts: js.UndefOr[Boolean] = js.undefined,
    fontsFlash: js.UndefOr[Boolean] = js.undefined,
    hardwareConcurrency: js.UndefOr[Boolean] = js.undefined,
    hasLiedBrowser: js.UndefOr[Boolean] = js.undefined,
    hasLiedLanguages: js.UndefOr[Boolean] = js.undefined,
    hasLiedOs: js.UndefOr[Boolean] = js.undefined,
    hasLiedResolution: js.UndefOr[Boolean] = js.undefined,
    indexedDb: js.UndefOr[Boolean] = js.undefined,
    language: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    openDatabase: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: js.UndefOr[Boolean] = js.undefined,
    platform: js.UndefOr[Boolean] = js.undefined,
    plugins: js.UndefOr[Boolean] = js.undefined,
    screenResolution: js.UndefOr[Boolean] = js.undefined,
    sessionStorage: js.UndefOr[Boolean] = js.undefined,
    timezone: js.UndefOr[Boolean] = js.undefined,
    timezoneOffset: js.UndefOr[Boolean] = js.undefined,
    touchSupport: js.UndefOr[Boolean] = js.undefined,
    userAgent: js.UndefOr[Boolean] = js.undefined,
    webgl: js.UndefOr[Boolean] = js.undefined,
    webglVendorAndRenderer: js.UndefOr[Boolean] = js.undefined
  ): AdBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adBlock)) __obj.updateDynamic("adBlock")(adBlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addBehavior)) __obj.updateDynamic("addBehavior")(addBehavior.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(availableScreenResolution)) __obj.updateDynamic("availableScreenResolution")(availableScreenResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canvas)) __obj.updateDynamic("canvas")(canvas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDepth)) __obj.updateDynamic("colorDepth")(colorDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpuClass)) __obj.updateDynamic("cpuClass")(cpuClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceMemory)) __obj.updateDynamic("deviceMemory")(deviceMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotTrack)) __obj.updateDynamic("doNotTrack")(doNotTrack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerateDevices)) __obj.updateDynamic("enumerateDevices")(enumerateDevices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fonts)) __obj.updateDynamic("fonts")(fonts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontsFlash)) __obj.updateDynamic("fontsFlash")(fontsFlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareConcurrency)) __obj.updateDynamic("hardwareConcurrency")(hardwareConcurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedBrowser)) __obj.updateDynamic("hasLiedBrowser")(hasLiedBrowser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedLanguages)) __obj.updateDynamic("hasLiedLanguages")(hasLiedLanguages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedOs)) __obj.updateDynamic("hasLiedOs")(hasLiedOs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedResolution)) __obj.updateDynamic("hasLiedResolution")(hasLiedResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexedDb)) __obj.updateDynamic("indexedDb")(indexedDb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openDatabase)) __obj.updateDynamic("openDatabase")(openDatabase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenResolution)) __obj.updateDynamic("screenResolution")(screenResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionStorage)) __obj.updateDynamic("sessionStorage")(sessionStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timezone)) __obj.updateDynamic("timezone")(timezone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timezoneOffset)) __obj.updateDynamic("timezoneOffset")(timezoneOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userAgent)) __obj.updateDynamic("userAgent")(userAgent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webgl)) __obj.updateDynamic("webgl")(webgl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webglVendorAndRenderer)) __obj.updateDynamic("webglVendorAndRenderer")(webglVendorAndRenderer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdBlock]
  }
}

