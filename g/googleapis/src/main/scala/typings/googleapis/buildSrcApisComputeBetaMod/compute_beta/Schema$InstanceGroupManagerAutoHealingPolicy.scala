package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

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
}

object Schema$InstanceGroupManagerAutoHealingPolicy {
  @scala.inline
  def apply(healthCheck: String = null, initialDelaySec: Int | Double = null): Schema$InstanceGroupManagerAutoHealingPolicy = {
    val __obj = js.Dynamic.literal()
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (initialDelaySec != null) __obj.updateDynamic("initialDelaySec")(initialDelaySec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagerAutoHealingPolicy]
  }
}

