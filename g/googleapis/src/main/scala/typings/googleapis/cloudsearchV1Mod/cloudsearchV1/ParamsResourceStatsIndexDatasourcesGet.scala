package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStatsIndexDatasourcesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
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
    * The resource id of the data source to retrieve statistics for, in the
    * following format: "datasources/{source_id}"
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
object ParamsResourceStatsIndexDatasourcesGet {
  
  @scala.inline
  def apply(): ParamsResourceStatsIndexDatasourcesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatsIndexDatasourcesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceStatsIndexDatasourcesGetMutableBuilder[Self <: ParamsResourceStatsIndexDatasourcesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFromDateDotday(value: Double): Self = StObject.set(x, "fromDate.day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateDotdayUndefined: Self = StObject.set(x, "fromDate.day", js.undefined)
    
    @scala.inline
    def setFromDateDotmonth(value: Double): Self = StObject.set(x, "fromDate.month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateDotmonthUndefined: Self = StObject.set(x, "fromDate.month", js.undefined)
    
    @scala.inline
    def setFromDateDotyear(value: Double): Self = StObject.set(x, "fromDate.year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateDotyearUndefined: Self = StObject.set(x, "fromDate.year", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setToDateDotday(value: Double): Self = StObject.set(x, "toDate.day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateDotdayUndefined: Self = StObject.set(x, "toDate.day", js.undefined)
    
    @scala.inline
    def setToDateDotmonth(value: Double): Self = StObject.set(x, "toDate.month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateDotmonthUndefined: Self = StObject.set(x, "toDate.month", js.undefined)
    
    @scala.inline
    def setToDateDotyear(value: Double): Self = StObject.set(x, "toDate.year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateDotyearUndefined: Self = StObject.set(x, "toDate.year", js.undefined)
  }
}
