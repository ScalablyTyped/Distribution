package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gateway-related configuration and state.
  */
trait SchemaGatewayConfig extends StObject {
  
  /**
    * Indicates how to authorize and/or authenticate devices to access the
    * gateway.
    */
  var gatewayAuthMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the device is a gateway.
    */
  var gatewayType: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The ID of the gateway the device accessed most recently.
    */
  var lastAccessedGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The most recent time at which the device accessed the
    * gateway specified in `last_accessed_gateway`.
    */
  var lastAccessedGatewayTime: js.UndefOr[String] = js.undefined
}
object SchemaGatewayConfig {
  
  inline def apply(): SchemaGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewayConfig]
  }
  
  extension [Self <: SchemaGatewayConfig](x: Self) {
    
    inline def setGatewayAuthMethod(value: String): Self = StObject.set(x, "gatewayAuthMethod", value.asInstanceOf[js.Any])
    
    inline def setGatewayAuthMethodUndefined: Self = StObject.set(x, "gatewayAuthMethod", js.undefined)
    
    inline def setGatewayType(value: String): Self = StObject.set(x, "gatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayTypeUndefined: Self = StObject.set(x, "gatewayType", js.undefined)
    
    inline def setLastAccessedGatewayId(value: String): Self = StObject.set(x, "lastAccessedGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedGatewayIdUndefined: Self = StObject.set(x, "lastAccessedGatewayId", js.undefined)
    
    inline def setLastAccessedGatewayTime(value: String): Self = StObject.set(x, "lastAccessedGatewayTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedGatewayTimeUndefined: Self = StObject.set(x, "lastAccessedGatewayTime", js.undefined)
  }
}
