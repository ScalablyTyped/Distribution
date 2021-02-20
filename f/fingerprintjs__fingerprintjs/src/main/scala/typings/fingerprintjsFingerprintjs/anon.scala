package typings.fingerprintjsFingerprintjs

import typings.fingerprintjsFingerprintjs.mod.Options
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdBlock extends StObject {
    
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
    implicit class AdBlockMutableBuilder[Self <: AdBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdBlock(value: Boolean): Self = StObject.set(x, "adBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdBlockUndefined: Self = StObject.set(x, "adBlock", js.undefined)
      
      @scala.inline
      def setAddBehavior(value: Boolean): Self = StObject.set(x, "addBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddBehaviorUndefined: Self = StObject.set(x, "addBehavior", js.undefined)
      
      @scala.inline
      def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setAvailableScreenResolution(value: Boolean): Self = StObject.set(x, "availableScreenResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableScreenResolutionUndefined: Self = StObject.set(x, "availableScreenResolution", js.undefined)
      
      @scala.inline
      def setCanvas(value: Boolean): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      @scala.inline
      def setColorDepth(value: Boolean): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDepthUndefined: Self = StObject.set(x, "colorDepth", js.undefined)
      
      @scala.inline
      def setCpuClass(value: Boolean): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuClassUndefined: Self = StObject.set(x, "cpuClass", js.undefined)
      
      @scala.inline
      def setDeviceMemory(value: Boolean): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceMemoryUndefined: Self = StObject.set(x, "deviceMemory", js.undefined)
      
      @scala.inline
      def setDoNotTrack(value: Boolean): Self = StObject.set(x, "doNotTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotTrackUndefined: Self = StObject.set(x, "doNotTrack", js.undefined)
      
      @scala.inline
      def setEnumerateDevices(value: Boolean): Self = StObject.set(x, "enumerateDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerateDevicesUndefined: Self = StObject.set(x, "enumerateDevices", js.undefined)
      
      @scala.inline
      def setFonts(value: Boolean): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsFlash(value: Boolean): Self = StObject.set(x, "fontsFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsFlashUndefined: Self = StObject.set(x, "fontsFlash", js.undefined)
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setHardwareConcurrency(value: Boolean): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareConcurrencyUndefined: Self = StObject.set(x, "hardwareConcurrency", js.undefined)
      
      @scala.inline
      def setHasLiedBrowser(value: Boolean): Self = StObject.set(x, "hasLiedBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLiedBrowserUndefined: Self = StObject.set(x, "hasLiedBrowser", js.undefined)
      
      @scala.inline
      def setHasLiedLanguages(value: Boolean): Self = StObject.set(x, "hasLiedLanguages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLiedLanguagesUndefined: Self = StObject.set(x, "hasLiedLanguages", js.undefined)
      
      @scala.inline
      def setHasLiedOs(value: Boolean): Self = StObject.set(x, "hasLiedOs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLiedOsUndefined: Self = StObject.set(x, "hasLiedOs", js.undefined)
      
      @scala.inline
      def setHasLiedResolution(value: Boolean): Self = StObject.set(x, "hasLiedResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLiedResolutionUndefined: Self = StObject.set(x, "hasLiedResolution", js.undefined)
      
      @scala.inline
      def setIndexedDb(value: Boolean): Self = StObject.set(x, "indexedDb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedDbUndefined: Self = StObject.set(x, "indexedDb", js.undefined)
      
      @scala.inline
      def setLanguage(value: Boolean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      @scala.inline
      def setOpenDatabase(value: Boolean): Self = StObject.set(x, "openDatabase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDatabaseUndefined: Self = StObject.set(x, "openDatabase", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Boolean): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setPlatform(value: Boolean): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setScreenResolution(value: Boolean): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
      
      @scala.inline
      def setSessionStorage(value: Boolean): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionStorageUndefined: Self = StObject.set(x, "sessionStorage", js.undefined)
      
      @scala.inline
      def setTimezone(value: Boolean): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneOffset(value: Boolean): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
      
      @scala.inline
      def setUserAgent(value: Boolean): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setWebgl(value: Boolean): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebglUndefined: Self = StObject.set(x, "webgl", js.undefined)
      
      @scala.inline
      def setWebglVendorAndRenderer(value: Boolean): Self = StObject.set(x, "webglVendorAndRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebglVendorAndRendererUndefined: Self = StObject.set(x, "webglVendorAndRenderer", js.undefined)
    }
  }
  
  @js.native
  trait DetectScreenOrientation extends StObject {
    
    /**
      * To ensure consistent fingerprints when users rotate their mobile devices
      */
    var detectScreenOrientation: Boolean = js.native
  }
  object DetectScreenOrientation {
    
    @scala.inline
    def apply(detectScreenOrientation: Boolean): DetectScreenOrientation = {
      val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectScreenOrientation]
    }
    
    @scala.inline
    implicit class DetectScreenOrientationMutableBuilder[Self <: DetectScreenOrientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectScreenOrientation(value: Boolean): Self = StObject.set(x, "detectScreenOrientation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExcludeIE extends StObject {
    
    var excludeIE: Boolean = js.native
    
    var sortPluginsFor: js.Array[RegExp] = js.native
  }
  object ExcludeIE {
    
    @scala.inline
    def apply(excludeIE: Boolean, sortPluginsFor: js.Array[RegExp]): ExcludeIE = {
      val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeIE]
    }
    
    @scala.inline
    implicit class ExcludeIEMutableBuilder[Self <: ExcludeIE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeIE(value: Boolean): Self = StObject.set(x, "excludeIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortPluginsFor(value: js.Array[RegExp]): Self = StObject.set(x, "sortPluginsFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortPluginsForVarargs(value: RegExp*): Self = StObject.set(x, "sortPluginsFor", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ExcludeIOS11 extends StObject {
    
    /**
      * On iOS 11, audio context can only be used in response to user interaction.
      * We require users to explicitly enable audio fingerprinting on iOS 11.
      * See https://stackoverflow.com/questions/46363048/onaudioprocess-not-called-on-ios11#46534088
      */
    var excludeIOS11: Boolean = js.native
    
    var timeout: Double = js.native
  }
  object ExcludeIOS11 {
    
    @scala.inline
    def apply(excludeIOS11: Boolean, timeout: Double): ExcludeIOS11 = {
      val __obj = js.Dynamic.literal(excludeIOS11 = excludeIOS11.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeIOS11]
    }
    
    @scala.inline
    implicit class ExcludeIOS11MutableBuilder[Self <: ExcludeIOS11] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeIOS11(value: Boolean): Self = StObject.set(x, "excludeIOS11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExtendedJsFonts extends StObject {
    
    var extendedJsFonts: Boolean = js.native
    
    var swfContainerId: String = js.native
    
    var swfPath: String = js.native
    
    var userDefinedFonts: js.Array[String] = js.native
  }
  object ExtendedJsFonts {
    
    @scala.inline
    def apply(
      extendedJsFonts: Boolean,
      swfContainerId: String,
      swfPath: String,
      userDefinedFonts: js.Array[String]
    ): ExtendedJsFonts = {
      val __obj = js.Dynamic.literal(extendedJsFonts = extendedJsFonts.asInstanceOf[js.Any], swfContainerId = swfContainerId.asInstanceOf[js.Any], swfPath = swfPath.asInstanceOf[js.Any], userDefinedFonts = userDefinedFonts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedJsFonts]
    }
    
    @scala.inline
    implicit class ExtendedJsFontsMutableBuilder[Self <: ExtendedJsFonts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendedJsFonts(value: Boolean): Self = StObject.set(x, "extendedJsFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfContainerId(value: String): Self = StObject.set(x, "swfContainerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfPath(value: String): Self = StObject.set(x, "swfPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDefinedFonts(value: js.Array[String]): Self = StObject.set(x, "userDefinedFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDefinedFontsVarargs(value: String*): Self = StObject.set(x, "userDefinedFonts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetData extends StObject {
    
    def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit = js.native
    
    var key: String = js.native
    
    var pauseBefore: js.UndefOr[Boolean] = js.native
  }
  object GetData {
    
    @scala.inline
    def apply(getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit, key: String): GetData = {
      val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetData]
    }
    
    @scala.inline
    implicit class GetDataMutableBuilder[Self <: GetData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetData(value: (js.Function1[/* value */ js.Any, Unit], Options) => Unit): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseBefore(value: Boolean): Self = StObject.set(x, "pauseBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseBeforeUndefined: Self = StObject.set(x, "pauseBefore", js.undefined)
    }
  }
}
