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
  
  @scala.inline
  def apply(): SchemaGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewayConfig]
  }
  
  @scala.inline
  implicit class SchemaGatewayConfigMutableBuilder[Self <: SchemaGatewayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayAuthMethod(value: String): Self = StObject.set(x, "gatewayAuthMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayAuthMethodUndefined: Self = StObject.set(x, "gatewayAuthMethod", js.undefined)
    
    @scala.inline
    def setGatewayType(value: String): Self = StObject.set(x, "gatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayTypeUndefined: Self = StObject.set(x, "gatewayType", js.undefined)
    
    @scala.inline
    def setLastAccessedGatewayId(value: String): Self = StObject.set(x, "lastAccessedGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedGatewayIdUndefined: Self = StObject.set(x, "lastAccessedGatewayId", js.undefined)
    
    @scala.inline
    def setLastAccessedGatewayTime(value: String): Self = StObject.set(x, "lastAccessedGatewayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedGatewayTimeUndefined: Self = StObject.set(x, "lastAccessedGatewayTime", js.undefined)
  }
}
