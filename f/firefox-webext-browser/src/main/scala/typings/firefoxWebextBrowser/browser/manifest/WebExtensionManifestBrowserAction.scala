package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestBrowserAction extends StObject {
  
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /** Defines the location the browserAction will appear by default. The default location is navbar. */
  var default_area: js.UndefOr[WebExtensionManifestBrowserActionDefaultArea] = js.undefined
  
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  var default_popup: js.UndefOr[String] = js.undefined
  
  var default_title: js.UndefOr[String] = js.undefined
  
  /** Specifies icons to use for dark and light themes */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}
object WebExtensionManifestBrowserAction {
  
  inline def apply(): WebExtensionManifestBrowserAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestBrowserAction]
  }
  
  extension [Self <: WebExtensionManifestBrowserAction](x: Self) {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_area(value: WebExtensionManifestBrowserActionDefaultArea): Self = StObject.set(x, "default_area", value.asInstanceOf[js.Any])
    
    inline def setDefault_areaUndefined: Self = StObject.set(x, "default_area", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setTheme_icons(value: js.Array[ThemeIcons]): Self = StObject.set(x, "theme_icons", value.asInstanceOf[js.Any])
    
    inline def setTheme_iconsUndefined: Self = StObject.set(x, "theme_icons", js.undefined)
    
    inline def setTheme_iconsVarargs(value: ThemeIcons*): Self = StObject.set(x, "theme_icons", js.Array(value :_*))
  }
}
