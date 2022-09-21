package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStatsUserSearchapplicationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("fromDate.day")
  var fromDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("fromDate.month")
  var fromDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("fromDate.year")
  var fromDateDotyear: js.UndefOr[Double] = js.undefined
  
  /**
    * The resource id of the search application session stats, in the following format: searchapplications/{application_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("toDate.day")
  var toDateDotday: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("toDate.month")
  var toDateDotmonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("toDate.year")
  var toDateDotyear: js.UndefOr[Double] = js.undefined
}
object ParamsResourceStatsUserSearchapplicationsGet {
  
  inline def apply(): ParamsResourceStatsUserSearchapplicationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatsUserSearchapplicationsGet]
  }
  
  extension [Self <: ParamsResourceStatsUserSearchapplicationsGet](x: Self) {
    
    inline def setFromDateDotday(value: Double): Self = StObject.set(x, "fromDate.day", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotdayUndefined: Self = StObject.set(x, "fromDate.day", js.undefined)
    
    inline def setFromDateDotmonth(value: Double): Self = StObject.set(x, "fromDate.month", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotmonthUndefined: Self = StObject.set(x, "fromDate.month", js.undefined)
    
    inline def setFromDateDotyear(value: Double): Self = StObject.set(x, "fromDate.year", value.asInstanceOf[js.Any])
    
    inline def setFromDateDotyearUndefined: Self = StObject.set(x, "fromDate.year", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setToDateDotday(value: Double): Self = StObject.set(x, "toDate.day", value.asInstanceOf[js.Any])
    
    inline def setToDateDotdayUndefined: Self = StObject.set(x, "toDate.day", js.undefined)
    
    inline def setToDateDotmonth(value: Double): Self = StObject.set(x, "toDate.month", value.asInstanceOf[js.Any])
    
    inline def setToDateDotmonthUndefined: Self = StObject.set(x, "toDate.month", js.undefined)
    
    inline def setToDateDotyear(value: Double): Self = StObject.set(x, "toDate.year", value.asInstanceOf[js.Any])
    
    inline def setToDateDotyearUndefined: Self = StObject.set(x, "toDate.year", js.undefined)
  }
}
