package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestTelemetry extends StObject {
  
  var ping_type: String = js.native
  
  var pioneer_id: js.UndefOr[Boolean] = js.native
  
  var public_key: WebExtensionManifestTelemetryPublicKey = js.native
  
  var schemaNamespace: String = js.native
  
  var study_name: js.UndefOr[String] = js.native
}
object WebExtensionManifestTelemetry {
  
  @scala.inline
  def apply(ping_type: String, public_key: WebExtensionManifestTelemetryPublicKey, schemaNamespace: String): WebExtensionManifestTelemetry = {
    val __obj = js.Dynamic.literal(ping_type = ping_type.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], schemaNamespace = schemaNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestTelemetry]
  }
  
  @scala.inline
  implicit class WebExtensionManifestTelemetryMutableBuilder[Self <: WebExtensionManifestTelemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPing_type(value: String): Self = StObject.set(x, "ping_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPioneer_id(value: Boolean): Self = StObject.set(x, "pioneer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPioneer_idUndefined: Self = StObject.set(x, "pioneer_id", js.undefined)
    
    @scala.inline
    def setPublic_key(value: WebExtensionManifestTelemetryPublicKey): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNamespace(value: String): Self = StObject.set(x, "schemaNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudy_name(value: String): Self = StObject.set(x, "study_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudy_nameUndefined: Self = StObject.set(x, "study_name", js.undefined)
  }
}
