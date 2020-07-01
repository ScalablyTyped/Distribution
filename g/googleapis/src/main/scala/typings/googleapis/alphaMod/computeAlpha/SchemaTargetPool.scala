package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TargetPool resource. This resource defines a pool of instances, an
  * associated HttpHealthCheck resource, and the fallback target pool. (==
  * resource_for beta.targetPools ==) (== resource_for v1.targetPools ==)
  */
@js.native
trait SchemaTargetPool extends js.Object {
  /**
    * This field is applicable only when the containing target pool is serving
    * a forwarding rule as the primary pool, and its failoverRatio field is
    * properly set to a value between [0, 1].  backupPool and failoverRatio
    * together define the fallback behavior of the primary target pool: if the
    * ratio of the healthy instances in the primary pool is at or below
    * failoverRatio, traffic arriving at the load-balanced IP will be directed
    * to the backup pool.  In case where failoverRatio and backupPool are not
    * set, or all the instances in the backup pool are unhealthy, the traffic
    * will be directed back to the primary pool in the &quot;force&quot; mode,
    * where traffic will be spread to the healthy instances with the best
    * effort, or to all instances when no instance is healthy.
    */
  var backupPool: js.UndefOr[String] = js.native
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
    * This field is applicable only when the containing target pool is serving
    * a forwarding rule as the primary pool (i.e., not as a backup pool to some
    * other target pool). The value of the field must be in [0, 1].  If set,
    * backupPool must also be set. They together define the fallback behavior
    * of the primary target pool: if the ratio of the healthy instances in the
    * primary pool is at or below this number, traffic arriving at the
    * load-balanced IP will be directed to the backup pool.  In case where
    * failoverRatio is not set or all the instances in the backup pool are
    * unhealthy, the traffic will be directed back to the primary pool in the
    * &quot;force&quot; mode, where traffic will be spread to the healthy
    * instances with the best effort, or to all instances when no instance is
    * healthy.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
  /**
    * The URL of the HttpHealthCheck resource. A member instance in this pool
    * is considered healthy if and only if the health checks pass. An empty
    * list means all member instances will be considered healthy at all times.
    * Only HttpHealthChecks are supported. Only one health check may be
    * specified.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of resource URLs to the virtual machine instances serving this
    * pool. They must live in zones contained in the same region as this pool.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#targetPool for target
    * pools.
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
    * [Output Only] URL of the region where the target pool resides.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * Session affinity option, must be one of the following values: NONE:
    * Connections from the same client IP may go to any instance in the pool.
    * CLIENT_IP: Connections from the same client IP will go to the same
    * instance in the pool while that instance remains healthy.
    * CLIENT_IP_PROTO: Connections from the same client IP with the same IP
    * protocol will go to the same instance in the pool while that instance
    * remains healthy.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
}

object SchemaTargetPool {
  @scala.inline
  def apply(
    backupPool: String = null,
    creationTimestamp: String = null,
    description: String = null,
    failoverRatio: js.UndefOr[Double] = js.undefined,
    healthChecks: js.Array[String] = null,
    id: String = null,
    instances: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    sessionAffinity: String = null
  ): SchemaTargetPool = {
    val __obj = js.Dynamic.literal()
    if (backupPool != null) __obj.updateDynamic("backupPool")(backupPool.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(failoverRatio)) __obj.updateDynamic("failoverRatio")(failoverRatio.get.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (sessionAffinity != null) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPool]
  }
}

