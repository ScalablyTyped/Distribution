package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeSettingsOverrides extends js.Object {
  
  var homepage: js.UndefOr[String] = js.native
  
  var search_provider: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProvider] = js.native
}
object WebExtensionManifestChromeSettingsOverrides {
  
  @scala.inline
  def apply(): WebExtensionManifestChromeSettingsOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverrides]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeSettingsOverridesOps[Self <: WebExtensionManifestChromeSettingsOverrides] (val x: Self) extends AnyVal {
    
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
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setSearch_provider(value: WebExtensionManifestChromeSettingsOverridesSearchProvider): Self = this.set("search_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_provider: Self = this.set("search_provider", js.undefined)
  }
}
