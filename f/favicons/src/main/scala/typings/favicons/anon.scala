package typings.favicons

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
import typings.favicons.mod.IconOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents extends StObject {
    
    var contents: Buffer
    
    var name: String
  }
  object Contents {
    
    inline def apply(contents: Buffer, name: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    extension [Self <: Contents](x: Self) {
      
      inline def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<favicons.favicons.Configuration> */
  trait PartialConfiguration extends StObject {
    
    var appDescription: js.UndefOr[String | Null] = js.undefined
    
    var appName: js.UndefOr[String | Null] = js.undefined
    
    var appShortName: js.UndefOr[String | Null] = js.undefined
    
    var appleStatusBarStyle: js.UndefOr[`black-translucent` | default | black] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var developerName: js.UndefOr[String | Null] = js.undefined
    
    var developerURL: js.UndefOr[String | Null] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.undefined
    
    var icons: js.UndefOr[PartialandroidbooleanIcon] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var loadManifestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var manifestRelativePaths: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[any | natural | portrait | landscape] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pipeHTML: js.UndefOr[Boolean] = js.undefined
    
    var pixel_art: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var start_url: js.UndefOr[String] = js.undefined
    
    var theme_color: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PartialConfiguration {
    
    inline def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    extension [Self <: PartialConfiguration](x: Self) {
      
      inline def setAppDescription(value: String): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
      
      inline def setAppDescriptionNull: Self = StObject.set(x, "appDescription", null)
      
      inline def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameNull: Self = StObject.set(x, "appName", null)
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAppShortName(value: String): Self = StObject.set(x, "appShortName", value.asInstanceOf[js.Any])
      
      inline def setAppShortNameNull: Self = StObject.set(x, "appShortName", null)
      
      inline def setAppShortNameUndefined: Self = StObject.set(x, "appShortName", js.undefined)
      
      inline def setAppleStatusBarStyle(value: `black-translucent` | default | black): Self = StObject.set(x, "appleStatusBarStyle", value.asInstanceOf[js.Any])
      
      inline def setAppleStatusBarStyleUndefined: Self = StObject.set(x, "appleStatusBarStyle", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
      
      inline def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
      
      inline def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
      
      inline def setDeveloperURL(value: String): Self = StObject.set(x, "developerURL", value.asInstanceOf[js.Any])
      
      inline def setDeveloperURLNull: Self = StObject.set(x, "developerURL", null)
      
      inline def setDeveloperURLUndefined: Self = StObject.set(x, "developerURL", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setIcons(value: PartialandroidbooleanIcon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLoadManifestWithCredentials(value: Boolean): Self = StObject.set(x, "loadManifestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoadManifestWithCredentialsUndefined: Self = StObject.set(x, "loadManifestWithCredentials", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setManifestRelativePaths(value: Boolean): Self = StObject.set(x, "manifestRelativePaths", value.asInstanceOf[js.Any])
      
      inline def setManifestRelativePathsUndefined: Self = StObject.set(x, "manifestRelativePaths", js.undefined)
      
      inline def setOrientation(value: any | natural | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPipeHTML(value: Boolean): Self = StObject.set(x, "pipeHTML", value.asInstanceOf[js.Any])
      
      inline def setPipeHTMLUndefined: Self = StObject.set(x, "pipeHTML", js.undefined)
      
      inline def setPixel_art(value: Boolean): Self = StObject.set(x, "pixel_art", value.asInstanceOf[js.Any])
      
      inline def setPixel_artUndefined: Self = StObject.set(x, "pixel_art", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
      
      inline def setStart_urlUndefined: Self = StObject.set(x, "start_url", js.undefined)
      
      inline def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
      
      inline def setTheme_colorUndefined: Self = StObject.set(x, "theme_color", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  android :boolean | favicons.favicons.IconOptions,   appleIcon :boolean | favicons.favicons.IconOptions,   appleStartup :boolean | favicons.favicons.IconOptions,   coast :boolean | favicons.favicons.IconOptions,   favicons :boolean | favicons.favicons.IconOptions,   firefox :boolean | favicons.favicons.IconOptions,   windows :boolean | favicons.favicons.IconOptions,   yandex :boolean | favicons.favicons.IconOptions}> */
  trait PartialandroidbooleanIcon extends StObject {
    
    var android: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var appleIcon: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var appleStartup: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var coast: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var favicons: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var firefox: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var windows: js.UndefOr[Boolean | IconOptions] = js.undefined
    
    var yandex: js.UndefOr[Boolean | IconOptions] = js.undefined
  }
  object PartialandroidbooleanIcon {
    
    inline def apply(): PartialandroidbooleanIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialandroidbooleanIcon]
    }
    
    extension [Self <: PartialandroidbooleanIcon](x: Self) {
      
      inline def setAndroid(value: Boolean | IconOptions): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setAppleIcon(value: Boolean | IconOptions): Self = StObject.set(x, "appleIcon", value.asInstanceOf[js.Any])
      
      inline def setAppleIconUndefined: Self = StObject.set(x, "appleIcon", js.undefined)
      
      inline def setAppleStartup(value: Boolean | IconOptions): Self = StObject.set(x, "appleStartup", value.asInstanceOf[js.Any])
      
      inline def setAppleStartupUndefined: Self = StObject.set(x, "appleStartup", js.undefined)
      
      inline def setCoast(value: Boolean | IconOptions): Self = StObject.set(x, "coast", value.asInstanceOf[js.Any])
      
      inline def setCoastUndefined: Self = StObject.set(x, "coast", js.undefined)
      
      inline def setFavicons(value: Boolean | IconOptions): Self = StObject.set(x, "favicons", value.asInstanceOf[js.Any])
      
      inline def setFaviconsUndefined: Self = StObject.set(x, "favicons", js.undefined)
      
      inline def setFirefox(value: Boolean | IconOptions): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      inline def setWindows(value: Boolean | IconOptions): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
      
      inline def setYandex(value: Boolean | IconOptions): Self = StObject.set(x, "yandex", value.asInstanceOf[js.Any])
      
      inline def setYandexUndefined: Self = StObject.set(x, "yandex", js.undefined)
    }
  }
}
