package typings.devtools

import typings.devtools.anon.Default
import typings.devtools.anon.DefaultMatch
import typings.devtools.anon.DefaultMatchRequired
import typings.devtools.anon.Match
import typings.devtools.anon.MatchRequired
import typings.devtools.anon.MatchRequiredType
import typings.devtools.anon.MessageName
import typings.devtools.anon.Required
import typings.devtools.anon.RequiredType
import typings.devtools.anon.TypeValidate
import typings.devtools.anon.Validate
import typings.devtools.devtoolsStrings.chrome
import typings.devtools.devtoolsStrings.edge
import typings.devtools.devtoolsStrings.firefox
import typings.devtools.devtoolsStrings.googColonchromeOptions
import typings.devtools.devtoolsStrings.mozColonfirefoxOptions
import typings.devtools.devtoolsStrings.msColonedgeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  object BROWSER_ERROR_MESSAGES {
    
    @JSImport("devtools/build/constants", "BROWSER_ERROR_MESSAGES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("devtools/build/constants", "BROWSER_ERROR_MESSAGES.firefoxNightly")
    @js.native
    def firefoxNightly: String = js.native
    inline def firefoxNightly_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefoxNightly")(x.asInstanceOf[js.Any])
  }
  
  object BROWSER_TYPE {
    
    @JSImport("devtools/build/constants", "BROWSER_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("devtools/build/constants", "BROWSER_TYPE.chrome")
    @js.native
    def chrome: typings.devtools.devtoolsStrings.chrome = js.native
    inline def chrome_=(x: chrome): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "BROWSER_TYPE.edge")
    @js.native
    def edge: typings.devtools.devtoolsStrings.edge = js.native
    inline def edge_=(x: edge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "BROWSER_TYPE.firefox")
    @js.native
    def firefox: typings.devtools.devtoolsStrings.firefox = js.native
    inline def firefox_=(x: firefox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("devtools/build/constants", "CHANNEL_FIREFOX_NIGHTLY")
  @js.native
  val CHANNEL_FIREFOX_NIGHTLY: /* "nightly" */ String = js.native
  
  @JSImport("devtools/build/constants", "CHANNEL_FIREFOX_TRUNK")
  @js.native
  val CHANNEL_FIREFOX_TRUNK: /* "trunk" */ String = js.native
  
  @JSImport("devtools/build/constants", "CHROME_NAMES")
  @js.native
  val CHROME_NAMES: js.Array[String] = js.native
  
  /* Inlined @wdio/types.@wdio/types.Options.Definition<@wdio/types.@wdio/types.Options.WebDriver> */
  object DEFAULTS {
    
    @JSImport("devtools/build/constants", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("devtools/build/constants", "DEFAULTS.agent")
    @js.native
    def agent: js.UndefOr[MatchRequired] = js.native
    inline def agent_=(x: js.UndefOr[MatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.capabilities")
    @js.native
    def capabilities: Validate = js.native
    inline def capabilities_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.connectionRetryCount")
    @js.native
    def connectionRetryCount: js.UndefOr[Required] = js.native
    inline def connectionRetryCount_=(x: js.UndefOr[Required]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.connectionRetryTimeout")
    @js.native
    def connectionRetryTimeout: js.UndefOr[Required] = js.native
    inline def connectionRetryTimeout_=(x: js.UndefOr[Required]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.enableDirectConnect")
    @js.native
    def enableDirectConnect: js.UndefOr[RequiredType] = js.native
    inline def enableDirectConnect_=(x: js.UndefOr[RequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDirectConnect")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.headers")
    @js.native
    def headers: js.UndefOr[MatchRequiredType] = js.native
    inline def headers_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.hostname")
    @js.native
    def hostname: js.UndefOr[TypeValidate] = js.native
    inline def hostname_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostname")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.key")
    @js.native
    def key: js.UndefOr[TypeValidate] = js.native
    inline def key_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.logLevel")
    @js.native
    def logLevel: js.UndefOr[Match] = js.native
    inline def logLevel_=(x: js.UndefOr[Match]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.logLevels")
    @js.native
    def logLevels: js.UndefOr[Default] = js.native
    inline def logLevels_=(x: js.UndefOr[Default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevels")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.outputDir")
    @js.native
    def outputDir: js.UndefOr[TypeValidate] = js.native
    inline def outputDir_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.path")
    @js.native
    def path: js.UndefOr[TypeValidate] = js.native
    inline def path_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.port")
    @js.native
    def port: js.UndefOr[Required] = js.native
    inline def port_=(x: js.UndefOr[Required]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.protocol")
    @js.native
    def protocol: js.UndefOr[TypeValidate] = js.native
    inline def protocol_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.queryParams")
    @js.native
    def queryParams: js.UndefOr[MatchRequiredType] = js.native
    inline def queryParams_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.strictSSL")
    @js.native
    def strictSSL: js.UndefOr[RequiredType] = js.native
    inline def strictSSL_=(x: js.UndefOr[RequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.transformRequest")
    @js.native
    def transformRequest: js.UndefOr[DefaultMatchRequired] = js.native
    inline def transformRequest_=(x: js.UndefOr[DefaultMatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.transformResponse")
    @js.native
    def transformResponse: js.UndefOr[DefaultMatch] = js.native
    inline def transformResponse_=(x: js.UndefOr[DefaultMatch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "DEFAULTS.user")
    @js.native
    def user: js.UndefOr[TypeValidate] = js.native
    inline def user_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("devtools/build/constants", "DEFAULT_FLAGS")
  @js.native
  val DEFAULT_FLAGS: js.Array[String] = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_HEIGHT")
  @js.native
  val DEFAULT_HEIGHT: /* 900 */ Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_IMPLICIT_TIMEOUT")
  @js.native
  val DEFAULT_IMPLICIT_TIMEOUT: /* 0 */ Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_PAGELOAD_TIMEOUT")
  @js.native
  val DEFAULT_PAGELOAD_TIMEOUT: Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_SCRIPT_TIMEOUT")
  @js.native
  val DEFAULT_SCRIPT_TIMEOUT: Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_WIDTH")
  @js.native
  val DEFAULT_WIDTH: /* 1200 */ Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_X_POSITION")
  @js.native
  val DEFAULT_X_POSITION: /* 0 */ Double = js.native
  
  @JSImport("devtools/build/constants", "DEFAULT_Y_POSITION")
  @js.native
  val DEFAULT_Y_POSITION: /* 0 */ Double = js.native
  
  @JSImport("devtools/build/constants", "EDGE_NAMES")
  @js.native
  val EDGE_NAMES: js.Array[String] = js.native
  
  @JSImport("devtools/build/constants", "ELEMENT_KEY")
  @js.native
  val ELEMENT_KEY: /* "element-6066-11e4-a52e-4f735466cecf" */ String = js.native
  
  object ERROR_MESSAGES {
    
    @JSImport("devtools/build/constants", "ERROR_MESSAGES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("devtools/build/constants", "ERROR_MESSAGES.staleElement")
    @js.native
    def staleElement: MessageName = js.native
    inline def staleElement_=(x: MessageName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staleElement")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("devtools/build/constants", "FIREFOX_NAMES")
  @js.native
  val FIREFOX_NAMES: js.Array[String] = js.native
  
  @JSImport("devtools/build/constants", "PPTR_LOG_PREFIX")
  @js.native
  val PPTR_LOG_PREFIX: /* "puppeteer:protocol" */ String = js.native
  
  @JSImport("devtools/build/constants", "SERIALIZE_FLAG")
  @js.native
  val SERIALIZE_FLAG: /* "__executeElement" */ String = js.native
  
  @JSImport("devtools/build/constants", "SERIALIZE_PROPERTY")
  @js.native
  val SERIALIZE_PROPERTY: /* "data-devtoolsdriver-fetchedElement" */ String = js.native
  
  @JSImport("devtools/build/constants", "SHADOW_ELEMENT_KEY")
  @js.native
  val SHADOW_ELEMENT_KEY: /* "shadow-6066-11e4-a52e-4f735466cecf" */ String = js.native
  
  @JSImport("devtools/build/constants", "SUPPORTED_BROWSER")
  @js.native
  val SUPPORTED_BROWSER: js.Array[String] = js.native
  
  @JSImport("devtools/build/constants", "SUPPORTED_SELECTOR_STRATEGIES")
  @js.native
  val SUPPORTED_SELECTOR_STRATEGIES: js.Array[String] = js.native
  
  object VENDOR_PREFIX {
    
    @JSImport("devtools/build/constants", "VENDOR_PREFIX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("devtools/build/constants", "VENDOR_PREFIX.chrome")
    @js.native
    def chrome: googColonchromeOptions = js.native
    
    @JSImport("devtools/build/constants", "VENDOR_PREFIX.chrome headless")
    @js.native
    def chromeHeadless: googColonchromeOptions = js.native
    
    inline def chromeHeadless_=(x: googColonchromeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome headless")(x.asInstanceOf[js.Any])
    
    inline def chrome_=(x: googColonchromeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "VENDOR_PREFIX.edge")
    @js.native
    def edge: msColonedgeOptions = js.native
    inline def edge_=(x: msColonedgeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    @JSImport("devtools/build/constants", "VENDOR_PREFIX.firefox")
    @js.native
    def firefox: mozColonfirefoxOptions = js.native
    inline def firefox_=(x: mozColonfirefoxOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
}
