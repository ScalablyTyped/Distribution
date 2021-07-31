package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerUpdatePolicy extends StObject {
  
  /**
    * The maximum number of instances that can be created above the specified
    * targetSize during the update process. By default, a fixed value of 1 is
    * used. This value can be either a fixed number or a percentage if the
    * instance group has 10 or more instances. If you set a percentage, the
    * number of instances will be rounded up if necessary.  At least one of
    * either maxSurge or maxUnavailable must be greater than 0. Learn more
    * about maxSurge.
    */
  var maxSurge: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * The maximum number of instances that can be unavailable during the update
    * process. An instance is considered available if all of the following
    * conditions are satisfied:    - The instance&#39;s status is RUNNING.  -
    * If there is a health check on the instance group, the instance&#39;s
    * liveness health check result must be HEALTHY at least once. If there is
    * no health check on the group, then the instance only needs to have a
    * status of RUNNING to be considered available.  By default, a fixed value
    * of 1 is used. This value can be either a fixed number or a percentage if
    * the instance group has 10 or more instances. If you set a percentage, the
    * number of instances will be rounded up if necessary.  At least one of
    * either maxSurge or maxUnavailable must be greater than 0. Learn more
    * about maxUnavailable.
    */
  var maxUnavailable: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * Minimum number of seconds to wait for after a newly created instance
    * becomes available. This value must be from range [0, 3600].
    */
  var minReadySec: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimal action to be taken on an instance. You can specify either RESTART
    * to restart existing instances or REPLACE to delete and create new
    * instances from the target template. If you specify a RESTART, the Updater
    * will attempt to perform that action only. However, if the Updater
    * determines that the minimal action you specify is not enough to perform
    * the update, it might perform a more disruptive action.
    */
  var minimalAction: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaInstanceGroupManagerUpdatePolicy {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerUpdatePolicy]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerUpdatePolicyMutableBuilder[Self <: SchemaInstanceGroupManagerUpdatePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSurge(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxSurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSurgeUndefined: Self = StObject.set(x, "maxSurge", js.undefined)
    
    @scala.inline
    def setMaxUnavailable(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
    
    @scala.inline
    def setMinReadySec(value: Double): Self = StObject.set(x, "minReadySec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinReadySecUndefined: Self = StObject.set(x, "minReadySec", js.undefined)
    
    @scala.inline
    def setMinimalAction(value: String): Self = StObject.set(x, "minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimalActionUndefined: Self = StObject.set(x, "minimalAction", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
