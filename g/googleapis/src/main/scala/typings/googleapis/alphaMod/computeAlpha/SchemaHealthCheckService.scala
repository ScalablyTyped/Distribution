package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A HealthCheckService defines a set of backends on which to perform periodic
  * health checks and an endpoint to which to send notification of changes in
  * the health status of the backends.
  */
@js.native
trait SchemaHealthCheckService extends js.Object {
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
    * List of URLs to the HealthCheck resources. Must have at least one
    * HealthCheck, and not more than 10. HealthCheck resources must have
    * portSpecification=USE_SERVING_PORT. For regional HealthCheckService, the
    * HealthCheck must be regional and in the same region. For global
    * HealthCheckService, HealthCheck must be global. Mix of regional and
    * global HealthChecks is not supported. Multiple regional HealthChecks must
    * belong to the same region. Regional HealthChecks&lt;/code? must belong to
    * the same region as zones of NEGs.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Policy for how the results from multiple health checks for the same
    * endpoint are aggregated.   - NO_AGGREGATION. An EndpointHealth message is
    * returned for each backend in the health check service.  - AND. If any
    * backend&#39;s health check reports UNHEALTHY, then UNHEALTHY is the
    * HealthState of the entire health check service. If all backend&#39;s are
    * healthy, the HealthState of the health check service is HEALTHY. .
    */
  var healthStatusAggregationStrategy: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] Type of the resource. Always compute#healthCheckServicefor
    * health check services.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of URLs to the NetworkEndpointGroup resources. Must not have more
    * than 100. For regional HealthCheckService, NEGs must be in zones in the
    * region of the HealthCheckService.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of URLs to the NotificationEndpoint resources. Must not have more
    * than 10. A list of endpoints for receiving notifications of change in
    * health status. For regional HealthCheckService, NotificationEndpoint must
    * be regional and in the same region. For global HealthCheckService,
    * NotificationEndpoint must be global.
    */
  var notificationEndpoints: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] URL of the region where the health check service resides.
    * This field is not applicable to global health check services. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL with id for the resource.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
}

object SchemaHealthCheckService {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    healthChecks: js.Array[String] = null,
    healthStatusAggregationStrategy: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    networkEndpointGroups: js.Array[String] = null,
    notificationEndpoints: js.Array[String] = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null
  ): SchemaHealthCheckService = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (healthStatusAggregationStrategy != null) __obj.updateDynamic("healthStatusAggregationStrategy")(healthStatusAggregationStrategy.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkEndpointGroups != null) __obj.updateDynamic("networkEndpointGroups")(networkEndpointGroups.asInstanceOf[js.Any])
    if (notificationEndpoints != null) __obj.updateDynamic("notificationEndpoints")(notificationEndpoints.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthCheckService]
  }
}

