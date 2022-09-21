package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CountChromeVersionsResponse extends StObject {
  
  /**
    * List of all browser versions and their install counts.
    */
  var browserVersions: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1BrowserVersion]] = js.undefined
  
  /**
    * Token to specify the next page of the request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number browser versions matching request.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CountChromeVersionsResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1CountChromeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CountChromeVersionsResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CountChromeVersionsResponse](x: Self) {
    
    inline def setBrowserVersions(value: js.Array[SchemaGoogleChromeManagementV1BrowserVersion]): Self = StObject.set(x, "browserVersions", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionsUndefined: Self = StObject.set(x, "browserVersions", js.undefined)
    
    inline def setBrowserVersionsVarargs(value: SchemaGoogleChromeManagementV1BrowserVersion*): Self = StObject.set(x, "browserVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
