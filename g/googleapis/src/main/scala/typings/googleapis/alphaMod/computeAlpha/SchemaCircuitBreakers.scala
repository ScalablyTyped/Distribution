package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings controlling the volume of connections to a backend service.
  */
@js.native
trait SchemaCircuitBreakers extends js.Object {
  /**
    * The timeout for new network connections to hosts.
    */
  var connectTimeout: js.UndefOr[SchemaDuration] = js.native
  /**
    * The maximum number of connections to the backend cluster. If not
    * specified, the default is 1024.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The maximum number of pending requests allowed to the backend cluster. If
    * not specified, the default is 1024.
    */
  var maxPendingRequests: js.UndefOr[Double] = js.native
  /**
    * The maximum number of parallel requests that allowed to the backend
    * cluster. If not specified, the default is 1024.
    */
  var maxRequests: js.UndefOr[Double] = js.native
  /**
    * Maximum requests for a single backend connection. This parameter is
    * respected by both the HTTP/1.1 and HTTP/2 implementations. If not
    * specified, there is no limit. Setting this parameter to 1 will
    * effectively disable keep alive.
    */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  /**
    * The maximum number of parallel retries allowed to the backend cluster. If
    * not specified, the default is 3.
    */
  var maxRetries: js.UndefOr[Double] = js.native
}

object SchemaCircuitBreakers {
  @scala.inline
  def apply(
    connectTimeout: SchemaDuration = null,
    maxConnections: Int | Double = null,
    maxPendingRequests: Int | Double = null,
    maxRequests: Int | Double = null,
    maxRequestsPerConnection: Int | Double = null,
    maxRetries: Int | Double = null
  ): SchemaCircuitBreakers = {
    val __obj = js.Dynamic.literal()
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxPendingRequests != null) __obj.updateDynamic("maxPendingRequests")(maxPendingRequests.asInstanceOf[js.Any])
    if (maxRequests != null) __obj.updateDynamic("maxRequests")(maxRequests.asInstanceOf[js.Any])
    if (maxRequestsPerConnection != null) __obj.updateDynamic("maxRequestsPerConnection")(maxRequestsPerConnection.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCircuitBreakers]
  }
}

