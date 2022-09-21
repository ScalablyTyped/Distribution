package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerInstanceLifecyclePolicy extends StObject {
  
  /**
    * A bit indicating whether to forcefully apply the group's latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. Instead, configuration updates are applied according to the group's update policy. - YES: If configuration updates are available, they are applied during repair.
    */
  var forceUpdateOnRepair: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
    */
  var metadataBasedReadinessSignal: js.UndefOr[SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal] = js.undefined
}
object SchemaInstanceGroupManagerInstanceLifecyclePolicy {
  
  inline def apply(): SchemaInstanceGroupManagerInstanceLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerInstanceLifecyclePolicy]
  }
  
  extension [Self <: SchemaInstanceGroupManagerInstanceLifecyclePolicy](x: Self) {
    
    inline def setForceUpdateOnRepair(value: String): Self = StObject.set(x, "forceUpdateOnRepair", value.asInstanceOf[js.Any])
    
    inline def setForceUpdateOnRepairNull: Self = StObject.set(x, "forceUpdateOnRepair", null)
    
    inline def setForceUpdateOnRepairUndefined: Self = StObject.set(x, "forceUpdateOnRepair", js.undefined)
    
    inline def setMetadataBasedReadinessSignal(value: SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal): Self = StObject.set(x, "metadataBasedReadinessSignal", value.asInstanceOf[js.Any])
    
    inline def setMetadataBasedReadinessSignalUndefined: Self = StObject.set(x, "metadataBasedReadinessSignal", js.undefined)
  }
}
