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
  def apply(): SchemaHealthCheckService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckService]
  }
  @scala.inline
  implicit class SchemaHealthCheckServiceOps[Self <: SchemaHealthCheckService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = this.set("healthChecks", js.Array(value :_*))
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
    @scala.inline
    def setHealthStatusAggregationStrategy(value: String): Self = this.set("healthStatusAggregationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthStatusAggregationStrategy: Self = this.set("healthStatusAggregationStrategy", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkEndpointGroupsVarargs(value: String*): Self = this.set("networkEndpointGroups", js.Array(value :_*))
    @scala.inline
    def setNetworkEndpointGroups(value: js.Array[String]): Self = this.set("networkEndpointGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndpointGroups: Self = this.set("networkEndpointGroups", js.undefined)
    @scala.inline
    def setNotificationEndpointsVarargs(value: String*): Self = this.set("notificationEndpoints", js.Array(value :_*))
    @scala.inline
    def setNotificationEndpoints(value: js.Array[String]): Self = this.set("notificationEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationEndpoints: Self = this.set("notificationEndpoints", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
  }
  
}

