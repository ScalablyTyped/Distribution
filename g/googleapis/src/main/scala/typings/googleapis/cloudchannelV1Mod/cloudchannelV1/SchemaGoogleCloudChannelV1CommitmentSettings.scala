package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CommitmentSettings extends StObject {
  
  /**
    * Output only. Commitment end timestamp.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Renewal settings applicable for a commitment-based Offer.
    */
  var renewalSettings: js.UndefOr[SchemaGoogleCloudChannelV1RenewalSettings] = js.undefined
  
  /**
    * Output only. Commitment start timestamp.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CommitmentSettings {
  
  inline def apply(): SchemaGoogleCloudChannelV1CommitmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CommitmentSettings]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CommitmentSettings](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRenewalSettings(value: SchemaGoogleCloudChannelV1RenewalSettings): Self = StObject.set(x, "renewalSettings", value.asInstanceOf[js.Any])
    
    inline def setRenewalSettingsUndefined: Self = StObject.set(x, "renewalSettings", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
