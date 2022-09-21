package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig extends StObject {
  
  /**
    * Output only. Resource name of the ChannelPartnerRepricingConfig. Format: accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}/channelPartnerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The configuration for bill modifications made by a reseller before sending it to ChannelPartner.
    */
  var repricingConfig: js.UndefOr[SchemaGoogleCloudChannelV1RepricingConfig] = js.undefined
  
  /**
    * Output only. Timestamp of an update to the repricing rule. If `update_time` is after RepricingConfig.effective_invoice_month then it indicates this was set mid-month.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig {
  
  inline def apply(): SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ChannelPartnerRepricingConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepricingConfig(value: SchemaGoogleCloudChannelV1RepricingConfig): Self = StObject.set(x, "repricingConfig", value.asInstanceOf[js.Any])
    
    inline def setRepricingConfigUndefined: Self = StObject.set(x, "repricingConfig", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
