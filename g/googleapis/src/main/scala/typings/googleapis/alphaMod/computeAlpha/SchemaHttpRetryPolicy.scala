package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The retry policy associates with HttpRouteRule
  */
@js.native
trait SchemaHttpRetryPolicy extends js.Object {
  /**
    * Specifies the allowed number retries. This number must be &gt; 0.
    */
  var numRetries: js.UndefOr[Double] = js.native
  /**
    * Specifies a non-zero timeout per retry attempt.
    */
  var perTryTimeout: js.UndefOr[SchemaDuration] = js.native
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
  var retryConditions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHttpRetryPolicy {
  @scala.inline
  def apply(
    numRetries: js.UndefOr[Double] = js.undefined,
    perTryTimeout: SchemaDuration = null,
    retryConditions: js.Array[String] = null
  ): SchemaHttpRetryPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numRetries)) __obj.updateDynamic("numRetries")(numRetries.get.asInstanceOf[js.Any])
    if (perTryTimeout != null) __obj.updateDynamic("perTryTimeout")(perTryTimeout.asInstanceOf[js.Any])
    if (retryConditions != null) __obj.updateDynamic("retryConditions")(retryConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpRetryPolicy]
  }
}

