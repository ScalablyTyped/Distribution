package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestOptionsUi extends js.Object {
  
  var browser_style: js.UndefOr[Boolean] = js.native
  
  var chrome_style: js.UndefOr[Boolean] = js.native
  
  var open_in_tab: js.UndefOr[Boolean] = js.native
  
  var page: ExtensionURL = js.native
}
object WebExtensionManifestOptionsUi {
  
  @scala.inline
  def apply(page: ExtensionURL): WebExtensionManifestOptionsUi = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestOptionsUi]
  }
  
  @scala.inline
  implicit class WebExtensionManifestOptionsUiOps[Self <: WebExtensionManifestOptionsUi] (val x: Self) extends AnyVal {
    
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
    def setPage(value: ExtensionURL): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = this.set("browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_style: Self = this.set("browser_style", js.undefined)
    
    @scala.inline
    def setChrome_style(value: Boolean): Self = this.set("chrome_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_style: Self = this.set("chrome_style", js.undefined)
    
    @scala.inline
    def setOpen_in_tab(value: Boolean): Self = this.set("open_in_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen_in_tab: Self = this.set("open_in_tab", js.undefined)
  }
}
