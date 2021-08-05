package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesVoidedpurchasesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The time, in milliseconds since the Epoch, of the newest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be greater than the current time and is ignored if a
    * pagination token is set. Default value is current time. Note: This filter
    * is applied on the time at which the record is seen as voided by our
    * systems and not the actual voided time returned in the response.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The package name of the application for which voided purchases need to be
    * returned (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The time, in milliseconds since the Epoch, of the oldest voided in-app
    * product purchase that you want to see in the response. The value of this
    * parameter cannot be older than 30 days and is ignored if a pagination
    * token is set. Default value is current time minus 30 days. Note: This
    * filter is applied on the time at which the record is seen as voided by
    * our systems and not the actual voided time returned in the response.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesVoidedpurchasesList {
  
  inline def apply(): ParamsResourcePurchasesVoidedpurchasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesVoidedpurchasesList]
  }
  
  extension [Self <: ParamsResourcePurchasesVoidedpurchasesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
