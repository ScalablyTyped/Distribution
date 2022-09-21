package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CustomerRepricingConfig extends StObject {
  
  /**
    * Output only. Resource name of the CustomerRepricingConfig. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The configuration for bill modifications made by a reseller before sending it to customers.
    */
  var repricingConfig: js.UndefOr[SchemaGoogleCloudChannelV1RepricingConfig] = js.undefined
  
  /**
    * Output only. Timestamp of an update to the repricing rule. If `update_time` is after RepricingConfig.effective_invoice_month then it indicates this was set mid-month.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CustomerRepricingConfig {
  
  inline def apply(): SchemaGoogleCloudChannelV1CustomerRepricingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CustomerRepricingConfig](x: Self) {
    
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
