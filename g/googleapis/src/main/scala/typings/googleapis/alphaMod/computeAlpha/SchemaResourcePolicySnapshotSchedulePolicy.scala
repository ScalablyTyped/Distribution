package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A snapshot schedule policy specifies when and how frequently snapshots are
  * to be created for the target disk. Also specifies how many and how long
  * these scheduled snapshots should be retained.
  */
trait SchemaResourcePolicySnapshotSchedulePolicy extends StObject {
  
  /**
    * Retention policy applied to snapshots created by this resource policy.
    */
  var retentionPolicy: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.undefined
  
  /**
    * A Vm Maintenance Policy specifies what kind of infrastructure maintenance
    * we are allowed to perform on this VM and when. Schedule that is applied
    * to disks covered by this policy.
    */
  var schedule: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySchedule] = js.undefined
  
  /**
    * Properties with which snapshots are created such as labels, encryption
    * keys.
    */
  var snapshotProperties: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.undefined
}
object SchemaResourcePolicySnapshotSchedulePolicy {
  
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicy]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyMutableBuilder[Self <: SchemaResourcePolicySnapshotSchedulePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionPolicy(value: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    @scala.inline
    def setSchedule(value: SchemaResourcePolicySnapshotSchedulePolicySchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSnapshotProperties(value: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties): Self = StObject.set(x, "snapshotProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotPropertiesUndefined: Self = StObject.set(x, "snapshotProperties", js.undefined)
  }
}
