package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1DeviceUser extends StObject {
  
  /**
    * Compromised State of the DeviceUser object
    */
  var compromisedState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the user first signed in to the device
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Most recent time when user registered with this service.
    */
  var firstSyncTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Default locale used on device, in IETF BCP-47 format.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Last time when user synced with policies.
    */
  var lastSyncTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Management state of the user on the device.
    */
  var managementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the DeviceUser in format: `devices/{device\}/deviceUsers/{device_user\}`, where `device_user` uniquely identifies a user's use of a device.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Password state of the DeviceUser object
    */
  var passwordState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. User agent on the device for this specific user
    */
  var userAgent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address of the user registered on the device.
    */
  var userEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1DeviceUser {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1DeviceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1DeviceUser](x: Self) {
    
    inline def setCompromisedState(value: String): Self = StObject.set(x, "compromisedState", value.asInstanceOf[js.Any])
    
    inline def setCompromisedStateNull: Self = StObject.set(x, "compromisedState", null)
    
    inline def setCompromisedStateUndefined: Self = StObject.set(x, "compromisedState", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFirstSyncTime(value: String): Self = StObject.set(x, "firstSyncTime", value.asInstanceOf[js.Any])
    
    inline def setFirstSyncTimeNull: Self = StObject.set(x, "firstSyncTime", null)
    
    inline def setFirstSyncTimeUndefined: Self = StObject.set(x, "firstSyncTime", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeNull: Self = StObject.set(x, "lastSyncTime", null)
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
    
    inline def setManagementState(value: String): Self = StObject.set(x, "managementState", value.asInstanceOf[js.Any])
    
    inline def setManagementStateNull: Self = StObject.set(x, "managementState", null)
    
    inline def setManagementStateUndefined: Self = StObject.set(x, "managementState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPasswordState(value: String): Self = StObject.set(x, "passwordState", value.asInstanceOf[js.Any])
    
    inline def setPasswordStateNull: Self = StObject.set(x, "passwordState", null)
    
    inline def setPasswordStateUndefined: Self = StObject.set(x, "passwordState", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
