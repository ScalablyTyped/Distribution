package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy extends StObject {
  
  /**
    * Maximum age of the snapshot that is allowed to be kept.
    */
  var maxRetentionDays: js.UndefOr[Double | Null] = js.undefined
  
  var onPolicySwitch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
    */
  var onSourceDiskDelete: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  
  inline def apply(): SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
  
  extension [Self <: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy](x: Self) {
    
    inline def setMaxRetentionDays(value: Double): Self = StObject.set(x, "maxRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMaxRetentionDaysNull: Self = StObject.set(x, "maxRetentionDays", null)
    
    inline def setMaxRetentionDaysUndefined: Self = StObject.set(x, "maxRetentionDays", js.undefined)
    
    inline def setOnPolicySwitch(value: String): Self = StObject.set(x, "onPolicySwitch", value.asInstanceOf[js.Any])
    
    inline def setOnPolicySwitchNull: Self = StObject.set(x, "onPolicySwitch", null)
    
    inline def setOnPolicySwitchUndefined: Self = StObject.set(x, "onPolicySwitch", js.undefined)
    
    inline def setOnSourceDiskDelete(value: String): Self = StObject.set(x, "onSourceDiskDelete", value.asInstanceOf[js.Any])
    
    inline def setOnSourceDiskDeleteNull: Self = StObject.set(x, "onSourceDiskDelete", null)
    
    inline def setOnSourceDiskDeleteUndefined: Self = StObject.set(x, "onSourceDiskDelete", js.undefined)
  }
}
