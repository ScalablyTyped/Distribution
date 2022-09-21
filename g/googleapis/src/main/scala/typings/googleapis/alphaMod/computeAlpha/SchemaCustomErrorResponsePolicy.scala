package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomErrorResponsePolicy extends StObject {
  
  /**
    * Specifies rules for returning error responses. In a given policy, if you specify rules for both a range of error codes as well as rules for specific error codes then rules with specific error codes have a higher priority. For example, assume that you configure a rule for 401 (Un-authorized) code, and another for all 4 series error codes (4XX). If the backend service returns a 401, then the rule for 401 will be applied. However if the backend service returns a 403, the rule for 4xx takes effect.
    */
  var errorResponseRules: js.UndefOr[js.Array[SchemaCustomErrorResponsePolicyCustomErrorResponseRule]] = js.undefined
  
  /**
    * The full or partial URL to the BackendBucket resource that contains the custom error content. Examples are: - https://www.googleapis.com/compute/v1/projects/project/global/backendBuckets/myBackendBucket - compute/v1/projects/project/global/backendBuckets/myBackendBucket - global/backendBuckets/myBackendBucket If errorService is not specified at lower levels like pathMatcher, pathRule and routeRule, an errorService specified at a higher level in the UrlMap will be used. If UrlMap.defaultCustomErrorResponsePolicy contains one or more errorResponseRules[], it must specify errorService. If load balancer cannot reach the backendBucket, a simple Not Found Error will be returned, with the original response code (or overrideResponseCode if configured). errorService is not supported for internal or regional HTTP/HTTPS load balancers.
    */
  var errorService: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomErrorResponsePolicy {
  
  inline def apply(): SchemaCustomErrorResponsePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomErrorResponsePolicy]
  }
  
  extension [Self <: SchemaCustomErrorResponsePolicy](x: Self) {
    
    inline def setErrorResponseRules(value: js.Array[SchemaCustomErrorResponsePolicyCustomErrorResponseRule]): Self = StObject.set(x, "errorResponseRules", value.asInstanceOf[js.Any])
    
    inline def setErrorResponseRulesUndefined: Self = StObject.set(x, "errorResponseRules", js.undefined)
    
    inline def setErrorResponseRulesVarargs(value: SchemaCustomErrorResponsePolicyCustomErrorResponseRule*): Self = StObject.set(x, "errorResponseRules", js.Array(value*))
    
    inline def setErrorService(value: String): Self = StObject.set(x, "errorService", value.asInstanceOf[js.Any])
    
    inline def setErrorServiceNull: Self = StObject.set(x, "errorService", null)
    
    inline def setErrorServiceUndefined: Self = StObject.set(x, "errorService", js.undefined)
  }
}
