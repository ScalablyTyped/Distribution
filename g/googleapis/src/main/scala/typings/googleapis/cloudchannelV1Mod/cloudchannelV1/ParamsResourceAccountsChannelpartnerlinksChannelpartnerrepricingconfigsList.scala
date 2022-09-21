package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A filter for [CloudChannelService.ListChannelPartnerRepricingConfigs] results (channel_partner_link only). You can use this filter when you support a BatchGet-like query. To use the filter, you must set `parent=accounts/{account_id\}/channelPartnerLinks/-`. Example: `channel_partner_link = accounts/account_id/channelPartnerLinks/c1` OR `channel_partner_link = accounts/account_id/channelPartnerLinks/c2`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of repricing configs to return. The service may return fewer than this value. If unspecified, returns a maximum of 50 rules. The maximum value is 100; values above 100 will be coerced to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A token identifying a page of results beyond the first page. Obtained through ListChannelPartnerRepricingConfigsResponse.next_page_token of the previous CloudChannelService.ListChannelPartnerRepricingConfigs call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the account's ChannelPartnerLink. Parent uses the format: accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}. Supports accounts/{account_id\}/channelPartnerLinks/- to retrieve configs for all channel partners.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsList {
  
  inline def apply(): ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsList]
  }
  
  extension [Self <: ParamsResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
