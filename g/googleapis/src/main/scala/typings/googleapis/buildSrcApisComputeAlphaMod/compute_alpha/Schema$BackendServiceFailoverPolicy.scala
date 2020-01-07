package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BackendServiceFailoverPolicy extends js.Object {
  /**
    * On failover or failback, this field indicates whether connection drain
    * will be honored. Setting this to true has the following effect:
    * connections to the old active pool are not drained. Connections to the
    * new active pool use the timeout of 10 min (currently fixed). Setting to
    * false has the following effect: both old and new connections will have a
    * drain timeout of 10 min.  This can be set to true only if the protocol is
    * TCP.  The default is false.
    */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.native
  /**
    * This option is used only when no healthy VMs are detected in the primary
    * and backup instance groups. When set to true, traffic is dropped. When
    * set to false, new connections are sent across all VMs in the primary
    * group.  The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.native
  /**
    * The value of the field must be in [0, 1]. If the ratio of the healthy VMs
    * in the primary backend is at or below this number, traffic arriving at
    * the load-balanced IP will be directed to the failover backend.  In case
    * where &#39;failoverRatio&#39; is not set or all the VMs in the backup
    * backend are unhealthy, the traffic will be directed back to the primary
    * backend in the &quot;force&quot; mode, where traffic will be spread to
    * the healthy VMs with the best effort, or to all VMs when no VM is
    * healthy.  This field is only used with l4 load balancing.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
}

object Schema$BackendServiceFailoverPolicy {
  @scala.inline
  def apply(
    disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.undefined,
    dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.undefined,
    failoverRatio: Int | Double = null
  ): Schema$BackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableConnectionDrainOnFailover)) __obj.updateDynamic("disableConnectionDrainOnFailover")(disableConnectionDrainOnFailover.asInstanceOf[js.Any])
    if (!js.isUndefined(dropTrafficIfUnhealthy)) __obj.updateDynamic("dropTrafficIfUnhealthy")(dropTrafficIfUnhealthy.asInstanceOf[js.Any])
    if (failoverRatio != null) __obj.updateDynamic("failoverRatio")(failoverRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendServiceFailoverPolicy]
  }
}

