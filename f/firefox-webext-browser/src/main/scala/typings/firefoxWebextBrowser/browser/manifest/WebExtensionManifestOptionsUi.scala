package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestOptionsUi extends StObject {
  
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
  implicit class WebExtensionManifestOptionsUiMutableBuilder[Self <: WebExtensionManifestOptionsUi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    @scala.inline
    def setChrome_style(value: Boolean): Self = StObject.set(x, "chrome_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_styleUndefined: Self = StObject.set(x, "chrome_style", js.undefined)
    
    @scala.inline
    def setOpen_in_tab(value: Boolean): Self = StObject.set(x, "open_in_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_in_tabUndefined: Self = StObject.set(x, "open_in_tab", js.undefined)
    
    @scala.inline
    def setPage(value: ExtensionURL): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
