package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
}
