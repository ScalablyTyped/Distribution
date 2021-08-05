package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostUserInfosList extends StObject {
  
  /**
    * The list of Posts with User information for the post, for this Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPostUserInfo]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#postList
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaPostUserInfosList {
  
  inline def apply(): SchemaPostUserInfosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostUserInfosList]
  }
  
  extension [Self <: SchemaPostUserInfosList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaPostUserInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPostUserInfo*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
