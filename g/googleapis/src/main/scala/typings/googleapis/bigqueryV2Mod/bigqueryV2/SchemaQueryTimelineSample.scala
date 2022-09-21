package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryTimelineSample extends StObject {
  
  /**
    * Total number of units currently being processed by workers. This does not correspond directly to slot usage. This is the largest value observed since the last sample.
    */
  var activeUnits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total parallel units of work completed by this query.
    */
  var completedUnits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Milliseconds elapsed since the start of query execution.
    */
  var elapsedMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Units of work that can be scheduled immediately. Providing additional slots for these units of work will speed up the query, provided no other query in the reservation needs additional slots.
    */
  var estimatedRunnableUnits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total units of work remaining for the query. This number can be revised (increased or decreased) while the query is running.
    */
  var pendingUnits: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cumulative slot-ms consumed by the query.
    */
  var totalSlotMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryTimelineSample {
  
  inline def apply(): SchemaQueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTimelineSample]
  }
  
  extension [Self <: SchemaQueryTimelineSample](x: Self) {
    
    inline def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
    
    inline def setActiveUnitsNull: Self = StObject.set(x, "activeUnits", null)
    
    inline def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
    
    inline def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    inline def setCompletedUnitsNull: Self = StObject.set(x, "completedUnits", null)
    
    inline def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    inline def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
    
    inline def setElapsedMsNull: Self = StObject.set(x, "elapsedMs", null)
    
    inline def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
    
    inline def setEstimatedRunnableUnits(value: String): Self = StObject.set(x, "estimatedRunnableUnits", value.asInstanceOf[js.Any])
    
    inline def setEstimatedRunnableUnitsNull: Self = StObject.set(x, "estimatedRunnableUnits", null)
    
    inline def setEstimatedRunnableUnitsUndefined: Self = StObject.set(x, "estimatedRunnableUnits", js.undefined)
    
    inline def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
    
    inline def setPendingUnitsNull: Self = StObject.set(x, "pendingUnits", null)
    
    inline def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsNull: Self = StObject.set(x, "totalSlotMs", null)
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
