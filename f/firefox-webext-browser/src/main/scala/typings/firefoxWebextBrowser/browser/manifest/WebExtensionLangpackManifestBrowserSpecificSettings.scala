package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionLangpackManifestBrowserSpecificSettings extends js.Object {
  
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.native
}
object WebExtensionLangpackManifestBrowserSpecificSettings {
  
  @scala.inline
  def apply(): WebExtensionLangpackManifestBrowserSpecificSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionLangpackManifestBrowserSpecificSettings]
  }
  
  @scala.inline
  implicit class WebExtensionLangpackManifestBrowserSpecificSettingsOps[Self <: WebExtensionLangpackManifestBrowserSpecificSettings] (val x: Self) extends AnyVal {
    
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
    def setEdge(value: StringDictionary[js.Any]): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setGecko(value: FirefoxSpecificProperties): Self = this.set("gecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGecko: Self = this.set("gecko", js.undefined)
  }
}
