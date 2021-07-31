package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestSidebarAction extends StObject {
  
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  var default_panel: String
  
  var default_title: js.UndefOr[String] = js.undefined
  
  /** Whether or not the sidebar is opened at install. Default is `true`. */
  var open_at_install: js.UndefOr[Boolean] = js.undefined
}
object WebExtensionManifestSidebarAction {
  
  @scala.inline
  def apply(default_panel: String): WebExtensionManifestSidebarAction = {
    val __obj = js.Dynamic.literal(default_panel = default_panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestSidebarAction]
  }
  
  @scala.inline
  implicit class WebExtensionManifestSidebarActionMutableBuilder[Self <: WebExtensionManifestSidebarAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    @scala.inline
    def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    @scala.inline
    def setDefault_panel(value: String): Self = StObject.set(x, "default_panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    @scala.inline
    def setOpen_at_install(value: Boolean): Self = StObject.set(x, "open_at_install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_at_installUndefined: Self = StObject.set(x, "open_at_install", js.undefined)
  }
}
