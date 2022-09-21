package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayGatewayConfig extends StObject {
  
  /**
    * Required. Backend settings that are applied to all backends of the Gateway.
    */
  var backendConfig: js.UndefOr[SchemaApigatewayBackendConfig] = js.undefined
}
object SchemaApigatewayGatewayConfig {
  
  inline def apply(): SchemaApigatewayGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayGatewayConfig]
  }
  
  extension [Self <: SchemaApigatewayGatewayConfig](x: Self) {
    
    inline def setBackendConfig(value: SchemaApigatewayBackendConfig): Self = StObject.set(x, "backendConfig", value.asInstanceOf[js.Any])
    
    inline def setBackendConfigUndefined: Self = StObject.set(x, "backendConfig", js.undefined)
  }
}
