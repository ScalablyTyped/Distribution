package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedAttributesSinceTimestamp extends StObject {
  
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.native
  
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object ChangedAttributesSinceTimestamp {
  
  @scala.inline
  def apply(): ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedAttributesSinceTimestamp]
  }
  
  @scala.inline
  implicit class ChangedAttributesSinceTimestampMutableBuilder[Self <: ChangedAttributesSinceTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedAttributesSinceTimestamp(value: String): Self = StObject.set(x, "changedAttributesSinceTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedAttributesSinceTimestampUndefined: Self = StObject.set(x, "changedAttributesSinceTimestamp", js.undefined)
    
    @scala.inline
    def setChangedMetricsSinceTimestamp(value: String): Self = StObject.set(x, "changedMetricsSinceTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedMetricsSinceTimestampUndefined: Self = StObject.set(x, "changedMetricsSinceTimestamp", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
