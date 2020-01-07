package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagerAutoHealingPolicy extends js.Object {
  /**
    * The URL for the health check that signals autohealing.
    */
  var healthCheck: js.UndefOr[String] = js.native
  /**
    * The number of seconds that the managed instance group waits before it
    * applies autohealing policies to new instances or recently recreated
    * instances. This initial delay allows instances to initialize and run
    * their startup scripts before the instance group determines that they are
    * UNHEALTHY. This prevents the managed instance group from recreating its
    * instances prematurely. This value must be from range [0, 3600].
    */
  var initialDelaySec: js.UndefOr[Double] = js.native
  /**
    * Maximum number of instances that can be unavailable when autohealing.
    * When &#39;percent&#39; is used, the value is rounded UP. The instance is
    * considered available if all of the following conditions are satisfied: 1.
    * Instance&#39;s status is RUNNING. 2. Instance&#39;s currentAction is NONE
    * (in particular its liveness health check result was observed to be
    * HEALTHY at least once as it passed VERIFYING). 3. There is no outgoing
    * action on an instance triggered by IGM.  By default, number of
    * concurrently autohealed instances is smaller than the managed instance
    * group target size. However, if a zonal managed instance group has only
    * one instance, or a regional managed instance group has only one instance
    * per zone, autohealing will recreate these instances when they become
    * unhealthy.
    */
  var maxUnavailable: js.UndefOr[Schema$FixedOrPercent] = js.native
}

object Schema$InstanceGroupManagerAutoHealingPolicy {
  @scala.inline
  def apply(
    healthCheck: String = null,
    initialDelaySec: Int | Double = null,
    maxUnavailable: Schema$FixedOrPercent = null
  ): Schema$InstanceGroupManagerAutoHealingPolicy = {
    val __obj = js.Dynamic.literal()
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (initialDelaySec != null) __obj.updateDynamic("initialDelaySec")(initialDelaySec.asInstanceOf[js.Any])
    if (maxUnavailable != null) __obj.updateDynamic("maxUnavailable")(maxUnavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagerAutoHealingPolicy]
  }
}

