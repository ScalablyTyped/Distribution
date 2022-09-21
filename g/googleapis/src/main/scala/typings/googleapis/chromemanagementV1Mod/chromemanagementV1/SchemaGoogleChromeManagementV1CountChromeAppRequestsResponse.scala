package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse extends StObject {
  
  /**
    * Token to specify the next page in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of requested apps matching request.
    */
  var requestedApps: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1ChromeAppRequest]] = js.undefined
  
  /**
    * Total number of matching app requests.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CountChromeAppRequestsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRequestedApps(value: js.Array[SchemaGoogleChromeManagementV1ChromeAppRequest]): Self = StObject.set(x, "requestedApps", value.asInstanceOf[js.Any])
    
    inline def setRequestedAppsUndefined: Self = StObject.set(x, "requestedApps", js.undefined)
    
    inline def setRequestedAppsVarargs(value: SchemaGoogleChromeManagementV1ChromeAppRequest*): Self = StObject.set(x, "requestedApps", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
