package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreezePeriod extends StObject {
  
  /**
    * The end date (inclusive) of the freeze period. Must be no later than 90 days from the start date. If the end date is earlier than the start date, the freeze period is considered wrapping year-end. Note: year must not be set. For example, {"month": 1,"date": 30\}.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The start date (inclusive) of the freeze period. Note: year must not be set. For example, {"month": 1,"date": 30\}.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaFreezePeriod {
  
  inline def apply(): SchemaFreezePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreezePeriod]
  }
  
  extension [Self <: SchemaFreezePeriod](x: Self) {
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
