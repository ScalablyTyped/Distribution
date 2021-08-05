package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTimelineSample extends StObject {
  
  var activeUnits: js.UndefOr[String] = js.undefined
  
  var completedUnits: js.UndefOr[String] = js.undefined
  
  var elapsedMs: js.UndefOr[String] = js.undefined
  
  var pendingUnits: js.UndefOr[String] = js.undefined
  
  var totalSlotMs: js.UndefOr[String] = js.undefined
}
object QueryTimelineSample {
  
  inline def apply(): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimelineSample]
  }
  
  extension [Self <: QueryTimelineSample](x: Self) {
    
    inline def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
    
    inline def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
    
    inline def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    inline def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    inline def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
    
    inline def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
    
    inline def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
    
    inline def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
