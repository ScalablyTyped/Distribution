package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerAutoHealingPolicy extends StObject {
  
  /**
    * The URL for the health check that signals autohealing.
    */
  var healthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds that the managed instance group waits before it
    * applies autohealing policies to new instances or recently recreated
    * instances. This initial delay allows instances to initialize and run
    * their startup scripts before the instance group determines that they are
    * UNHEALTHY. This prevents the managed instance group from recreating its
    * instances prematurely. This value must be from range [0, 3600].
    */
  var initialDelaySec: js.UndefOr[Double] = js.undefined
  
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
  var maxUnavailable: js.UndefOr[SchemaFixedOrPercent] = js.undefined
}
object SchemaInstanceGroupManagerAutoHealingPolicy {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerAutoHealingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerAutoHealingPolicy]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerAutoHealingPolicyMutableBuilder[Self <: SchemaInstanceGroupManagerAutoHealingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setInitialDelaySec(value: Double): Self = StObject.set(x, "initialDelaySec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelaySecUndefined: Self = StObject.set(x, "initialDelaySec", js.undefined)
    
    @scala.inline
    def setMaxUnavailable(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
  }
}
