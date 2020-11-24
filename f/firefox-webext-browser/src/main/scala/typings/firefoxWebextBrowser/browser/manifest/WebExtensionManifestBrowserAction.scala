package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestBrowserAction extends js.Object {
  
  var browser_style: js.UndefOr[Boolean] = js.native
  
  /** Defines the location the browserAction will appear by default. The default location is navbar. */
  var default_area: js.UndefOr[WebExtensionManifestBrowserActionDefaultArea] = js.native
  
  var default_icon: js.UndefOr[IconPath] = js.native
  
  var default_popup: js.UndefOr[String] = js.native
  
  var default_title: js.UndefOr[String] = js.native
  
  /** Specifies icons to use for dark and light themes */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.native
}
object WebExtensionManifestBrowserAction {
  
  @scala.inline
  def apply(): WebExtensionManifestBrowserAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestBrowserAction]
  }
  
  @scala.inline
  implicit class WebExtensionManifestBrowserActionOps[Self <: WebExtensionManifestBrowserAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = this.set("browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_style: Self = this.set("browser_style", js.undefined)
    
    @scala.inline
    def setDefault_area(value: WebExtensionManifestBrowserActionDefaultArea): Self = this.set("default_area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_area: Self = this.set("default_area", js.undefined)
    
    @scala.inline
    def setDefault_icon(value: IconPath): Self = this.set("default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_icon: Self = this.set("default_icon", js.undefined)
    
    @scala.inline
    def setDefault_popup(value: String): Self = this.set("default_popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_popup: Self = this.set("default_popup", js.undefined)
    
    @scala.inline
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_title: Self = this.set("default_title", js.undefined)
    
    @scala.inline
    def setTheme_iconsVarargs(value: ThemeIcons*): Self = this.set("theme_icons", js.Array(value :_*))
    
    @scala.inline
    def setTheme_icons(value: js.Array[ThemeIcons]): Self = this.set("theme_icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme_icons: Self = this.set("theme_icons", js.undefined)
  }
}
