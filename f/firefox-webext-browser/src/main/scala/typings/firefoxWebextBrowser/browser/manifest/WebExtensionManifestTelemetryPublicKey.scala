package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestTelemetryPublicKey extends StObject {
  
  var id: String = js.native
  
  var key: WebExtensionManifestTelemetryPublicKeyKey = js.native
}
object WebExtensionManifestTelemetryPublicKey {
  
  @scala.inline
  def apply(id: String, key: WebExtensionManifestTelemetryPublicKeyKey): WebExtensionManifestTelemetryPublicKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestTelemetryPublicKey]
  }
  
  @scala.inline
  implicit class WebExtensionManifestTelemetryPublicKeyMutableBuilder[Self <: WebExtensionManifestTelemetryPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: WebExtensionManifestTelemetryPublicKeyKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
