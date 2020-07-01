package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing information of one individual backend.
  */
@js.native
trait SchemaBackend extends js.Object {
  /**
    * Specifies the balancing mode for this backend. For global HTTP(S) or
    * TCP/SSL load balancing, the default is UTILIZATION. Valid values are
    * UTILIZATION, RATE (for HTTP(S)) and CONNECTION (for TCP/SSL).  For
    * Internal Load Balancing, the default and only supported mode is
    * CONNECTION.
    */
  var balancingMode: js.UndefOr[String] = js.native
  /**
    * A multiplier applied to the group&#39;s maximum servicing capacity (based
    * on UTILIZATION, RATE or CONNECTION). Default value is 1, which means the
    * group will serve up to 100% of its configured capacity (depending on
    * balancingMode). A setting of 0 means the group is completely drained,
    * offering 0% of its available Capacity. Valid range is [0.0,1.0].  This
    * cannot be used for internal load balancing.
    */
  var capacityScaler: js.UndefOr[Double] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This field designates whether this is a failover backend. More than one
    * failover backend can be configured for a given BackendService.
    */
  var failover: js.UndefOr[Boolean] = js.native
  /**
    * The fully-qualified URL of an Instance Group or Network Endpoint Group
    * resource. In case of instance group this defines the list of instances
    * that serve traffic. Member virtual machine instances from each instance
    * group must live in the same zone as the instance group itself. No two
    * backends in a backend service are allowed to use same Instance Group
    * resource.  For Network Endpoint Groups this defines list of endpoints.
    * All endpoints of Network Endpoint Group must be hosted on instances
    * located in the same zone as the Network Endpoint Group.  Backend service
    * can not contain mix of Instance Group and Network Endpoint Group
    * backends.  Note that you must specify an Instance Group or Network
    * Endpoint Group resource using the fully-qualified URL, rather than a
    * partial URL.  When the BackendService has load balancing scheme INTERNAL,
    * the instance group must be within the same region as the BackendService.
    * Network Endpoint Groups are not supported for INTERNAL load balancing
    * scheme.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The max number of simultaneous connections for the group. Can be used
    * with either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The max number of simultaneous connections that a single backend network
    * endpoint can handle. This is used to calculate the capacity of the group.
    * Can be used in either CONNECTION or UTILIZATION balancing modes. For
    * CONNECTION mode, either maxConnections or maxConnectionsPerEndpoint must
    * be set.  This cannot be used for internal load balancing.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double] = js.native
  /**
    * The max number of simultaneous connections that a single backend instance
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) of the group. Can be used with either
    * RATE or UTILIZATION balancing modes, but required if RATE mode. For RATE
    * mode, either maxRate or maxRatePerInstance must be set.  This cannot be
    * used for internal load balancing.
    */
  var maxRate: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) that a single backend network endpoint
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerEndpoint must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerEndpoint: js.UndefOr[Double] = js.native
  /**
    * The max requests per second (RPS) that a single backend instance can
    * handle. This is used to calculate the capacity of the group. Can be used
    * in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerInstance must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.native
  /**
    * Used when balancingMode is UTILIZATION. This ratio defines the CPU
    * utilization target for the group. The default is 0.8. Valid range is
    * [0.0, 1.0].  This cannot be used for internal load balancing.
    */
  var maxUtilization: js.UndefOr[Double] = js.native
}

object SchemaBackend {
  @scala.inline
  def apply(
    balancingMode: String = null,
    capacityScaler: js.UndefOr[Double] = js.undefined,
    description: String = null,
    failover: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    maxConnections: js.UndefOr[Double] = js.undefined,
    maxConnectionsPerEndpoint: js.UndefOr[Double] = js.undefined,
    maxConnectionsPerInstance: js.UndefOr[Double] = js.undefined,
    maxRate: js.UndefOr[Double] = js.undefined,
    maxRatePerEndpoint: js.UndefOr[Double] = js.undefined,
    maxRatePerInstance: js.UndefOr[Double] = js.undefined,
    maxUtilization: js.UndefOr[Double] = js.undefined
  ): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    if (balancingMode != null) __obj.updateDynamic("balancingMode")(balancingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(capacityScaler)) __obj.updateDynamic("capacityScaler")(capacityScaler.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(failover)) __obj.updateDynamic("failover")(failover.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnectionsPerEndpoint)) __obj.updateDynamic("maxConnectionsPerEndpoint")(maxConnectionsPerEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnectionsPerInstance)) __obj.updateDynamic("maxConnectionsPerInstance")(maxConnectionsPerInstance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRate)) __obj.updateDynamic("maxRate")(maxRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRatePerEndpoint)) __obj.updateDynamic("maxRatePerEndpoint")(maxRatePerEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRatePerInstance)) __obj.updateDynamic("maxRatePerInstance")(maxRatePerInstance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUtilization)) __obj.updateDynamic("maxUtilization")(maxUtilization.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackend]
  }
}

