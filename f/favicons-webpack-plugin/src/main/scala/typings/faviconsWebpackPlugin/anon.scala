package typings.faviconsWebpackPlugin

import typings.favicons.anon.RecordPlatformNameFileOpt
import typings.favicons.anon.RecordPlatformNameIconOpt
import typings.favicons.mod.Application
import typings.favicons.mod.OutputOptions
import typings.favicons.mod.ShortcutOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<favicons.favicons.FaviconOptions> */
  trait PartialFaviconOptions extends StObject {
    
    var appDescription: js.UndefOr[String] = js.undefined
    
    var appName: js.UndefOr[String] = js.undefined
    
    var appShortName: js.UndefOr[String] = js.undefined
    
    var appleStatusBarStyle: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var developerName: js.UndefOr[String] = js.undefined
    
    var developerURL: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[RecordPlatformNameFileOpt] = js.undefined
    
    var icons: js.UndefOr[RecordPlatformNameIconOpt] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var loadManifestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    var manifestMaskable: js.UndefOr[Boolean | String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var manifestRelativePaths: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var output: js.UndefOr[OutputOptions] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pixel_art: js.UndefOr[Boolean] = js.undefined
    
    var preferRelatedApplications: js.UndefOr[Boolean] = js.undefined
    
    var relatedApplications: js.UndefOr[js.Array[Application]] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var shortcuts: js.UndefOr[js.Array[ShortcutOptions]] = js.undefined
    
    var start_url: js.UndefOr[String] = js.undefined
    
    var theme_color: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PartialFaviconOptions {
    
    inline def apply(): PartialFaviconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFaviconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFaviconOptions] (val x: Self) extends AnyVal {
      
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
}
