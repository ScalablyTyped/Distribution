package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostList extends StObject {
  
  /**
    * Etag of the response.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The list of Posts for this Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPost]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#postList
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaPostList {
  
  inline def apply(): SchemaPostList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostList]
  }
  
  extension [Self <: SchemaPostList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaPost]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPost*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
