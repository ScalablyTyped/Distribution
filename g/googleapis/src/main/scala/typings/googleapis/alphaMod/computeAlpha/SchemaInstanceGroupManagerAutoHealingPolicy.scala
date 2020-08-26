package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerAutoHealingPolicy extends js.Object {
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
  var maxUnavailable: js.UndefOr[SchemaFixedOrPercent] = js.native
}

object SchemaInstanceGroupManagerAutoHealingPolicy {
  @scala.inline
  def apply(): SchemaInstanceGroupManagerAutoHealingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerAutoHealingPolicy]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerAutoHealingPolicyOps[Self <: SchemaInstanceGroupManagerAutoHealingPolicy] (val x: Self) extends AnyVal {
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
    def setHealthCheck(value: String): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    @scala.inline
    def setInitialDelaySec(value: Double): Self = this.set("initialDelaySec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDelaySec: Self = this.set("initialDelaySec", js.undefined)
    @scala.inline
    def setMaxUnavailable(value: SchemaFixedOrPercent): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUnavailable: Self = this.set("maxUnavailable", js.undefined)
  }
  
}

