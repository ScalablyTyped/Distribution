package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResolveInstanceConfigResponse extends StObject {
  
  /**
    * ConnectorInstanceConfig.
    */
  var instanceConfig: js.UndefOr[SchemaConnectorInstanceConfig] = js.undefined
}
object SchemaResolveInstanceConfigResponse {
  
  inline def apply(): SchemaResolveInstanceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResolveInstanceConfigResponse]
  }
  
  extension [Self <: SchemaResolveInstanceConfigResponse](x: Self) {
    
    inline def setInstanceConfig(value: SchemaConnectorInstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigUndefined: Self = StObject.set(x, "instanceConfig", js.undefined)
  }
}
