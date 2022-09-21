package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageList extends StObject {
  
  /**
    * Etag of the response.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPage]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#pageList.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaPageList {
  
  inline def apply(): SchemaPageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageList]
  }
  
  extension [Self <: SchemaPageList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaPage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPage*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
