package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResolveInstanceConfigResponse extends StObject {
  
  /**
    * AppConnectorInstanceConfig.
    */
  var instanceConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResolveInstanceConfigResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResolveInstanceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResolveInstanceConfigResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaResolveInstanceConfigResponse](x: Self) {
    
    inline def setInstanceConfig(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigUndefined: Self = StObject.set(x, "instanceConfig", js.undefined)
  }
}
