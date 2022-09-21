package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse extends StObject {
  
  /**
    * Devices meeting the list restrictions.
    */
  var deviceUsers: js.UndefOr[js.Array[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. Empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse](x: Self) {
    
    inline def setDeviceUsers(value: js.Array[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser]): Self = StObject.set(x, "deviceUsers", value.asInstanceOf[js.Any])
    
    inline def setDeviceUsersUndefined: Self = StObject.set(x, "deviceUsers", js.undefined)
    
    inline def setDeviceUsersVarargs(value: SchemaGoogleAppsCloudidentityDevicesV1DeviceUser*): Self = StObject.set(x, "deviceUsers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
