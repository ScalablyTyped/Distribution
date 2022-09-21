package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApiVersionsResponse extends StObject {
  
  /**
    * The versions from the specified publisher.
    */
  var apiVersions: js.UndefOr[js.Array[SchemaApiVersion]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApiVersionsResponse {
  
  inline def apply(): SchemaListApiVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApiVersionsResponse]
  }
  
  extension [Self <: SchemaListApiVersionsResponse](x: Self) {
    
    inline def setApiVersions(value: js.Array[SchemaApiVersion]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApiVersionsVarargs(value: SchemaApiVersion*): Self = StObject.set(x, "apiVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
