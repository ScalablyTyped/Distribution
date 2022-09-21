package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStatsGetsearchapplication
  extends StObject
     with StandardParameters {
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("endDate.day")
  var endDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("endDate.month")
  var endDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("endDate.year")
  var endDateDotyear: js.UndefOr[Double] = js.undefined
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("startDate.day")
  var startDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("startDate.month")
  var startDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("startDate.year")
  var startDateDotyear: js.UndefOr[Double] = js.undefined
}
object ParamsResourceStatsGetsearchapplication {
  
  inline def apply(): ParamsResourceStatsGetsearchapplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatsGetsearchapplication]
  }
  
  extension [Self <: ParamsResourceStatsGetsearchapplication](x: Self) {
    
    inline def setEndDateDotday(value: Double): Self = StObject.set(x, "endDate.day", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotdayUndefined: Self = StObject.set(x, "endDate.day", js.undefined)
    
    inline def setEndDateDotmonth(value: Double): Self = StObject.set(x, "endDate.month", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotmonthUndefined: Self = StObject.set(x, "endDate.month", js.undefined)
    
    inline def setEndDateDotyear(value: Double): Self = StObject.set(x, "endDate.year", value.asInstanceOf[js.Any])
    
    inline def setEndDateDotyearUndefined: Self = StObject.set(x, "endDate.year", js.undefined)
    
    inline def setStartDateDotday(value: Double): Self = StObject.set(x, "startDate.day", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotdayUndefined: Self = StObject.set(x, "startDate.day", js.undefined)
    
    inline def setStartDateDotmonth(value: Double): Self = StObject.set(x, "startDate.month", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotmonthUndefined: Self = StObject.set(x, "startDate.month", js.undefined)
    
    inline def setStartDateDotyear(value: Double): Self = StObject.set(x, "startDate.year", value.asInstanceOf[js.Any])
    
    inline def setStartDateDotyearUndefined: Self = StObject.set(x, "startDate.year", js.undefined)
  }
}
