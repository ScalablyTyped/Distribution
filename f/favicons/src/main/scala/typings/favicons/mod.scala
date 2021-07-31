package typings.favicons

import typings.favicons.anon.Contents
import typings.favicons.anon.PartialConfiguration
import typings.favicons.anon.PartialandroidbooleanIcon
import typings.favicons.faviconsStrings.`black-translucent`
import typings.favicons.faviconsStrings.`minimal-ui`
import typings.favicons.faviconsStrings.any
import typings.favicons.faviconsStrings.black
import typings.favicons.faviconsStrings.browser
import typings.favicons.faviconsStrings.default
import typings.favicons.faviconsStrings.fullscreen
import typings.favicons.faviconsStrings.landscape
import typings.favicons.faviconsStrings.natural
import typings.favicons.faviconsStrings.portrait
import typings.favicons.faviconsStrings.standalone
import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(source: String): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(source: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: String, configuration: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: String, configuration: PartialConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: String, configuration: PartialConfiguration, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(source: js.Array[String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: js.Array[String], configuration: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: js.Array[String], configuration: PartialConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: js.Array[String], configuration: PartialConfiguration, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: Buffer): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(source: Buffer, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: Buffer, configuration: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: Buffer, configuration: PartialConfiguration): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: Buffer, configuration: PartialConfiguration, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("favicons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** You can programmatically access Favicons configuration (icon filenames, HTML, manifest files, etc) with this export */
  @JSImport("favicons", "config")
  @js.native
  val config: Configuration = js.native
  
  @scala.inline
  def stream(): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[Duplex]
  @scala.inline
  def stream(configuration: Configuration): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(configuration.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  
  type Callback = js.Function2[/* error */ Error | Null, /* response */ FavIconResponse, Unit]
  
  trait Configuration extends StObject {
    
    /** Your application's description @default null */
    var appDescription: String | Null
    
    /** Your application's name @default null */
    var appName: String | Null
    
    /** Your application's short_name. If not set, `appName` will be used @default null */
    var appShortName: String | Null
    
    /** Style for Apple status bar @default 'black-translucent' */
    var appleStatusBarStyle: `black-translucent` | default | black
    
    /** Background colour for flattened icons @default '#fff' */
    var background: String
    
    /** Your (or your developer's) name @default null */
    var developerName: String | Null
    
    /** Your (or your developer's) URL @default null */
    var developerURL: String | Null
    
    /** Primary text direction for name, short_name, and description @default 'auto' */
    var dir: String
    
    /** Preferred display mode: 'fullscreen', 'standalone', 'minimal-ui' or 'browser' @default 'standalone' */
    var display: fullscreen | standalone | `minimal-ui` | browser
    
    /**
      * Platform Options:
      * - offset - offset in percentage
      * - background:
      *   * false - use default
      *   * true - force use default, e.g. set background for Android icons
      *   * color - set background for the specified icons
      * - mask - apply mask in order to create circle icon (applied by default for firefox)
      * - overlayGlow - apply glow effect after mask has been applied (applied by default for firefox)
      * - overlayShadow - apply drop shadow after mask has been applied
      */
    var icons: PartialandroidbooleanIcon
    
    /** Primary language for name and short_name @default 'en-US' */
    var lang: String
    
    /** Browsers don't send cookies when fetching a manifest, enable this to fix that @default false */
    var loadManifestWithCredentials: Boolean
    
    /** Print logs to console? @default false */
    var logging: Boolean
    
    /** Determines whether to set relative paths in manifests @default false */
    var manifestRelativePaths: Boolean
    
    /** Default orientation: 'any', 'natural', 'portrait' or 'landscape' @default 'any' */
    var orientation: any | natural | portrait | landscape
    
    /** Path for overriding default icons path @default '/' */
    var path: String
    
    /** Determines whether to allow piping html as a file @default false */
    var pipeHTML: Boolean
    
    /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
    var pixel_art: Boolean
    
    /** Set of URLs that the browser considers within your app @default null */
    var scope: String
    
    /** Start URL when launching the application from a device @default '/?homescreen=1' */
    var start_url: String
    
    /** Theme color user for example in Android's task switcher @default '#fff' */
    var theme_color: String
    
    /** Your application's version string @default '1.0' */
    var version: String
  }
  object Configuration {
    
    @scala.inline
    def apply(
      appleStatusBarStyle: `black-translucent` | default | black,
      background: String,
      dir: String,
      display: fullscreen | standalone | `minimal-ui` | browser,
      icons: PartialandroidbooleanIcon,
      lang: String,
      loadManifestWithCredentials: Boolean,
      logging: Boolean,
      manifestRelativePaths: Boolean,
      orientation: any | natural | portrait | landscape,
      path: String,
      pipeHTML: Boolean,
      pixel_art: Boolean,
      scope: String,
      start_url: String,
      theme_color: String,
      version: String
    ): Configuration = {
      val __obj = js.Dynamic.literal(appleStatusBarStyle = appleStatusBarStyle.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], loadManifestWithCredentials = loadManifestWithCredentials.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], manifestRelativePaths = manifestRelativePaths.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipeHTML = pipeHTML.asInstanceOf[js.Any], pixel_art = pixel_art.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], theme_color = theme_color.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], appDescription = null, appName = null, appShortName = null, developerName = null, developerURL = null)
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppDescription(value: String): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppDescriptionNull: Self = StObject.set(x, "appDescription", null)
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameNull: Self = StObject.set(x, "appName", null)
      
      @scala.inline
      def setAppShortName(value: String): Self = StObject.set(x, "appShortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppShortNameNull: Self = StObject.set(x, "appShortName", null)
      
      @scala.inline
      def setAppleStatusBarStyle(value: `black-translucent` | default | black): Self = StObject.set(x, "appleStatusBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
      
      @scala.inline
      def setDeveloperURL(value: String): Self = StObject.set(x, "developerURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperURLNull: Self = StObject.set(x, "developerURL", null)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcons(value: PartialandroidbooleanIcon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadManifestWithCredentials(value: Boolean): Self = StObject.set(x, "loadManifestWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestRelativePaths(value: Boolean): Self = StObject.set(x, "manifestRelativePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: any | natural | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeHTML(value: Boolean): Self = StObject.set(x, "pipeHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixel_art(value: Boolean): Self = StObject.set(x, "pixel_art", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait FavIconResponse extends StObject {
    
    var files: js.Array[Contents]
    
    var html: js.Array[String]
    
    var images: js.Array[Contents]
  }
  object FavIconResponse {
    
    @scala.inline
    def apply(files: js.Array[Contents], html: js.Array[String], images: js.Array[Contents]): FavIconResponse = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[FavIconResponse]
    }
    
    @scala.inline
    implicit class FavIconResponseMutableBuilder[Self <: FavIconResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[Contents]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: Contents*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value :_*))
      
      @scala.inline
      def setImages(value: js.Array[Contents]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Contents*): Self = StObject.set(x, "images", js.Array(value :_*))
    }
  }
  
  trait IconOptions extends StObject {
    
    var background: js.UndefOr[Boolean | String] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var ovelayShadow: js.UndefOr[Boolean] = js.undefined
    
    var overlayGlow: js.UndefOr[Boolean] = js.undefined
  }
  object IconOptions {
    
    @scala.inline
    def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    @scala.inline
    implicit class IconOptionsMutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOvelayShadow(value: Boolean): Self = StObject.set(x, "ovelayShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOvelayShadowUndefined: Self = StObject.set(x, "ovelayShadow", js.undefined)
      
      @scala.inline
      def setOverlayGlow(value: Boolean): Self = StObject.set(x, "overlayGlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayGlowUndefined: Self = StObject.set(x, "overlayGlow", js.undefined)
    }
  }
}
