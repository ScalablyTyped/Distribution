package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesSkusList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time. Optional. If not specified
    * USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Defaults to 5000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus` call. If
    * unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service. Example: "services/DA34-426B-A397"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesSkusList {
  
  @scala.inline
  def apply(): ParamsResourceServicesSkusList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesSkusList]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesSkusListMutableBuilder[Self <: ParamsResourceServicesSkusList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
