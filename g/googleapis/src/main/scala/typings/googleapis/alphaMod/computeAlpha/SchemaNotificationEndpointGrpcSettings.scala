package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gRPC setting that describes one gRPC notification endpoint and
  * the retry duration attempting to send notification to this endpoint.
  */
@js.native
trait SchemaNotificationEndpointGrpcSettings extends js.Object {
  /**
    * Optional. If specified, this field is used to set the authority header by
    * the sender of notifications. See
    * https://tools.ietf.org/html/rfc7540#section-8.1.2.3
    */
  var authority: js.UndefOr[String] = js.native
  /**
    * Endpoint to which gRPC notifications are sent. This must be a valid
    * gRPCLB DNS name.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * Optional. If specified, this field is used to populate the ?name? field
    * in gRPC requests.
    */
  var payloadName: js.UndefOr[String] = js.native
  /**
    * How much time (in seconds) is spent attempting notification retries until
    * a successful response is received. Default is 30s. Limit is 20m (1200s).
    * Must be a positive number.
    */
  var retryDurationSec: js.UndefOr[Double] = js.native
}

object SchemaNotificationEndpointGrpcSettings {
  @scala.inline
  def apply(
    authority: String = null,
    endpoint: String = null,
    payloadName: String = null,
    retryDurationSec: Int | Double = null
  ): SchemaNotificationEndpointGrpcSettings = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (payloadName != null) __obj.updateDynamic("payloadName")(payloadName.asInstanceOf[js.Any])
    if (retryDurationSec != null) __obj.updateDynamic("retryDurationSec")(retryDurationSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotificationEndpointGrpcSettings]
  }
}

