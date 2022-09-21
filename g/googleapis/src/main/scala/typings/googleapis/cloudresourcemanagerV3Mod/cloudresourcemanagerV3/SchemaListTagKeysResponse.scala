package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTagKeysResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to `ListTagKeys` that indicates from where listing should continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of TagKeys that live under the specified parent in the request.
    */
  var tagKeys: js.UndefOr[js.Array[SchemaTagKey]] = js.undefined
}
object SchemaListTagKeysResponse {
  
  inline def apply(): SchemaListTagKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagKeysResponse]
  }
  
  extension [Self <: SchemaListTagKeysResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTagKeys(value: js.Array[SchemaTagKey]): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "tagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: SchemaTagKey*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
