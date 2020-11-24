package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Policy for retention of scheduled snapshots.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy extends js.Object {
  
  /**
    * Maximum age of the snapshot that is allowed to be kept.
    */
  var maxRetentionDays: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the behavior to apply to scheduled snapshots when the source
    * disk is deleted.
    */
  var onSourceDiskDelete: js.UndefOr[String] = js.native
}
object SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicyOps[Self <: SchemaResourcePolicySnapshotSchedulePolicyRetentionPolicy] (val x: Self) extends AnyVal {
    
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
    def setMaxRetentionDays(value: Double): Self = this.set("maxRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetentionDays: Self = this.set("maxRetentionDays", js.undefined)
    
    @scala.inline
    def setOnSourceDiskDelete(value: String): Self = this.set("onSourceDiskDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSourceDiskDelete: Self = this.set("onSourceDiskDelete", js.undefined)
  }
}
