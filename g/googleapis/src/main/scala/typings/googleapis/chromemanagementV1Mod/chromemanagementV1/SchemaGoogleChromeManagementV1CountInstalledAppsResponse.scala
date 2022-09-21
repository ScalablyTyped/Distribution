package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CountInstalledAppsResponse extends StObject {
  
  /**
    * List of installed apps matching request.
    */
  var installedApps: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1InstalledApp]] = js.undefined
  
  /**
    * Token to specify the next page of the request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of installed apps matching request.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CountInstalledAppsResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1CountInstalledAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CountInstalledAppsResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CountInstalledAppsResponse](x: Self) {
    
    inline def setInstalledApps(value: js.Array[SchemaGoogleChromeManagementV1InstalledApp]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    inline def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    inline def setInstalledAppsVarargs(value: SchemaGoogleChromeManagementV1InstalledApp*): Self = StObject.set(x, "installedApps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
