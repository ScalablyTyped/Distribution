package typings.fingerprintjsFingerprintjs

import typings.fingerprintjsFingerprintjs.anon.Duration
import typings.fingerprintjsFingerprintjs.anon.Error
import typings.fingerprintjsFingerprintjs.anon.ReadonlyGetOptions
import typings.fingerprintjsFingerprintjs.anon.ReadonlyLoadOptions
import typings.fingerprintjsFingerprintjs.anon.valueundefinederrorErrorm
import typings.std.Element
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fingerprintjs/fingerprintjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@fingerprintjs/fingerprintjs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fingerprintjs/fingerprintjs", "default.componentsToDebugString")
    @js.native
    def componentsToDebugString: js.Function1[/* components */ UnknownComponents, String] = js.native
    inline def componentsToDebugString(components: UnknownComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("componentsToDebugString")(components.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def componentsToDebugString_=(x: js.Function1[/* components */ UnknownComponents, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentsToDebugString")(x.asInstanceOf[js.Any])
    
    @JSImport("@fingerprintjs/fingerprintjs", "default.hashComponents")
    @js.native
    def hashComponents: js.Function1[/* components */ UnknownComponents, String] = js.native
    inline def hashComponents(components: UnknownComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashComponents")(components.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def hashComponents_=(x: js.Function1[/* components */ UnknownComponents, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashComponents")(x.asInstanceOf[js.Any])
    
    inline def load(): js.Promise[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Agent]]
    inline def load(param0: ReadonlyLoadOptions): js.Promise[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Agent]]
    @JSImport("@fingerprintjs/fingerprintjs", "default.load")
    @js.native
    def load_Fdefault: js.Function1[/* param0 */ js.UndefOr[ReadonlyLoadOptions], js.Promise[Agent]] = js.native
    
    inline def load_Fdefault_=(x: js.Function1[/* param0 */ js.UndefOr[ReadonlyLoadOptions], js.Promise[Agent]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("load")(x.asInstanceOf[js.Any])
  }
  
  inline def componentsToDebugString(components: UnknownComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("componentsToDebugString")(components.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def getFullscreenElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullscreenElement")().asInstanceOf[Element | Null]
  
  inline def getScreenFrame(): js.Function0[js.Promise[FrameSize]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenFrame")().asInstanceOf[js.Function0[js.Promise[FrameSize]]]
  
  inline def hashComponents(components: UnknownComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashComponents")(components.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Checks whether the device runs on Android without using user-agent.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the browser is based on Chromium without using user-agent.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isChromium(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromium")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the WebKit browser is a desktop Safari.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isDesktopSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDesktopSafari")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the browser is based on EdgeHTML (the pre-Chromium Edge engine) without using user-agent.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isEdgeHTML(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeHTML")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the browser is based on Gecko (Firefox engine) without using user-agent.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isGecko(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGecko")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the browser is based on Trident (the Internet Explorer engine) without using user-agent.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isTrident(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrident")().asInstanceOf[Boolean]
  
  /**
    * Checks whether the browser is based on mobile or desktop Safari without using user-agent.
    * All iOS browsers use WebKit (the Safari engine).
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def isWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebKit")().asInstanceOf[Boolean]
  
  /**
    * Builds an instance of Agent and waits a delay required for a proper operation.
    */
  inline def load(): js.Promise[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Agent]]
  inline def load(param0: ReadonlyLoadOptions): js.Promise[Agent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Agent]]
  
  /**
    * Loads the given entropy sources. Returns a function that collects the entropy components.
    *
    * The result is returned synchronously in order to allow start getting the components
    * before the sources are loaded completely.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def loadSources[TSourceOptions, TSources /* <: UnknownSources[TSourceOptions] */, TExclude /* <: String */](sources: TSources, sourceOptions: TSourceOptions, excludeSources: js.Array[TExclude]): js.Function0[js.Promise[Omit[SourcesToComponents[TSources], TExclude]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")(sources.asInstanceOf[js.Any], sourceOptions.asInstanceOf[js.Any], excludeSources.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Omit[SourcesToComponents[TSources], TExclude]]]]
  
  /* was `typeof x64hash128` */
  inline def murmurX64Hash128(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("murmurX64Hash128")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def murmurX64Hash128(key: String, seed: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("murmurX64Hash128")(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * A delay is required to ensure consistent entropy components.
    * See https://github.com/fingerprintjs/fingerprintjs/issues/254
    * and https://github.com/fingerprintjs/fingerprintjs/issues/307
    * and https://github.com/fingerprintjs/fingerprintjs/commit/945633e7c5f67ae38eb0fea37349712f0e669b18
    */
  inline def prepareForSources(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareForSources")().asInstanceOf[js.Promise[Unit]]
  inline def prepareForSources(delayFallback: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareForSources")(delayFallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * The list of entropy sources used to make visitor identifiers.
    *
    * This value isn't restricted by Semantic Versioning, i.e. it may be changed without bumping minor or major version of
    * this package.
    *
    * Note: Rollup and Webpack are smart enough to remove unused properties of this object during tree-shaking, so there is
    * no need to export the sources individually.
    */
  object sources {
    
    @JSImport("@fingerprintjs/fingerprintjs", "sources")
    @js.native
    val ^ : js.Any = js.native
    
    inline def audio(): Double | js.Function0[js.Promise[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")().asInstanceOf[Double | js.Function0[js.Promise[Double]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.audio")
    @js.native
    def audio_Fsources: js.Function0[Double | js.Function0[js.Promise[Double]]] = js.native
    
    inline def audio_Fsources_=(x: js.Function0[Double | js.Function0[js.Promise[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audio")(x.asInstanceOf[js.Any])
    
    inline def canvas(): CanvasFingerprint = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[CanvasFingerprint]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.canvas")
    @js.native
    def canvas_Fsources: js.Function0[CanvasFingerprint] = js.native
    
    inline def canvas_Fsources_=(x: js.Function0[CanvasFingerprint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvas")(x.asInstanceOf[js.Any])
    
    inline def colorDepth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDepth")().asInstanceOf[Double]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.colorDepth")
    @js.native
    def colorDepth_Fsources: js.Function0[Double] = js.native
    
    inline def colorDepth_Fsources_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(x.asInstanceOf[js.Any])
    
    inline def colorGamut(): js.UndefOr[ColorGamut] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorGamut")().asInstanceOf[js.UndefOr[ColorGamut]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.colorGamut")
    @js.native
    def colorGamut_Fsources: js.Function0[js.UndefOr[ColorGamut]] = js.native
    
    inline def colorGamut_Fsources_=(x: js.Function0[js.UndefOr[ColorGamut]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorGamut")(x.asInstanceOf[js.Any])
    
    inline def contrast(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrast")().asInstanceOf[js.UndefOr[Double]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.contrast")
    @js.native
    def contrast_Fsources: js.Function0[js.UndefOr[Double]] = js.native
    
    inline def contrast_Fsources_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contrast")(x.asInstanceOf[js.Any])
    
    inline def cookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cookiesEnabled")().asInstanceOf[Boolean]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.cookiesEnabled")
    @js.native
    def cookiesEnabled_Fsources: js.Function0[Boolean] = js.native
    
    inline def cookiesEnabled_Fsources_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesEnabled")(x.asInstanceOf[js.Any])
    
    inline def cpuClass(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuClass")().asInstanceOf[js.UndefOr[String]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.cpuClass")
    @js.native
    def cpuClass_Fsources: js.Function0[js.UndefOr[String]] = js.native
    
    inline def cpuClass_Fsources_=(x: js.Function0[js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(x.asInstanceOf[js.Any])
    
    inline def deviceMemory(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("deviceMemory")().asInstanceOf[js.UndefOr[Double]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.deviceMemory")
    @js.native
    def deviceMemory_Fsources: js.Function0[js.UndefOr[Double]] = js.native
    
    inline def deviceMemory_Fsources_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceMemory")(x.asInstanceOf[js.Any])
    
    inline def domBlockers(): js.Promise[js.UndefOr[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("domBlockers")().asInstanceOf[js.Promise[js.UndefOr[js.Array[String]]]]
    inline def domBlockers(param0: Options): js.Promise[js.UndefOr[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("domBlockers")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[String]]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.domBlockers")
    @js.native
    def domBlockers_Fsources: js.Function1[/* param0 */ js.UndefOr[Options], js.Promise[js.UndefOr[js.Array[String]]]] = js.native
    
    inline def domBlockers_Fsources_=(x: js.Function1[/* param0 */ js.UndefOr[Options], js.Promise[js.UndefOr[js.Array[String]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domBlockers")(x.asInstanceOf[js.Any])
    
    inline def fontPreferences(): js.Promise[Record[String, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontPreferences")().asInstanceOf[js.Promise[Record[String, Double]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.fontPreferences")
    @js.native
    def fontPreferences_Fsources: js.Function0[js.Promise[Record[String, Double]]] = js.native
    
    inline def fontPreferences_Fsources_=(x: js.Function0[js.Promise[Record[String, Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontPreferences")(x.asInstanceOf[js.Any])
    
    inline def fonts(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fonts")().asInstanceOf[js.Promise[js.Array[String]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.fonts")
    @js.native
    def fonts_Fsources: js.Function0[js.Promise[js.Array[String]]] = js.native
    
    inline def fonts_Fsources_=(x: js.Function0[js.Promise[js.Array[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
    
    inline def forcedColors(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("forcedColors")().asInstanceOf[js.UndefOr[Boolean]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.forcedColors")
    @js.native
    def forcedColors_Fsources: js.Function0[js.UndefOr[Boolean]] = js.native
    
    inline def forcedColors_Fsources_=(x: js.Function0[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forcedColors")(x.asInstanceOf[js.Any])
    
    inline def hardwareConcurrency(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hardwareConcurrency")().asInstanceOf[js.UndefOr[Double]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.hardwareConcurrency")
    @js.native
    def hardwareConcurrency_Fsources: js.Function0[js.UndefOr[Double]] = js.native
    
    inline def hardwareConcurrency_Fsources_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hardwareConcurrency")(x.asInstanceOf[js.Any])
    
    inline def hdr(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hdr")().asInstanceOf[js.UndefOr[Boolean]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.hdr")
    @js.native
    def hdr_Fsources: js.Function0[js.UndefOr[Boolean]] = js.native
    
    inline def hdr_Fsources_=(x: js.Function0[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hdr")(x.asInstanceOf[js.Any])
    
    inline def indexedDB(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexedDB")().asInstanceOf[js.UndefOr[Boolean]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.indexedDB")
    @js.native
    def indexedDB_Fsources: js.Function0[js.UndefOr[Boolean]] = js.native
    
    inline def indexedDB_Fsources_=(x: js.Function0[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(x.asInstanceOf[js.Any])
    
    inline def invertedColors(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("invertedColors")().asInstanceOf[js.UndefOr[Boolean]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.invertedColors")
    @js.native
    def invertedColors_Fsources: js.Function0[js.UndefOr[Boolean]] = js.native
    
    inline def invertedColors_Fsources_=(x: js.Function0[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invertedColors")(x.asInstanceOf[js.Any])
    
    inline def languages(): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")().asInstanceOf[js.Array[js.Array[String]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.languages")
    @js.native
    def languages_Fsources: js.Function0[js.Array[js.Array[String]]] = js.native
    
    inline def languages_Fsources_=(x: js.Function0[js.Array[js.Array[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    inline def localStorage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("localStorage")().asInstanceOf[Boolean]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.localStorage")
    @js.native
    def localStorage_Fsources: js.Function0[Boolean] = js.native
    
    inline def localStorage_Fsources_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
    
    inline def math(): Record[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("math")().asInstanceOf[Record[String, Double]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.math")
    @js.native
    def math_Fsources: js.Function0[Record[String, Double]] = js.native
    
    inline def math_Fsources_=(x: js.Function0[Record[String, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("math")(x.asInstanceOf[js.Any])
    
    inline def monochrome(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("monochrome")().asInstanceOf[js.UndefOr[Double]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.monochrome")
    @js.native
    def monochrome_Fsources: js.Function0[js.UndefOr[Double]] = js.native
    
    inline def monochrome_Fsources_=(x: js.Function0[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(x.asInstanceOf[js.Any])
    
    inline def openDatabase(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")().asInstanceOf[Boolean]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.openDatabase")
    @js.native
    def openDatabase_Fsources: js.Function0[Boolean] = js.native
    
    inline def openDatabase_Fsources_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(x.asInstanceOf[js.Any])
    
    inline def osCpu(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("osCpu")().asInstanceOf[js.UndefOr[String]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.osCpu")
    @js.native
    def osCpu_Fsources: js.Function0[js.UndefOr[String]] = js.native
    
    inline def osCpu_Fsources_=(x: js.Function0[js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("osCpu")(x.asInstanceOf[js.Any])
    
    inline def platform(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[String]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.platform")
    @js.native
    def platform_Fsources: js.Function0[String] = js.native
    
    inline def platform_Fsources_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
    
    inline def plugins(): js.UndefOr[js.Array[PluginData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugins")().asInstanceOf[js.UndefOr[js.Array[PluginData]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.plugins")
    @js.native
    def plugins_Fsources: js.Function0[js.UndefOr[js.Array[PluginData]]] = js.native
    
    inline def plugins_Fsources_=(x: js.Function0[js.UndefOr[js.Array[PluginData]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
    
    inline def reducedMotion(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("reducedMotion")().asInstanceOf[js.UndefOr[Boolean]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.reducedMotion")
    @js.native
    def reducedMotion_Fsources: js.Function0[js.UndefOr[Boolean]] = js.native
    
    inline def reducedMotion_Fsources_=(x: js.Function0[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reducedMotion")(x.asInstanceOf[js.Any])
    
    inline def screenFrame(): js.Function0[js.Promise[FrameSize]] = ^.asInstanceOf[js.Dynamic].applyDynamic("screenFrame")().asInstanceOf[js.Function0[js.Promise[FrameSize]]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.screenFrame")
    @js.native
    def screenFrame_Fsources: js.Function0[js.Function0[js.Promise[FrameSize]]] = js.native
    
    inline def screenFrame_Fsources_=(x: js.Function0[js.Function0[js.Promise[FrameSize]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenFrame")(x.asInstanceOf[js.Any])
    
    inline def screenResolution(): js.Tuple2[Double | Null, Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("screenResolution")().asInstanceOf[js.Tuple2[Double | Null, Double | Null]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.screenResolution")
    @js.native
    def screenResolution_Fsources: js.Function0[js.Tuple2[Double | Null, Double | Null]] = js.native
    
    inline def screenResolution_Fsources_=(x: js.Function0[js.Tuple2[Double | Null, Double | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenResolution")(x.asInstanceOf[js.Any])
    
    inline def sessionStorage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionStorage")().asInstanceOf[Boolean]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.sessionStorage")
    @js.native
    def sessionStorage_Fsources: js.Function0[Boolean] = js.native
    
    inline def sessionStorage_Fsources_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sessionStorage")(x.asInstanceOf[js.Any])
    
    inline def timezone(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timezone")().asInstanceOf[String]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.timezone")
    @js.native
    def timezone_Fsources: js.Function0[String] = js.native
    
    inline def timezone_Fsources_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timezone")(x.asInstanceOf[js.Any])
    
    inline def touchSupport(): TouchSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("touchSupport")().asInstanceOf[TouchSupport]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.touchSupport")
    @js.native
    def touchSupport_Fsources: js.Function0[TouchSupport] = js.native
    
    inline def touchSupport_Fsources_=(x: js.Function0[TouchSupport]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(x.asInstanceOf[js.Any])
    
    inline def vendor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vendor")().asInstanceOf[String]
    
    inline def vendorFlavors(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("vendorFlavors")().asInstanceOf[js.Array[String]]
    @JSImport("@fingerprintjs/fingerprintjs", "sources.vendorFlavors")
    @js.native
    def vendorFlavors_Fsources: js.Function0[js.Array[String]] = js.native
    
    inline def vendorFlavors_Fsources_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vendorFlavors")(x.asInstanceOf[js.Any])
    
    @JSImport("@fingerprintjs/fingerprintjs", "sources.vendor")
    @js.native
    def vendor_Fsources: js.Function0[String] = js.native
    
    inline def vendor_Fsources_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vendor")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Modifies an entropy source by transforming its returned value with the given function.
    * Keeps the source properties: sync/async, 1/2 stages.
    *
    * Warning for package users:
    * This function is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  inline def transformSource[TOptions, TValueBefore, TValueAfter](
    source: Source[TOptions, TValueBefore],
    transformValue: js.Function1[/* value */ TValueBefore, TValueAfter]
  ): Source[TOptions, TValueAfter] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSource")(source.asInstanceOf[js.Any], transformValue.asInstanceOf[js.Any])).asInstanceOf[Source[TOptions, TValueAfter]]
  
  /**
    * Agent object that can get visitor identifier
    */
  @js.native
  trait Agent extends StObject {
    
    /**
      * Gets the visitor identifier
      */
    def get(): js.Promise[GetResult] = js.native
    def get(options: ReadonlyGetOptions): js.Promise[GetResult] = js.native
  }
  
  /**
    * List of components from the built-in entropy sources.
    *
    * Warning! This type is out of Semantic Versioning, i.e. may have incompatible changes within a major version. If you
    * want to avoid breaking changes, use `UnknownComponents` instead that is more generic but guarantees backward
    * compatibility within a major version. This is because browsers change constantly and therefore entropy sources have
    * to change too.
    */
  /* Inlined @fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.SourcesToComponents<{  fonts :typeof getFonts,   domBlockers :typeof getDomBlockers,   fontPreferences :typeof getFontPreferences,   audio :typeof getAudioFingerprint,   screenFrame :typeof getRoundedScreenFrame,   osCpu :typeof getOsCpu,   languages :typeof getLanguages,   colorDepth :typeof getColorDepth,   deviceMemory :typeof getDeviceMemory,   screenResolution :typeof getScreenResolution,   hardwareConcurrency :typeof getHardwareConcurrency,   timezone :typeof getTimezone,   sessionStorage :typeof getSessionStorage,   localStorage :typeof getLocalStorage,   indexedDB :typeof getIndexedDB,   openDatabase :typeof getOpenDatabase,   cpuClass :typeof getCpuClass,   platform :typeof getPlatform,   plugins :typeof getPlugins,   canvas :typeof getCanvasFingerprint,   touchSupport :typeof getTouchSupport,   vendor :typeof getVendor,   vendorFlavors :typeof getVendorFlavors,   cookiesEnabled :typeof areCookiesEnabled,   colorGamut :typeof getColorGamut,   invertedColors :typeof areColorsInverted,   forcedColors :typeof areColorsForced,   monochrome :typeof getMonochromeDepth,   contrast :typeof getContrastPreference,   reducedMotion :typeof isMotionReduced,   hdr :typeof isHDR,   math :typeof getMathFingerprint}> */
  trait BuiltinComponents extends StObject {
    
    var audio: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAudioFingerprint */ js.Any
        ]
      ]
    
    var canvas: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCanvasFingerprint */ js.Any
        ]
      ]
    
    var colorDepth: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorDepth */ js.Any
        ]
      ]
    
    var colorGamut: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorGamut */ js.Any
        ]
      ]
    
    var contrast: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getContrastPreference */ js.Any
        ]
      ]
    
    var cookiesEnabled: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof areCookiesEnabled */ js.Any
        ]
      ]
    
    var cpuClass: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCpuClass */ js.Any
        ]
      ]
    
    var deviceMemory: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getDeviceMemory */ js.Any
        ]
      ]
    
    var domBlockers: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomBlockers */ js.Any
        ]
      ]
    
    var fontPreferences: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getFontPreferences */ js.Any
        ]
      ]
    
    var fonts: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getFonts */ js.Any
        ]
      ]
    
    var forcedColors: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsForced */ js.Any
        ]
      ]
    
    var hardwareConcurrency: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHardwareConcurrency */ js.Any
        ]
      ]
    
    var hdr: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isHDR */ js.Any
        ]
      ]
    
    var indexedDB: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getIndexedDB */ js.Any
        ]
      ]
    
    var invertedColors: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsInverted */ js.Any
        ]
      ]
    
    var languages: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getLanguages */ js.Any
        ]
      ]
    
    var localStorage: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocalStorage */ js.Any
        ]
      ]
    
    var math: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getMathFingerprint */ js.Any
        ]
      ]
    
    var monochrome: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getMonochromeDepth */ js.Any
        ]
      ]
    
    var openDatabase: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getOpenDatabase */ js.Any
        ]
      ]
    
    var osCpu: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getOsCpu */ js.Any
        ]
      ]
    
    var platform: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlatform */ js.Any
        ]
      ]
    
    var plugins: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlugins */ js.Any
        ]
      ]
    
    var reducedMotion: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isMotionReduced */ js.Any
        ]
      ]
    
    var screenFrame: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getRoundedScreenFrame */ js.Any
        ]
      ]
    
    var screenResolution: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getScreenResolution */ js.Any
        ]
      ]
    
    var sessionStorage: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getSessionStorage */ js.Any
        ]
      ]
    
    var timezone: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTimezone */ js.Any
        ]
      ]
    
    var touchSupport: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTouchSupport */ js.Any
        ]
      ]
    
    var vendor: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendor */ js.Any
        ]
      ]
    
    var vendorFlavors: Component[
        SourceValue[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendorFlavors */ js.Any
        ]
      ]
  }
  object BuiltinComponents {
    
    inline def apply(
      audio: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAudioFingerprint */ js.Any
          ]
        ],
      canvas: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCanvasFingerprint */ js.Any
          ]
        ],
      colorDepth: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorDepth */ js.Any
          ]
        ],
      colorGamut: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorGamut */ js.Any
          ]
        ],
      contrast: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getContrastPreference */ js.Any
          ]
        ],
      cookiesEnabled: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof areCookiesEnabled */ js.Any
          ]
        ],
      cpuClass: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCpuClass */ js.Any
          ]
        ],
      deviceMemory: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getDeviceMemory */ js.Any
          ]
        ],
      domBlockers: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomBlockers */ js.Any
          ]
        ],
      fontPreferences: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getFontPreferences */ js.Any
          ]
        ],
      fonts: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getFonts */ js.Any
          ]
        ],
      forcedColors: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsForced */ js.Any
          ]
        ],
      hardwareConcurrency: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHardwareConcurrency */ js.Any
          ]
        ],
      hdr: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isHDR */ js.Any
          ]
        ],
      indexedDB: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getIndexedDB */ js.Any
          ]
        ],
      invertedColors: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsInverted */ js.Any
          ]
        ],
      languages: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getLanguages */ js.Any
          ]
        ],
      localStorage: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocalStorage */ js.Any
          ]
        ],
      math: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getMathFingerprint */ js.Any
          ]
        ],
      monochrome: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getMonochromeDepth */ js.Any
          ]
        ],
      openDatabase: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getOpenDatabase */ js.Any
          ]
        ],
      osCpu: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getOsCpu */ js.Any
          ]
        ],
      platform: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlatform */ js.Any
          ]
        ],
      plugins: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlugins */ js.Any
          ]
        ],
      reducedMotion: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isMotionReduced */ js.Any
          ]
        ],
      screenFrame: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getRoundedScreenFrame */ js.Any
          ]
        ],
      screenResolution: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getScreenResolution */ js.Any
          ]
        ],
      sessionStorage: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getSessionStorage */ js.Any
          ]
        ],
      timezone: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTimezone */ js.Any
          ]
        ],
      touchSupport: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTouchSupport */ js.Any
          ]
        ],
      vendor: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendor */ js.Any
          ]
        ],
      vendorFlavors: Component[
          SourceValue[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendorFlavors */ js.Any
          ]
        ]
    ): BuiltinComponents = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], colorGamut = colorGamut.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], cookiesEnabled = cookiesEnabled.asInstanceOf[js.Any], cpuClass = cpuClass.asInstanceOf[js.Any], deviceMemory = deviceMemory.asInstanceOf[js.Any], domBlockers = domBlockers.asInstanceOf[js.Any], fontPreferences = fontPreferences.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], forcedColors = forcedColors.asInstanceOf[js.Any], hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any], hdr = hdr.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any], invertedColors = invertedColors.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], openDatabase = openDatabase.asInstanceOf[js.Any], osCpu = osCpu.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reducedMotion = reducedMotion.asInstanceOf[js.Any], screenFrame = screenFrame.asInstanceOf[js.Any], screenResolution = screenResolution.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorFlavors = vendorFlavors.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltinComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuiltinComponents] (val x: Self) extends AnyVal {
      
      inline def setAudio(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getAudioFingerprint */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setCanvas(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCanvasFingerprint */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setColorDepth(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorDepth */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
      
      inline def setColorGamut(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getColorGamut */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "colorGamut", value.asInstanceOf[js.Any])
      
      inline def setContrast(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getContrastPreference */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setCookiesEnabled(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof areCookiesEnabled */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "cookiesEnabled", value.asInstanceOf[js.Any])
      
      inline def setCpuClass(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCpuClass */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      inline def setDeviceMemory(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getDeviceMemory */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "deviceMemory", value.asInstanceOf[js.Any])
      
      inline def setDomBlockers(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomBlockers */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "domBlockers", value.asInstanceOf[js.Any])
      
      inline def setFontPreferences(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getFontPreferences */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "fontPreferences", value.asInstanceOf[js.Any])
      
      inline def setFonts(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getFonts */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setForcedColors(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsForced */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "forcedColors", value.asInstanceOf[js.Any])
      
      inline def setHardwareConcurrency(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getHardwareConcurrency */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
      
      inline def setHdr(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isHDR */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "hdr", value.asInstanceOf[js.Any])
      
      inline def setIndexedDB(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getIndexedDB */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
      
      inline def setInvertedColors(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof areColorsInverted */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "invertedColors", value.asInstanceOf[js.Any])
      
      inline def setLanguages(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getLanguages */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLocalStorage(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getLocalStorage */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setMath(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getMathFingerprint */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
      
      inline def setMonochrome(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getMonochromeDepth */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      inline def setOpenDatabase(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getOpenDatabase */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "openDatabase", value.asInstanceOf[js.Any])
      
      inline def setOsCpu(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getOsCpu */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "osCpu", value.asInstanceOf[js.Any])
      
      inline def setPlatform(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlatform */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlugins(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getPlugins */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setReducedMotion(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isMotionReduced */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "reducedMotion", value.asInstanceOf[js.Any])
      
      inline def setScreenFrame(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getRoundedScreenFrame */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "screenFrame", value.asInstanceOf[js.Any])
      
      inline def setScreenResolution(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getScreenResolution */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
      
      inline def setSessionStorage(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getSessionStorage */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
      
      inline def setTimezone(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTimezone */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTouchSupport(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTouchSupport */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
      
      inline def setVendor(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendor */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorFlavors(
        value: Component[
              SourceValue[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getVendorFlavors */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "vendorFlavors", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasFingerprint extends StObject {
    
    var geometry: String
    
    var text: String
    
    var winding: Boolean
  }
  object CanvasFingerprint {
    
    inline def apply(geometry: String, text: String, winding: Boolean): CanvasFingerprint = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], winding = winding.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasFingerprint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasFingerprint] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setWinding(value: Boolean): Self = StObject.set(x, "winding", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.srgb
    - typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.p3
    - typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.rec2020
  */
  trait ColorGamut extends StObject
  object ColorGamut {
    
    inline def p3: typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.p3 = "p3".asInstanceOf[typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.p3]
    
    inline def rec2020: typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.rec2020 = "rec2020".asInstanceOf[typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.rec2020]
    
    inline def srgb: typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.srgb = "srgb".asInstanceOf[typings.fingerprintjsFingerprintjs.fingerprintjsFingerprintjsStrings.srgb]
  }
  
  /**
    * Result of getting entropy data from a source
    */
  type Component[T] = (Error[T] & Duration) | valueundefinederrorErrorm
  
  trait Confidence extends StObject {
    
    /**
      * Additional details about the score as a human-readable text
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * A number between 0 and 1 that tells how much the agent is sure about the visitor identifier.
      * The higher the number, the higher the chance of the visitor identifier to be true.
      */
    var score: Double
  }
  object Confidence {
    
    inline def apply(score: Double): Confidence = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The order matches the CSS side order: top, right, bottom, left.
    *
    * @ignore Named array elements aren't used because of multiple TypeScript compatibility complaints from users
    */
  type FrameSize = js.Tuple4[Double | Null, Double | Null, Double | Null, Double | Null]
  
  /**
    * Options for getting visitor identifier
    */
  trait GetOptions extends StObject {
    
    /**
      * Whether to print debug messages to the console.
      *
      * @deprecated Use the `debug` option of `load()` instead
      */
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  /**
    * Result of getting a visitor identifier
    */
  trait GetResult extends StObject {
    
    /**
      * List of components that has formed the visitor identifier.
      *
      * Warning! The type of this property is specific but out of Semantic Versioning, i.e. may have incompatible changes
      * within a major version. If you want to avoid breaking changes, treat the property as having type
      * `UnknownComponents` that is more generic but guarantees backward compatibility within a major version.
      */
    var components: BuiltinComponents
    
    /**
      * A confidence score that tells how much the agent is sure about the visitor identifier
      */
    var confidence: Confidence
    
    /**
      * The fingerprinting algorithm version
      *
      * @see https://github.com/fingerprintjs/fingerprintjs#version-policy For more details
      */
    var version: String
    
    /**
      * The visitor identifier
      */
    var visitorId: String
  }
  object GetResult {
    
    inline def apply(components: BuiltinComponents, confidence: Confidence, version: String, visitorId: String): GetResult = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visitorId = visitorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetResult] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: BuiltinComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setConfidence(value: Confidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for Fingerprint class loading
    */
  trait LoadOptions extends StObject {
    
    /**
      * Whether to print debug messages to the console.
      * Required to ease investigations of problems.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When browser doesn't support `requestIdleCallback` a `setTimeout` will be used. This number is only for Safari and
      * old Edge, because Chrome/Blink based browsers support `requestIdleCallback`. The value is in milliseconds.
      * @default 50
      */
    var delayFallback: js.UndefOr[Double] = js.undefined
    
    /**
      * Set `false` to disable the unpersonalized AJAX request that the agent sends to collect installation statistics.
      * It's always disabled in the version published to the FingerprintJS CDN.
      */
    var monitoring: js.UndefOr[Boolean] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelayFallback(value: Double): Self = StObject.set(x, "delayFallback", value.asInstanceOf[js.Any])
      
      inline def setDelayFallbackUndefined: Self = StObject.set(x, "delayFallback", js.undefined)
      
      inline def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    }
  }
  
  type MaybePromise[T] = js.Promise[T] | T
  
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait PluginData extends StObject {
    
    var description: String
    
    var mimeTypes: js.Array[PluginMimeTypeData]
    
    var name: String
  }
  object PluginData {
    
    inline def apply(description: String, mimeTypes: js.Array[PluginMimeTypeData], name: String): PluginData = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginData] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setMimeTypes(value: js.Array[PluginMimeTypeData]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesVarargs(value: PluginMimeTypeData*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginMimeTypeData extends StObject {
    
    var suffixes: String
    
    var `type`: String
  }
  object PluginMimeTypeData {
    
    inline def apply(suffixes: String, `type`: String): PluginMimeTypeData = {
      val __obj = js.Dynamic.literal(suffixes = suffixes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginMimeTypeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginMimeTypeData] (val x: Self) extends AnyVal {
      
      inline def setSuffixes(value: String): Self = StObject.set(x, "suffixes", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A functions that returns data with entropy to identify visitor.
    *
    * See https://github.com/fingerprintjs/fingerprintjs/blob/master/contributing.md#how-to-make-an-entropy-source
    * to learn how entropy source works and how to make your own.
    */
  type Source[TOptions, TValue] = js.Function1[/* options */ TOptions, MaybePromise[TValue | js.Function0[MaybePromise[TValue]]]]
  
  /**
    * Converts an entropy source type into the component type
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TSource extends @fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.Source<any, infer T> ? T : never
    }}}
    */
  @js.native
  trait SourceValue[TSource /* <: Source[Any, Any] */] extends StObject
  
  /**
    * Converts an entropy source list type to a corresponding component list type.
    *
    * Warning for package users:
    * This type is out of Semantic Versioning, i.e. can change unexpectedly. Usage is at your own risk.
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof TSources ]: @fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.Component<@fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.SourceValue<TSources[K]>>}
    }}}
    */
  @js.native
  trait SourcesToComponents[TSources /* <: UnknownSources[Any] */] extends StObject
  
  trait TouchSupport extends StObject {
    
    var maxTouchPoints: Double
    
    /** The success or failure of creating a TouchEvent */
    var touchEvent: Boolean
    
    /** The availability of the "ontouchstart" property */
    var touchStart: Boolean
  }
  object TouchSupport {
    
    inline def apply(maxTouchPoints: Double, touchEvent: Boolean, touchStart: Boolean): TouchSupport = {
      val __obj = js.Dynamic.literal(maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], touchEvent = touchEvent.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchSupport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TouchSupport] (val x: Self) extends AnyVal {
      
      inline def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      inline def setTouchEvent(value: Boolean): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      inline def setTouchStart(value: Boolean): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Generic dictionary of unknown components
    */
  type UnknownComponents = Record[String, Component[Any]]
  
  /**
    * Generic dictionary of unknown sources
    */
  type UnknownSources[TOptions] = Record[String, Source[TOptions, Any]]
}
