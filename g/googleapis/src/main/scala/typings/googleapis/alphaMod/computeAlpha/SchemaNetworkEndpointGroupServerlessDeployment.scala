package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupServerlessDeployment extends StObject {
  
  /**
    * The platform of the backend target(s) of this NEG. The only supported value is API Gateway: apigateway.googleapis.com.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
    */
  var urlMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkEndpointGroupServerlessDeployment {
  
  inline def apply(): SchemaNetworkEndpointGroupServerlessDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupServerlessDeployment]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupServerlessDeployment](x: Self) {
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setUrlMask(value: String): Self = StObject.set(x, "urlMask", value.asInstanceOf[js.Any])
    
    inline def setUrlMaskNull: Self = StObject.set(x, "urlMask", null)
    
    inline def setUrlMaskUndefined: Self = StObject.set(x, "urlMask", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
