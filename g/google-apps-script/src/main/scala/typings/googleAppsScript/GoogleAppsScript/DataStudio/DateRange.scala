package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  /** The end date for filtering the data. Applies only dateRangeRequired is set to true. It will be in YYYY-MM-DD format. */
  var endDate: String
  
  /** The start date for filtering the data. Applies only if dateRangeRequired is set to true. It will be in YYYY-MM-DD format. */
  var startDate: String
}
object DateRange {
  
  inline def apply(endDate: String, startDate: String): DateRange = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
  
  extension [Self <: DateRange](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
