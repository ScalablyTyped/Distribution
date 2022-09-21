package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1ListDevicesResponse extends StObject {
  
  /**
    * Devices meeting the list restrictions.
    */
  var devices: js.UndefOr[js.Array[SchemaGoogleAppsCloudidentityDevicesV1Device]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. Empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1ListDevicesResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1ListDevicesResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaGoogleAppsCloudidentityDevicesV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaGoogleAppsCloudidentityDevicesV1Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
