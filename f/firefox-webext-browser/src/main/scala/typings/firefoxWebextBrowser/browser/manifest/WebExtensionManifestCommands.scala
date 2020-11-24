package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestCommands extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var suggested_key: js.UndefOr[WebExtensionManifestCommandsSuggestedKey] = js.native
}
object WebExtensionManifestCommands {
  
  @scala.inline
  def apply(): WebExtensionManifestCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestCommands]
  }
  
  @scala.inline
  implicit class WebExtensionManifestCommandsOps[Self <: WebExtensionManifestCommands] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSuggested_key(value: WebExtensionManifestCommandsSuggestedKey): Self = this.set("suggested_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggested_key: Self = this.set("suggested_key", js.undefined)
  }
}
