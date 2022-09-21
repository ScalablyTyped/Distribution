package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomErrorResponsePolicyCustomErrorResponseRule extends StObject {
  
  /**
    * Valid values include: - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value. - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599. - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499. Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
    */
  var matchResponseCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The HTTP status code returned with the response containing the custom error content. If overrideResponseCode is not supplied, the same response code returned by the original backend bucket or backend service is returned to the client.
    */
  var overrideResponseCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The full path to a file within backendBucket . For example: /errors/defaultError.html path must start with a leading slash. path cannot have trailing slashes. If the file is not available in backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is returned to the client. The value must be from 1 to 1024 characters
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomErrorResponsePolicyCustomErrorResponseRule {
  
  inline def apply(): SchemaCustomErrorResponsePolicyCustomErrorResponseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomErrorResponsePolicyCustomErrorResponseRule]
  }
  
  extension [Self <: SchemaCustomErrorResponsePolicyCustomErrorResponseRule](x: Self) {
    
    inline def setMatchResponseCodes(value: js.Array[String]): Self = StObject.set(x, "matchResponseCodes", value.asInstanceOf[js.Any])
    
    inline def setMatchResponseCodesNull: Self = StObject.set(x, "matchResponseCodes", null)
    
    inline def setMatchResponseCodesUndefined: Self = StObject.set(x, "matchResponseCodes", js.undefined)
    
    inline def setMatchResponseCodesVarargs(value: String*): Self = StObject.set(x, "matchResponseCodes", js.Array(value*))
    
    inline def setOverrideResponseCode(value: Double): Self = StObject.set(x, "overrideResponseCode", value.asInstanceOf[js.Any])
    
    inline def setOverrideResponseCodeNull: Self = StObject.set(x, "overrideResponseCode", null)
    
    inline def setOverrideResponseCodeUndefined: Self = StObject.set(x, "overrideResponseCode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
