package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdSourcesResponse extends StObject {
  
  /**
    * The ad sources.
    */
  var adSources: js.UndefOr[js.Array[SchemaAdSource]] = js.undefined
  
  /**
    * Used to set the `page_token` in the `ListAdSourcesRequest` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAdSourcesResponse {
  
  inline def apply(): SchemaListAdSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdSourcesResponse]
  }
  
  extension [Self <: SchemaListAdSourcesResponse](x: Self) {
    
    inline def setAdSources(value: js.Array[SchemaAdSource]): Self = StObject.set(x, "adSources", value.asInstanceOf[js.Any])
    
    inline def setAdSourcesUndefined: Self = StObject.set(x, "adSources", js.undefined)
    
    inline def setAdSourcesVarargs(value: SchemaAdSource*): Self = StObject.set(x, "adSources", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
