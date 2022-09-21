package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse extends StObject {
  
  /**
    * Client states meeting the list restrictions.
    */
  var clientStates: js.UndefOr[js.Array[SchemaGoogleAppsCloudidentityDevicesV1ClientState]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. Empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1ListClientStatesResponse](x: Self) {
    
    inline def setClientStates(value: js.Array[SchemaGoogleAppsCloudidentityDevicesV1ClientState]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    inline def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    inline def setClientStatesVarargs(value: SchemaGoogleAppsCloudidentityDevicesV1ClientState*): Self = StObject.set(x, "clientStates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
