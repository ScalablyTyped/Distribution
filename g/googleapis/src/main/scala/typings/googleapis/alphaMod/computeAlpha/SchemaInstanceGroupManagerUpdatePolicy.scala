package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerUpdatePolicy extends StObject {
  
  /**
    * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
    */
  var instanceRedistributionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
    */
  var maxSurge: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
    */
  var maxUnavailable: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600].
    */
  var minReadySec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimal action to be taken on an instance. Use this option to minimize disruption as much as possible or to apply a more disruptive action than is necessary. - To limit disruption as much as possible, set the minimal action to REFRESH. If your update requires a more disruptive action, Compute Engine performs the necessary action to execute the update. - To apply a more disruptive action than is strictly necessary, set the minimal action to RESTART or REPLACE. For example, Compute Engine does not need to restart a VM to change its metadata. But if your application reads instance metadata only when a VM is restarted, you can set the minimal action to RESTART in order to pick up metadata changes.
    */
  var minimalAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * What action should be used to replace instances. See minimal_action.REPLACE
    */
  var replacementMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupManagerUpdatePolicy {
  
  inline def apply(): SchemaInstanceGroupManagerUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerUpdatePolicy]
  }
  
  extension [Self <: SchemaInstanceGroupManagerUpdatePolicy](x: Self) {
    
    inline def setInstanceRedistributionType(value: String): Self = StObject.set(x, "instanceRedistributionType", value.asInstanceOf[js.Any])
    
    inline def setInstanceRedistributionTypeNull: Self = StObject.set(x, "instanceRedistributionType", null)
    
    inline def setInstanceRedistributionTypeUndefined: Self = StObject.set(x, "instanceRedistributionType", js.undefined)
    
    inline def setMaxSurge(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxSurge", value.asInstanceOf[js.Any])
    
    inline def setMaxSurgeUndefined: Self = StObject.set(x, "maxSurge", js.undefined)
    
    inline def setMaxUnavailable(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
    
    inline def setMinReadySec(value: Double): Self = StObject.set(x, "minReadySec", value.asInstanceOf[js.Any])
    
    inline def setMinReadySecNull: Self = StObject.set(x, "minReadySec", null)
    
    inline def setMinReadySecUndefined: Self = StObject.set(x, "minReadySec", js.undefined)
    
    inline def setMinimalAction(value: String): Self = StObject.set(x, "minimalAction", value.asInstanceOf[js.Any])
    
    inline def setMinimalActionNull: Self = StObject.set(x, "minimalAction", null)
    
    inline def setMinimalActionUndefined: Self = StObject.set(x, "minimalAction", js.undefined)
    
    inline def setMostDisruptiveAllowedAction(value: String): Self = StObject.set(x, "mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    
    inline def setMostDisruptiveAllowedActionNull: Self = StObject.set(x, "mostDisruptiveAllowedAction", null)
    
    inline def setMostDisruptiveAllowedActionUndefined: Self = StObject.set(x, "mostDisruptiveAllowedAction", js.undefined)
    
    inline def setReplacementMethod(value: String): Self = StObject.set(x, "replacementMethod", value.asInstanceOf[js.Any])
    
    inline def setReplacementMethodNull: Self = StObject.set(x, "replacementMethod", null)
    
    inline def setReplacementMethodUndefined: Self = StObject.set(x, "replacementMethod", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
