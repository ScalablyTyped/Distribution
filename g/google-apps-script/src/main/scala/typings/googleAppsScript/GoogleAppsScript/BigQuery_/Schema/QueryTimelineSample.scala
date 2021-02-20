package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTimelineSample extends StObject {
  
  var activeUnits: js.UndefOr[String] = js.native
  
  var completedUnits: js.UndefOr[String] = js.native
  
  var elapsedMs: js.UndefOr[String] = js.native
  
  var pendingUnits: js.UndefOr[String] = js.native
  
  var totalSlotMs: js.UndefOr[String] = js.native
}
object QueryTimelineSample {
  
  @scala.inline
  def apply(): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimelineSample]
  }
  
  @scala.inline
  implicit class QueryTimelineSampleMutableBuilder[Self <: QueryTimelineSample] (val x: Self) extends AnyVal {
    
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
