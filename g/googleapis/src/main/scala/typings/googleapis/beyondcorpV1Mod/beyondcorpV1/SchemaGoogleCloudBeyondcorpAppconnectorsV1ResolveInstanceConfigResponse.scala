package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1ResolveInstanceConfigResponse extends StObject {
  
  /**
    * AppConnectorInstanceConfig.
    */
  var instanceConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorInstanceConfig] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1ResolveInstanceConfigResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1ResolveInstanceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1ResolveInstanceConfigResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1ResolveInstanceConfigResponse](x: Self) {
    
    inline def setInstanceConfig(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1AppConnectorInstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigUndefined: Self = StObject.set(x, "instanceConfig", js.undefined)
  }
}
