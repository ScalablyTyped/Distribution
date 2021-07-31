package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The retry policy associates with HttpRouteRule
  */
trait SchemaHttpRetryPolicy extends StObject {
  
  /**
    * Specifies the allowed number retries. This number must be &gt; 0.
    */
  var numRetries: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a non-zero timeout per retry attempt.
    */
  var perTryTimeout: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * Specfies one or more conditions when this retry rule applies. Valid
    * values are:   - 5xx: Loadbalancer will attempt a retry if the backend
    * service responds with any 5xx response code, or if the backend service
    * does not respond at all, example: disconnects, reset, read timeout,
    * connection failure, and refused streams.  - gateway-error: Similar to
    * 5xx, but only applies to response codes 502, 503 or 504. -  -
    * connect-failure: Loadbalancer will retry on failures connecting to
    * backend services, for example due to connection timeouts.  -
    * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
    * Currently the only retriable error supported is 409.  -
    * refused-stream:Loadbalancer will retry if the backend service resets the
    * stream with a REFUSED_STREAM error code. This reset type indicates that
    * it is safe to retry.  - cancelledLoadbalancer will retry if the gRPC
    * status code in the response header is set to cancelled  -
    * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the
    * response header is set to deadline-exceeded  - resource-exhausted:
    * Loadbalancer will retry if the gRPC status code in the response header is
    * set to resource-exhausted  - unavailable: Loadbalancer will retry if the
    * gRPC status code in the response header is set to unavailable
    */
  var retryConditions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaHttpRetryPolicy {
  
  @scala.inline
  def apply(): SchemaHttpRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRetryPolicy]
  }
  
  @scala.inline
  implicit class SchemaHttpRetryPolicyMutableBuilder[Self <: SchemaHttpRetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
    
    @scala.inline
    def setPerTryTimeout(value: SchemaDuration): Self = StObject.set(x, "perTryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerTryTimeoutUndefined: Self = StObject.set(x, "perTryTimeout", js.undefined)
    
    @scala.inline
    def setRetryConditions(value: js.Array[String]): Self = StObject.set(x, "retryConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryConditionsUndefined: Self = StObject.set(x, "retryConditions", js.undefined)
    
    @scala.inline
    def setRetryConditionsVarargs(value: String*): Self = StObject.set(x, "retryConditions", js.Array(value :_*))
  }
}
