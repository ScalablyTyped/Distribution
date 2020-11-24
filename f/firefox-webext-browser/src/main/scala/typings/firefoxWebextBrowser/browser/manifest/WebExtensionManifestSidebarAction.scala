package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestSidebarAction extends js.Object {
  
  var browser_style: js.UndefOr[Boolean] = js.native
  
  var default_icon: js.UndefOr[IconPath] = js.native
  
  var default_panel: String = js.native
  
  var default_title: js.UndefOr[String] = js.native
  
  /** Whether or not the sidebar is opened at install. Default is `true`. */
  var open_at_install: js.UndefOr[Boolean] = js.native
}
object WebExtensionManifestSidebarAction {
  
  @scala.inline
  def apply(default_panel: String): WebExtensionManifestSidebarAction = {
    val __obj = js.Dynamic.literal(default_panel = default_panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestSidebarAction]
  }
  
  @scala.inline
  implicit class WebExtensionManifestSidebarActionOps[Self <: WebExtensionManifestSidebarAction] (val x: Self) extends AnyVal {
    
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
    def setDefault_panel(value: String): Self = this.set("default_panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = this.set("browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_style: Self = this.set("browser_style", js.undefined)
    
    @scala.inline
    def setDefault_icon(value: IconPath): Self = this.set("default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_icon: Self = this.set("default_icon", js.undefined)
    
    @scala.inline
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_title: Self = this.set("default_title", js.undefined)
    
    @scala.inline
    def setOpen_at_install(value: Boolean): Self = this.set("open_at_install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen_at_install: Self = this.set("open_at_install", js.undefined)
  }
}
