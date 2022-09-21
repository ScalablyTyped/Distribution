package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlogList extends StObject {
  
  /**
    * Admin level list of blog per-user information.
    */
  var blogUserInfos: js.UndefOr[js.Array[SchemaBlogUserInfo]] = js.undefined
  
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[SchemaBlog]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#blogList.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlogList {
  
  inline def apply(): SchemaBlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogList]
  }
  
  extension [Self <: SchemaBlogList](x: Self) {
    
    inline def setBlogUserInfos(value: js.Array[SchemaBlogUserInfo]): Self = StObject.set(x, "blogUserInfos", value.asInstanceOf[js.Any])
    
    inline def setBlogUserInfosUndefined: Self = StObject.set(x, "blogUserInfos", js.undefined)
    
    inline def setBlogUserInfosVarargs(value: SchemaBlogUserInfo*): Self = StObject.set(x, "blogUserInfos", js.Array(value*))
    
    inline def setItems(value: js.Array[SchemaBlog]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaBlog*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
