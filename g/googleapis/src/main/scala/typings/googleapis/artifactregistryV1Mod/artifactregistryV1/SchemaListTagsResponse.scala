package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTagsResponse extends StObject {
  
  /**
    * The token to retrieve the next page of tags, or empty if there are no more tags to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tags returned.
    */
  var tags: js.UndefOr[js.Array[SchemaTag]] = js.undefined
}
object SchemaListTagsResponse {
  
  inline def apply(): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
  
  extension [Self <: SchemaListTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTags(value: js.Array[SchemaTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SchemaTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
