package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification endpoint resource defines an endpoint to receive
  * notifications when there are status changes detected by the associated
  * health check service.
  */
@js.native
trait Schema$NotificationEndpoint extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Settings of the gRPC notification endpoint including the endpoint URL and
    * the retry duration.
    */
  var grpcSettings: js.UndefOr[Schema$NotificationEndpointGrpcSettings] = js.native
  /**
    * [Output Only] A unique identifier for this resource type. The server
    * generates this identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#notificationEndpoint
    * for notification endpoints.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the notification endpoint resides.
    * This field applies only to the regional resource. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$NotificationEndpoint {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    grpcSettings: Schema$NotificationEndpointGrpcSettings = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null
  ): Schema$NotificationEndpoint = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (grpcSettings != null) __obj.updateDynamic("grpcSettings")(grpcSettings.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NotificationEndpoint]
  }
}

