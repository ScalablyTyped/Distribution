package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestCommands extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var suggested_key: js.UndefOr[WebExtensionManifestCommandsSuggestedKey] = js.undefined
}
object WebExtensionManifestCommands {
  
  inline def apply(): WebExtensionManifestCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestCommands]
  }
  
  extension [Self <: WebExtensionManifestCommands](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSuggested_key(value: WebExtensionManifestCommandsSuggestedKey): Self = StObject.set(x, "suggested_key", value.asInstanceOf[js.Any])
    
    inline def setSuggested_keyUndefined: Self = StObject.set(x, "suggested_key", js.undefined)
  }
}
