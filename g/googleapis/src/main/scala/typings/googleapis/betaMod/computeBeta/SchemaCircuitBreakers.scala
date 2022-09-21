package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCircuitBreakers extends StObject {
  
  /**
    * The timeout for new network connections to hosts.
    */
  var connectTimeout: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * The maximum number of connections to the backend service. If not specified, there is no limit. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var maxConnections: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var maxPendingRequests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
    */
  var maxRequests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var maxRequestsPerConnection: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var maxRetries: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCircuitBreakers {
  
  inline def apply(): SchemaCircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCircuitBreakers]
  }
  
  extension [Self <: SchemaCircuitBreakers](x: Self) {
    
    inline def setConnectTimeout(value: SchemaDuration): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsNull: Self = StObject.set(x, "maxConnections", null)
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    inline def setMaxPendingRequests(value: Double): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxPendingRequestsNull: Self = StObject.set(x, "maxPendingRequests", null)
    
    inline def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
    
    inline def setMaxRequests(value: Double): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsNull: Self = StObject.set(x, "maxRequests", null)
    
    inline def setMaxRequestsPerConnection(value: Double): Self = StObject.set(x, "maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsPerConnectionNull: Self = StObject.set(x, "maxRequestsPerConnection", null)
    
    inline def setMaxRequestsPerConnectionUndefined: Self = StObject.set(x, "maxRequestsPerConnection", js.undefined)
    
    inline def setMaxRequestsUndefined: Self = StObject.set(x, "maxRequests", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesNull: Self = StObject.set(x, "maxRetries", null)
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
