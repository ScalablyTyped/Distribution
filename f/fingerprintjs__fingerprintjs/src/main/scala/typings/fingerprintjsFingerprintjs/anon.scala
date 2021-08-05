package typings.fingerprintjsFingerprintjs

import typings.fingerprintjsFingerprintjs.mod.Options
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdBlock extends StObject {
    
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
    
    inline def apply(): AdBlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdBlock]
    }
    
    extension [Self <: AdBlock](x: Self) {
      
      inline def setAdBlock(value: Boolean): Self = StObject.set(x, "adBlock", value.asInstanceOf[js.Any])
      
      inline def setAdBlockUndefined: Self = StObject.set(x, "adBlock", js.undefined)
      
      inline def setAddBehavior(value: Boolean): Self = StObject.set(x, "addBehavior", value.asInstanceOf[js.Any])
      
      inline def setAddBehaviorUndefined: Self = StObject.set(x, "addBehavior", js.undefined)
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setAvailableScreenResolution(value: Boolean): Self = StObject.set(x, "availableScreenResolution", value.asInstanceOf[js.Any])
      
      inline def setAvailableScreenResolutionUndefined: Self = StObject.set(x, "availableScreenResolution", js.undefined)
      
      inline def setCanvas(value: Boolean): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setColorDepth(value: Boolean): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
      
      inline def setColorDepthUndefined: Self = StObject.set(x, "colorDepth", js.undefined)
      
      inline def setCpuClass(value: Boolean): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      inline def setCpuClassUndefined: Self = StObject.set(x, "cpuClass", js.undefined)
      
      inline def setDeviceMemory(value: Boolean): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      inline def setDeviceMemoryUndefined: Self = StObject.set(x, "deviceMemory", js.undefined)
      
      inline def setDoNotTrack(value: Boolean): Self = StObject.set(x, "doNotTrack", value.asInstanceOf[js.Any])
      
      inline def setDoNotTrackUndefined: Self = StObject.set(x, "doNotTrack", js.undefined)
      
      inline def setEnumerateDevices(value: Boolean): Self = StObject.set(x, "enumerateDevices", value.asInstanceOf[js.Any])
      
      inline def setEnumerateDevicesUndefined: Self = StObject.set(x, "enumerateDevices", js.undefined)
      
      inline def setFonts(value: Boolean): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsFlash(value: Boolean): Self = StObject.set(x, "fontsFlash", value.asInstanceOf[js.Any])
      
      inline def setFontsFlashUndefined: Self = StObject.set(x, "fontsFlash", js.undefined)
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setHardwareConcurrency(value: Boolean): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
      
      inline def setHardwareConcurrencyUndefined: Self = StObject.set(x, "hardwareConcurrency", js.undefined)
      
      inline def setHasLiedBrowser(value: Boolean): Self = StObject.set(x, "hasLiedBrowser", value.asInstanceOf[js.Any])
      
      inline def setHasLiedBrowserUndefined: Self = StObject.set(x, "hasLiedBrowser", js.undefined)
      
      inline def setHasLiedLanguages(value: Boolean): Self = StObject.set(x, "hasLiedLanguages", value.asInstanceOf[js.Any])
      
      inline def setHasLiedLanguagesUndefined: Self = StObject.set(x, "hasLiedLanguages", js.undefined)
      
      inline def setHasLiedOs(value: Boolean): Self = StObject.set(x, "hasLiedOs", value.asInstanceOf[js.Any])
      
      inline def setHasLiedOsUndefined: Self = StObject.set(x, "hasLiedOs", js.undefined)
      
      inline def setHasLiedResolution(value: Boolean): Self = StObject.set(x, "hasLiedResolution", value.asInstanceOf[js.Any])
      
      inline def setHasLiedResolutionUndefined: Self = StObject.set(x, "hasLiedResolution", js.undefined)
      
      inline def setIndexedDb(value: Boolean): Self = StObject.set(x, "indexedDb", value.asInstanceOf[js.Any])
      
      inline def setIndexedDbUndefined: Self = StObject.set(x, "indexedDb", js.undefined)
      
      inline def setLanguage(value: Boolean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setOpenDatabase(value: Boolean): Self = StObject.set(x, "openDatabase", value.asInstanceOf[js.Any])
      
      inline def setOpenDatabaseUndefined: Self = StObject.set(x, "openDatabase", js.undefined)
      
      inline def setPixelRatio(value: Boolean): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setPlatform(value: Boolean): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setScreenResolution(value: Boolean): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
      
      inline def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
      
      inline def setSessionStorage(value: Boolean): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
      
      inline def setSessionStorageUndefined: Self = StObject.set(x, "sessionStorage", js.undefined)
      
      inline def setTimezone(value: Boolean): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneOffset(value: Boolean): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
      
      inline def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
      
      inline def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
      
      inline def setUserAgent(value: Boolean): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setWebgl(value: Boolean): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
      
      inline def setWebglUndefined: Self = StObject.set(x, "webgl", js.undefined)
      
      inline def setWebglVendorAndRenderer(value: Boolean): Self = StObject.set(x, "webglVendorAndRenderer", value.asInstanceOf[js.Any])
      
      inline def setWebglVendorAndRendererUndefined: Self = StObject.set(x, "webglVendorAndRenderer", js.undefined)
    }
  }
  
  trait DetectScreenOrientation extends StObject {
    
    /**
      * To ensure consistent fingerprints when users rotate their mobile devices
      */
    var detectScreenOrientation: Boolean
  }
  object DetectScreenOrientation {
    
    inline def apply(detectScreenOrientation: Boolean): DetectScreenOrientation = {
      val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectScreenOrientation]
    }
    
    extension [Self <: DetectScreenOrientation](x: Self) {
      
      inline def setDetectScreenOrientation(value: Boolean): Self = StObject.set(x, "detectScreenOrientation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExcludeIE extends StObject {
    
    var excludeIE: Boolean
    
    var sortPluginsFor: js.Array[RegExp]
  }
  object ExcludeIE {
    
    inline def apply(excludeIE: Boolean, sortPluginsFor: js.Array[RegExp]): ExcludeIE = {
      val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeIE]
    }
    
    extension [Self <: ExcludeIE](x: Self) {
      
      inline def setExcludeIE(value: Boolean): Self = StObject.set(x, "excludeIE", value.asInstanceOf[js.Any])
      
      inline def setSortPluginsFor(value: js.Array[RegExp]): Self = StObject.set(x, "sortPluginsFor", value.asInstanceOf[js.Any])
      
      inline def setSortPluginsForVarargs(value: RegExp*): Self = StObject.set(x, "sortPluginsFor", js.Array(value :_*))
    }
  }
  
  trait ExcludeIOS11 extends StObject {
    
    /**
      * On iOS 11, audio context can only be used in response to user interaction.
      * We require users to explicitly enable audio fingerprinting on iOS 11.
      * See https://stackoverflow.com/questions/46363048/onaudioprocess-not-called-on-ios11#46534088
      */
    var excludeIOS11: Boolean
    
    var timeout: Double
  }
  object ExcludeIOS11 {
    
    inline def apply(excludeIOS11: Boolean, timeout: Double): ExcludeIOS11 = {
      val __obj = js.Dynamic.literal(excludeIOS11 = excludeIOS11.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeIOS11]
    }
    
    extension [Self <: ExcludeIOS11](x: Self) {
      
      inline def setExcludeIOS11(value: Boolean): Self = StObject.set(x, "excludeIOS11", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendedJsFonts extends StObject {
    
    var extendedJsFonts: Boolean
    
    var swfContainerId: String
    
    var swfPath: String
    
    var userDefinedFonts: js.Array[String]
  }
  object ExtendedJsFonts {
    
    inline def apply(
      extendedJsFonts: Boolean,
      swfContainerId: String,
      swfPath: String,
      userDefinedFonts: js.Array[String]
    ): ExtendedJsFonts = {
      val __obj = js.Dynamic.literal(extendedJsFonts = extendedJsFonts.asInstanceOf[js.Any], swfContainerId = swfContainerId.asInstanceOf[js.Any], swfPath = swfPath.asInstanceOf[js.Any], userDefinedFonts = userDefinedFonts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedJsFonts]
    }
    
    extension [Self <: ExtendedJsFonts](x: Self) {
      
      inline def setExtendedJsFonts(value: Boolean): Self = StObject.set(x, "extendedJsFonts", value.asInstanceOf[js.Any])
      
      inline def setSwfContainerId(value: String): Self = StObject.set(x, "swfContainerId", value.asInstanceOf[js.Any])
      
      inline def setSwfPath(value: String): Self = StObject.set(x, "swfPath", value.asInstanceOf[js.Any])
      
      inline def setUserDefinedFonts(value: js.Array[String]): Self = StObject.set(x, "userDefinedFonts", value.asInstanceOf[js.Any])
      
      inline def setUserDefinedFontsVarargs(value: String*): Self = StObject.set(x, "userDefinedFonts", js.Array(value :_*))
    }
  }
  
  trait GetData extends StObject {
    
    def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit
    
    var key: String
    
    var pauseBefore: js.UndefOr[Boolean] = js.undefined
  }
  object GetData {
    
    inline def apply(getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit, key: String): GetData = {
      val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetData]
    }
    
    extension [Self <: GetData](x: Self) {
      
      inline def setGetData(value: (js.Function1[/* value */ js.Any, Unit], Options) => Unit): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPauseBefore(value: Boolean): Self = StObject.set(x, "pauseBefore", value.asInstanceOf[js.Any])
      
      inline def setPauseBeforeUndefined: Self = StObject.set(x, "pauseBefore", js.undefined)
    }
  }
}
