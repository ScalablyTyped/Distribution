package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaQueryTimelineSample extends js.Object {
  
  /**
    * Total number of units currently being processed by workers. This does not
    * correspond directly to slot usage. This is the largest value observed
    * since the last sample.
    */
  var activeUnits: js.UndefOr[String] = js.native
  
  /**
    * Total parallel units of work completed by this query.
    */
  var completedUnits: js.UndefOr[String] = js.native
  
  /**
    * Milliseconds elapsed since the start of query execution.
    */
  var elapsedMs: js.UndefOr[String] = js.native
  
  /**
    * Total parallel units of work remaining for the active stages.
    */
  var pendingUnits: js.UndefOr[String] = js.native
  
  /**
    * Cumulative slot-ms consumed by the query.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}
object SchemaQueryTimelineSample {
  
  @scala.inline
  def apply(): SchemaQueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTimelineSample]
  }
  
  @scala.inline
  implicit class SchemaQueryTimelineSampleOps[Self <: SchemaQueryTimelineSample] (val x: Self) extends AnyVal {
    
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
    def setActiveUnits(value: String): Self = this.set("activeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveUnits: Self = this.set("activeUnits", js.undefined)
    
    @scala.inline
    def setCompletedUnits(value: String): Self = this.set("completedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedUnits: Self = this.set("completedUnits", js.undefined)
    
    @scala.inline
    def setElapsedMs(value: String): Self = this.set("elapsedMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedMs: Self = this.set("elapsedMs", js.undefined)
    
    @scala.inline
    def setPendingUnits(value: String): Self = this.set("pendingUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingUnits: Self = this.set("pendingUnits", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
  }
}
