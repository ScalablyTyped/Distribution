package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHealthStatusForNetworkEndpoint extends StObject {
  
  /**
    * URL of the backend service associated with the health state of the
    * network endpoint.
    */
  var backendService: js.UndefOr[SchemaBackendServiceReference] = js.native
  
  /**
    * URL of the forwarding rule associated with the health state of the
    * network endpoint.
    */
  var forwardingRule: js.UndefOr[SchemaForwardingRuleReference] = js.native
  
  /**
    * URL of the health check associated with the health state of the network
    * endpoint.
    */
  var healthCheck: js.UndefOr[SchemaHealthCheckReference] = js.native
  
  /**
    * Health state of the network endpoint determined based on the health
    * checks configured.
    */
  var healthState: js.UndefOr[String] = js.native
}
object SchemaHealthStatusForNetworkEndpoint {
  
  @scala.inline
  def apply(): SchemaHealthStatusForNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthStatusForNetworkEndpoint]
  }
  
  @scala.inline
  implicit class SchemaHealthStatusForNetworkEndpointMutableBuilder[Self <: SchemaHealthStatusForNetworkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: SchemaBackendServiceReference): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    @scala.inline
    def setForwardingRule(value: SchemaForwardingRuleReference): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: SchemaHealthCheckReference): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
