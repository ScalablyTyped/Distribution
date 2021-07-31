package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryTimelineSample extends StObject {
  
  /**
    * Total number of units currently being processed by workers. This does not
    * correspond directly to slot usage. This is the largest value observed
    * since the last sample.
    */
  var activeUnits: js.UndefOr[String] = js.undefined
  
  /**
    * Total parallel units of work completed by this query.
    */
  var completedUnits: js.UndefOr[String] = js.undefined
  
  /**
    * Milliseconds elapsed since the start of query execution.
    */
  var elapsedMs: js.UndefOr[String] = js.undefined
  
  /**
    * Total parallel units of work remaining for the active stages.
    */
  var pendingUnits: js.UndefOr[String] = js.undefined
  
  /**
    * Cumulative slot-ms consumed by the query.
    */
  var totalSlotMs: js.UndefOr[String] = js.undefined
}
object SchemaQueryTimelineSample {
  
  @scala.inline
  def apply(): SchemaQueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTimelineSample]
  }
  
  @scala.inline
  implicit class SchemaQueryTimelineSampleMutableBuilder[Self <: SchemaQueryTimelineSample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
    
    @scala.inline
    def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    @scala.inline
    def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
    
    @scala.inline
    def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
