package typings.favicons

import typings.favicons.anon.RecordPlatformNameFileOpt
import typings.favicons.anon.RecordPlatformNameIconOpt
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("favicons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def default(source: String, options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  inline def default(source: js.Array[String | Buffer]): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def default(source: js.Array[String | Buffer], options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  inline def default(source: Buffer): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def default(source: Buffer, options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  
  object config {
    
    @JSImport("favicons", "config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("favicons", "config.defaults")
    @js.native
    def defaults: FaviconOptions = js.native
    inline def defaults_=(x: FaviconOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  }
  
  inline def favicons(source: String): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def favicons(source: String, options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  inline def favicons(source: js.Array[String | Buffer]): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def favicons(source: js.Array[String | Buffer], options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  inline def favicons(source: Buffer): js.Promise[FaviconResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaviconResponse]]
  inline def favicons(source: Buffer, options: FaviconOptions): js.Promise[FaviconResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("favicons")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaviconResponse]]
  
  inline def stream(options: FaviconStreamOptions, handleHTML: HandleHTML): FaviconStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any], handleHTML.asInstanceOf[js.Any])).asInstanceOf[FaviconStream]
  
  trait Application extends StObject {
    
    val id: js.UndefOr[String] = js.undefined
    
    val platform: js.UndefOr[String] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object Application {
    
    inline def apply(): Application = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FaviconFile extends StObject {
    
    val contents: String
    
    val name: String
  }
  object FaviconFile {
    
    inline def apply(contents: String, name: String): FaviconFile = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconFile]
    }
    
    extension [Self <: FaviconFile](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type FaviconHtmlElement = String
  
  trait FaviconImage extends StObject {
    
    val contents: Buffer
    
    val name: String
  }
  object FaviconImage {
    
    inline def apply(contents: Buffer, name: String): FaviconImage = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconImage]
    }
    
    extension [Self <: FaviconImage](x: Self) {
      
      inline def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FaviconOptions extends StObject {
    
    val appDescription: js.UndefOr[String] = js.undefined
    
    val appName: js.UndefOr[String] = js.undefined
    
    val appShortName: js.UndefOr[String] = js.undefined
    
    val appleStatusBarStyle: js.UndefOr[String] = js.undefined
    
    val background: js.UndefOr[String] = js.undefined
    
    val developerName: js.UndefOr[String] = js.undefined
    
    val developerURL: js.UndefOr[String] = js.undefined
    
    val dir: js.UndefOr[String] = js.undefined
    
    val display: js.UndefOr[String] = js.undefined
    
    val files: js.UndefOr[RecordPlatformNameFileOpt] = js.undefined
    
    val icons: js.UndefOr[RecordPlatformNameIconOpt] = js.undefined
    
    val lang: js.UndefOr[String] = js.undefined
    
    val loadManifestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    val manifestMaskable: js.UndefOr[Boolean | String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    val manifestRelativePaths: js.UndefOr[Boolean] = js.undefined
    
    val orientation: js.UndefOr[String] = js.undefined
    
    val output: js.UndefOr[OutputOptions] = js.undefined
    
    val path: js.UndefOr[String] = js.undefined
    
    val pixel_art: js.UndefOr[Boolean] = js.undefined
    
    val preferRelatedApplications: js.UndefOr[Boolean] = js.undefined
    
    val relatedApplications: js.UndefOr[js.Array[Application]] = js.undefined
    
    val scope: js.UndefOr[String] = js.undefined
    
    val shortcuts: js.UndefOr[js.Array[ShortcutOptions]] = js.undefined
    
    val start_url: js.UndefOr[String] = js.undefined
    
    val theme_color: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object FaviconOptions {
    
    inline def apply(): FaviconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaviconOptions]
    }
    
    extension [Self <: FaviconOptions](x: Self) {
      
      inline def setAppDescription(value: String): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
      
      inline def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAppShortName(value: String): Self = StObject.set(x, "appShortName", value.asInstanceOf[js.Any])
      
      inline def setAppShortNameUndefined: Self = StObject.set(x, "appShortName", js.undefined)
      
      inline def setAppleStatusBarStyle(value: String): Self = StObject.set(x, "appleStatusBarStyle", value.asInstanceOf[js.Any])
      
      inline def setAppleStatusBarStyleUndefined: Self = StObject.set(x, "appleStatusBarStyle", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
      
      inline def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
      
      inline def setDeveloperURL(value: String): Self = StObject.set(x, "developerURL", value.asInstanceOf[js.Any])
      
      inline def setDeveloperURLUndefined: Self = StObject.set(x, "developerURL", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFiles(value: RecordPlatformNameFileOpt): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIcons(value: RecordPlatformNameIconOpt): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLoadManifestWithCredentials(value: Boolean): Self = StObject.set(x, "loadManifestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoadManifestWithCredentialsUndefined: Self = StObject.set(x, "loadManifestWithCredentials", js.undefined)
      
      inline def setManifestMaskable(value: Boolean | String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "manifestMaskable", value.asInstanceOf[js.Any])
      
      inline def setManifestMaskableUndefined: Self = StObject.set(x, "manifestMaskable", js.undefined)
      
      inline def setManifestMaskableVarargs(value: (Buffer | String)*): Self = StObject.set(x, "manifestMaskable", js.Array(value*))
      
      inline def setManifestRelativePaths(value: Boolean): Self = StObject.set(x, "manifestRelativePaths", value.asInstanceOf[js.Any])
      
      inline def setManifestRelativePathsUndefined: Self = StObject.set(x, "manifestRelativePaths", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPixel_art(value: Boolean): Self = StObject.set(x, "pixel_art", value.asInstanceOf[js.Any])
      
      inline def setPixel_artUndefined: Self = StObject.set(x, "pixel_art", js.undefined)
      
      inline def setPreferRelatedApplications(value: Boolean): Self = StObject.set(x, "preferRelatedApplications", value.asInstanceOf[js.Any])
      
      inline def setPreferRelatedApplicationsUndefined: Self = StObject.set(x, "preferRelatedApplications", js.undefined)
      
      inline def setRelatedApplications(value: js.Array[Application]): Self = StObject.set(x, "relatedApplications", value.asInstanceOf[js.Any])
      
      inline def setRelatedApplicationsUndefined: Self = StObject.set(x, "relatedApplications", js.undefined)
      
      inline def setRelatedApplicationsVarargs(value: Application*): Self = StObject.set(x, "relatedApplications", js.Array(value*))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setShortcuts(value: js.Array[ShortcutOptions]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: ShortcutOptions*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
      
      inline def setStart_urlUndefined: Self = StObject.set(x, "start_url", js.undefined)
      
      inline def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
      
      inline def setTheme_colorUndefined: Self = StObject.set(x, "theme_color", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait FaviconResponse extends StObject {
    
    val files: js.Array[FaviconFile]
    
    val html: js.Array[FaviconHtmlElement]
    
    val images: js.Array[FaviconImage]
  }
  object FaviconResponse {
    
    inline def apply(files: js.Array[FaviconFile], html: js.Array[FaviconHtmlElement], images: js.Array[FaviconImage]): FaviconResponse = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconResponse]
    }
    
    extension [Self <: FaviconResponse](x: Self) {
      
      inline def setFiles(value: js.Array[FaviconFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: FaviconFile*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setHtml(value: js.Array[FaviconHtmlElement]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlVarargs(value: FaviconHtmlElement*): Self = StObject.set(x, "html", js.Array(value*))
      
      inline def setImages(value: js.Array[FaviconImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: FaviconImage*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  @js.native
  trait FaviconStream extends Transform {
    
    /* private */ var `private`: Any = js.native
  }
  
  trait FaviconStreamOptions
    extends StObject
       with FaviconOptions {
    
    val emitBuffers: js.UndefOr[Boolean] = js.undefined
    
    val html: js.UndefOr[String] = js.undefined
    
    val pipeHTML: js.UndefOr[Boolean] = js.undefined
  }
  object FaviconStreamOptions {
    
    inline def apply(): FaviconStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaviconStreamOptions]
    }
    
    extension [Self <: FaviconStreamOptions](x: Self) {
      
      inline def setEmitBuffers(value: Boolean): Self = StObject.set(x, "emitBuffers", value.asInstanceOf[js.Any])
      
      inline def setEmitBuffersUndefined: Self = StObject.set(x, "emitBuffers", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setPipeHTML(value: Boolean): Self = StObject.set(x, "pipeHTML", value.asInstanceOf[js.Any])
      
      inline def setPipeHTMLUndefined: Self = StObject.set(x, "pipeHTML", js.undefined)
    }
  }
  
  trait FileOptions extends StObject {
    
    val manifestFileName: js.UndefOr[String] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
      
      inline def setManifestFileNameUndefined: Self = StObject.set(x, "manifestFileName", js.undefined)
    }
  }
  
  type HandleHTML = js.Function1[/* html */ js.Array[FaviconHtmlElement], Unit]
  
  trait IconOptions extends StObject {
    
    val background: js.UndefOr[String | Boolean] = js.undefined
    
    val offset: js.UndefOr[Double] = js.undefined
    
    val pixelArt: js.UndefOr[Boolean] = js.undefined
    
    val purpose: js.UndefOr[String] = js.undefined
    
    val rotate: Boolean
    
    val sizes: js.Array[IconSize]
    
    val transparent: Boolean
  }
  object IconOptions {
    
    inline def apply(rotate: Boolean, sizes: js.Array[IconSize], transparent: Boolean): IconOptions = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconOptions]
    }
    
    extension [Self <: IconOptions](x: Self) {
      
      inline def setBackground(value: String | Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPixelArt(value: Boolean): Self = StObject.set(x, "pixelArt", value.asInstanceOf[js.Any])
      
      inline def setPixelArtUndefined: Self = StObject.set(x, "pixelArt", js.undefined)
      
      inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Array[IconSize]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: IconSize*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconSize extends StObject {
    
    val height: Double
    
    val width: Double
  }
  object IconSize {
    
    inline def apply(height: Double, width: Double): IconSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconSize]
    }
    
    extension [Self <: IconSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputOptions extends StObject {
    
    val files: js.UndefOr[Boolean] = js.undefined
    
    val html: js.UndefOr[Boolean] = js.undefined
    
    val images: js.UndefOr[Boolean] = js.undefined
  }
  object OutputOptions {
    
    inline def apply(): OutputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputOptions]
    }
    
    extension [Self <: OutputOptions](x: Self) {
      
      inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.favicons.faviconsStrings.android
    - typings.favicons.faviconsStrings.appleIcon
    - typings.favicons.faviconsStrings.appleStartup
    - typings.favicons.faviconsStrings.favicons
    - typings.favicons.faviconsStrings.windows
    - typings.favicons.faviconsStrings.yandex
  */
  trait PlatformName extends StObject
  object PlatformName {
    
    inline def android: typings.favicons.faviconsStrings.android = "android".asInstanceOf[typings.favicons.faviconsStrings.android]
    
    inline def appleIcon: typings.favicons.faviconsStrings.appleIcon = "appleIcon".asInstanceOf[typings.favicons.faviconsStrings.appleIcon]
    
    inline def appleStartup: typings.favicons.faviconsStrings.appleStartup = "appleStartup".asInstanceOf[typings.favicons.faviconsStrings.appleStartup]
    
    inline def favicons: typings.favicons.faviconsStrings.favicons = "favicons".asInstanceOf[typings.favicons.faviconsStrings.favicons]
    
    inline def windows: typings.favicons.faviconsStrings.windows = "windows".asInstanceOf[typings.favicons.faviconsStrings.windows]
    
    inline def yandex: typings.favicons.faviconsStrings.yandex = "yandex".asInstanceOf[typings.favicons.faviconsStrings.yandex]
  }
  
  trait ShortcutOptions extends StObject {
    
    val description: js.UndefOr[String] = js.undefined
    
    val icon: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    val name: String
    
    val short_name: js.UndefOr[String] = js.undefined
    
    val url: String
  }
  object ShortcutOptions {
    
    inline def apply(name: String, url: String): ShortcutOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutOptions]
    }
    
    extension [Self <: ShortcutOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Buffer | String)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
      
      inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
