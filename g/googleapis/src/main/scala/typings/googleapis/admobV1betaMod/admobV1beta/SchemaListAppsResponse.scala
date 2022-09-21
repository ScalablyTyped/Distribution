package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAppsResponse extends StObject {
  
  /**
    * The resulting apps for the requested account.
    */
  var apps: js.UndefOr[js.Array[SchemaApp]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more apps for the request; this value should be passed in a new `ListAppsRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAppsResponse {
  
  inline def apply(): SchemaListAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAppsResponse]
  }
  
  extension [Self <: SchemaListAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[SchemaApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: SchemaApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
