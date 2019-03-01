package typings
package fingerprintjs2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdBlock extends js.Object {
  var adBlock: js.UndefOr[scala.Boolean] = js.undefined
  var addBehavior: js.UndefOr[scala.Boolean] = js.undefined
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  var availableScreenResolution: js.UndefOr[scala.Boolean] = js.undefined
  var canvas: js.UndefOr[scala.Boolean] = js.undefined
  var colorDepth: js.UndefOr[scala.Boolean] = js.undefined
  var cpuClass: js.UndefOr[scala.Boolean] = js.undefined
  var deviceMemory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DNT depends on incognito mode for some browsers (Chrome) and it's impossible to detect incognito mode
    */
  var doNotTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Unreliable on Windows, see https://github.com/Valve/fingerprintjs2/issues/375
    */
  var enumerateDevices: js.UndefOr[scala.Boolean] = js.undefined
  var fonts: js.UndefOr[scala.Boolean] = js.undefined
  var fontsFlash: js.UndefOr[scala.Boolean] = js.undefined
  var hardwareConcurrency: js.UndefOr[scala.Boolean] = js.undefined
  var hasLiedBrowser: js.UndefOr[scala.Boolean] = js.undefined
  var hasLiedLanguages: js.UndefOr[scala.Boolean] = js.undefined
  var hasLiedOs: js.UndefOr[scala.Boolean] = js.undefined
  var hasLiedResolution: js.UndefOr[scala.Boolean] = js.undefined
  var indexedDb: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[scala.Boolean] = js.undefined
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  var openDatabase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * devicePixelRatio depends on browser zoom, and it's impossible to detect browser zoom
    */
  var pixelRatio: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[scala.Boolean] = js.undefined
  var plugins: js.UndefOr[scala.Boolean] = js.undefined
  var screenResolution: js.UndefOr[scala.Boolean] = js.undefined
  var sessionStorage: js.UndefOr[scala.Boolean] = js.undefined
  var timezone: js.UndefOr[scala.Boolean] = js.undefined
  var timezoneOffset: js.UndefOr[scala.Boolean] = js.undefined
  var touchSupport: js.UndefOr[scala.Boolean] = js.undefined
  var userAgent: js.UndefOr[scala.Boolean] = js.undefined
  var webgl: js.UndefOr[scala.Boolean] = js.undefined
  var webglVendorAndRenderer: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AdBlock {
  @scala.inline
  def apply(
    adBlock: js.UndefOr[scala.Boolean] = js.undefined,
    addBehavior: js.UndefOr[scala.Boolean] = js.undefined,
    audio: js.UndefOr[scala.Boolean] = js.undefined,
    availableScreenResolution: js.UndefOr[scala.Boolean] = js.undefined,
    canvas: js.UndefOr[scala.Boolean] = js.undefined,
    colorDepth: js.UndefOr[scala.Boolean] = js.undefined,
    cpuClass: js.UndefOr[scala.Boolean] = js.undefined,
    deviceMemory: js.UndefOr[scala.Boolean] = js.undefined,
    doNotTrack: js.UndefOr[scala.Boolean] = js.undefined,
    enumerateDevices: js.UndefOr[scala.Boolean] = js.undefined,
    fonts: js.UndefOr[scala.Boolean] = js.undefined,
    fontsFlash: js.UndefOr[scala.Boolean] = js.undefined,
    hardwareConcurrency: js.UndefOr[scala.Boolean] = js.undefined,
    hasLiedBrowser: js.UndefOr[scala.Boolean] = js.undefined,
    hasLiedLanguages: js.UndefOr[scala.Boolean] = js.undefined,
    hasLiedOs: js.UndefOr[scala.Boolean] = js.undefined,
    hasLiedResolution: js.UndefOr[scala.Boolean] = js.undefined,
    indexedDb: js.UndefOr[scala.Boolean] = js.undefined,
    language: js.UndefOr[scala.Boolean] = js.undefined,
    localStorage: js.UndefOr[scala.Boolean] = js.undefined,
    openDatabase: js.UndefOr[scala.Boolean] = js.undefined,
    pixelRatio: js.UndefOr[scala.Boolean] = js.undefined,
    platform: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.UndefOr[scala.Boolean] = js.undefined,
    screenResolution: js.UndefOr[scala.Boolean] = js.undefined,
    sessionStorage: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: js.UndefOr[scala.Boolean] = js.undefined,
    timezoneOffset: js.UndefOr[scala.Boolean] = js.undefined,
    touchSupport: js.UndefOr[scala.Boolean] = js.undefined,
    userAgent: js.UndefOr[scala.Boolean] = js.undefined,
    webgl: js.UndefOr[scala.Boolean] = js.undefined,
    webglVendorAndRenderer: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AdBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adBlock)) __obj.updateDynamic("adBlock")(adBlock)
    if (!js.isUndefined(addBehavior)) __obj.updateDynamic("addBehavior")(addBehavior)
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (!js.isUndefined(availableScreenResolution)) __obj.updateDynamic("availableScreenResolution")(availableScreenResolution)
    if (!js.isUndefined(canvas)) __obj.updateDynamic("canvas")(canvas)
    if (!js.isUndefined(colorDepth)) __obj.updateDynamic("colorDepth")(colorDepth)
    if (!js.isUndefined(cpuClass)) __obj.updateDynamic("cpuClass")(cpuClass)
    if (!js.isUndefined(deviceMemory)) __obj.updateDynamic("deviceMemory")(deviceMemory)
    if (!js.isUndefined(doNotTrack)) __obj.updateDynamic("doNotTrack")(doNotTrack)
    if (!js.isUndefined(enumerateDevices)) __obj.updateDynamic("enumerateDevices")(enumerateDevices)
    if (!js.isUndefined(fonts)) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(fontsFlash)) __obj.updateDynamic("fontsFlash")(fontsFlash)
    if (!js.isUndefined(hardwareConcurrency)) __obj.updateDynamic("hardwareConcurrency")(hardwareConcurrency)
    if (!js.isUndefined(hasLiedBrowser)) __obj.updateDynamic("hasLiedBrowser")(hasLiedBrowser)
    if (!js.isUndefined(hasLiedLanguages)) __obj.updateDynamic("hasLiedLanguages")(hasLiedLanguages)
    if (!js.isUndefined(hasLiedOs)) __obj.updateDynamic("hasLiedOs")(hasLiedOs)
    if (!js.isUndefined(hasLiedResolution)) __obj.updateDynamic("hasLiedResolution")(hasLiedResolution)
    if (!js.isUndefined(indexedDb)) __obj.updateDynamic("indexedDb")(indexedDb)
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage)
    if (!js.isUndefined(openDatabase)) __obj.updateDynamic("openDatabase")(openDatabase)
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio)
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(screenResolution)) __obj.updateDynamic("screenResolution")(screenResolution)
    if (!js.isUndefined(sessionStorage)) __obj.updateDynamic("sessionStorage")(sessionStorage)
    if (!js.isUndefined(timezone)) __obj.updateDynamic("timezone")(timezone)
    if (!js.isUndefined(timezoneOffset)) __obj.updateDynamic("timezoneOffset")(timezoneOffset)
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport)
    if (!js.isUndefined(userAgent)) __obj.updateDynamic("userAgent")(userAgent)
    if (!js.isUndefined(webgl)) __obj.updateDynamic("webgl")(webgl)
    if (!js.isUndefined(webglVendorAndRenderer)) __obj.updateDynamic("webglVendorAndRenderer")(webglVendorAndRenderer)
    __obj.asInstanceOf[Anon_AdBlock]
  }
}

