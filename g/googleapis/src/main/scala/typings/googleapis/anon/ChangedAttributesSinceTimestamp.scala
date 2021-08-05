package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedAttributesSinceTimestamp extends StObject {
  
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.undefined
  
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object ChangedAttributesSinceTimestamp {
  
  inline def apply(): ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedAttributesSinceTimestamp]
  }
  
  extension [Self <: ChangedAttributesSinceTimestamp](x: Self) {
    
    inline def setChangedAttributesSinceTimestamp(value: String): Self = StObject.set(x, "changedAttributesSinceTimestamp", value.asInstanceOf[js.Any])
    
    inline def setChangedAttributesSinceTimestampUndefined: Self = StObject.set(x, "changedAttributesSinceTimestamp", js.undefined)
    
    inline def setChangedMetricsSinceTimestamp(value: String): Self = StObject.set(x, "changedMetricsSinceTimestamp", value.asInstanceOf[js.Any])
    
    inline def setChangedMetricsSinceTimestampUndefined: Self = StObject.set(x, "changedMetricsSinceTimestamp", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
