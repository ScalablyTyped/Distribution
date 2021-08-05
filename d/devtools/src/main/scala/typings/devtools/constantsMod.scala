package typings.devtools

import typings.devtools.anon.MessageName
import typings.devtools.devtoolsStrings.chrome
import typings.devtools.devtoolsStrings.edge
import typings.devtools.devtoolsStrings.firefox
import typings.devtools.devtoolsStrings.googColonchromeOptions
import typings.devtools.devtoolsStrings.mozColonfirefoxOptions
import typings.devtools.devtoolsStrings.msColonedgeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
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
  
  @JSImport("devtools/build/constants", "DEFAULTS")
  @js.native
  val DEFAULTS: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultOptions<WebDriver.Options> */ js.Any = js.native
  
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
