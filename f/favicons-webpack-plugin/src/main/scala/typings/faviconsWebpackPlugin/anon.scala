package typings.faviconsWebpackPlugin

import typings.favicons.anon.PartialandroidbooleanIcon
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`black-translucent`
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`minimal-ui`
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.any
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.black
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.browser
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.default
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.fullscreen
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.landscape
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.natural
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.portrait
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.standalone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MainTemplate extends StObject {
    
    var mainTemplate: js.Any = js.native
  }
  object MainTemplate {
    
    @scala.inline
    def apply(mainTemplate: js.Any): MainTemplate = {
      val __obj = js.Dynamic.literal(mainTemplate = mainTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainTemplate]
    }
    
    @scala.inline
    implicit class MainTemplateMutableBuilder[Self <: MainTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMainTemplate(value: js.Any): Self = StObject.set(x, "mainTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<favicons.favicons.Configuration> */
  @js.native
  trait PartialConfiguration extends StObject {
    
    var appDescription: js.UndefOr[String | Null] = js.native
    
    var appName: js.UndefOr[String | Null] = js.native
    
    var appShortName: js.UndefOr[String | Null] = js.native
    
    var appleStatusBarStyle: js.UndefOr[`black-translucent` | default | black] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var developerName: js.UndefOr[String | Null] = js.native
    
    var developerURL: js.UndefOr[String | Null] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.native
    
    var icons: js.UndefOr[PartialandroidbooleanIcon] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var loadManifestWithCredentials: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var manifestRelativePaths: js.UndefOr[Boolean] = js.native
    
    var orientation: js.UndefOr[any | natural | portrait | landscape] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pipeHTML: js.UndefOr[Boolean] = js.native
    
    var pixel_art: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var start_url: js.UndefOr[String] = js.native
    
    var theme_color: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object PartialConfiguration {
    
    @scala.inline
    def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    @scala.inline
    implicit class PartialConfigurationMutableBuilder[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppDescription(value: String): Self = StObject.set(x, "appDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppDescriptionNull: Self = StObject.set(x, "appDescription", null)
      
      @scala.inline
      def setAppDescriptionUndefined: Self = StObject.set(x, "appDescription", js.undefined)
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameNull: Self = StObject.set(x, "appName", null)
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setAppShortName(value: String): Self = StObject.set(x, "appShortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppShortNameNull: Self = StObject.set(x, "appShortName", null)
      
      @scala.inline
      def setAppShortNameUndefined: Self = StObject.set(x, "appShortName", js.undefined)
      
      @scala.inline
      def setAppleStatusBarStyle(value: `black-translucent` | default | black): Self = StObject.set(x, "appleStatusBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppleStatusBarStyleUndefined: Self = StObject.set(x, "appleStatusBarStyle", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
      
      @scala.inline
      def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
      
      @scala.inline
      def setDeveloperURL(value: String): Self = StObject.set(x, "developerURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperURLNull: Self = StObject.set(x, "developerURL", null)
      
      @scala.inline
      def setDeveloperURLUndefined: Self = StObject.set(x, "developerURL", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setIcons(value: PartialandroidbooleanIcon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLoadManifestWithCredentials(value: Boolean): Self = StObject.set(x, "loadManifestWithCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadManifestWithCredentialsUndefined: Self = StObject.set(x, "loadManifestWithCredentials", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setManifestRelativePaths(value: Boolean): Self = StObject.set(x, "manifestRelativePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestRelativePathsUndefined: Self = StObject.set(x, "manifestRelativePaths", js.undefined)
      
      @scala.inline
      def setOrientation(value: any | natural | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPipeHTML(value: Boolean): Self = StObject.set(x, "pipeHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeHTMLUndefined: Self = StObject.set(x, "pipeHTML", js.undefined)
      
      @scala.inline
      def setPixel_art(value: Boolean): Self = StObject.set(x, "pixel_art", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixel_artUndefined: Self = StObject.set(x, "pixel_art", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_urlUndefined: Self = StObject.set(x, "start_url", js.undefined)
      
      @scala.inline
      def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme_colorUndefined: Self = StObject.set(x, "theme_color", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
