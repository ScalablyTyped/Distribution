package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestUserScripts extends StObject {
  
  var api_script: js.UndefOr[ExtensionURL] = js.undefined
}
object WebExtensionManifestUserScripts {
  
  @scala.inline
  def apply(): WebExtensionManifestUserScripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestUserScripts]
  }
  
  @scala.inline
  implicit class WebExtensionManifestUserScriptsMutableBuilder[Self <: WebExtensionManifestUserScripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_script(value: ExtensionURL): Self = StObject.set(x, "api_script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_scriptUndefined: Self = StObject.set(x, "api_script", js.undefined)
  }
}
