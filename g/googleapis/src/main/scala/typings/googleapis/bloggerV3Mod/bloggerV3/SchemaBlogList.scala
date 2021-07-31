package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlogList extends StObject {
  
  /**
    * Admin level list of blog per-user information
    */
  var blogUserInfos: js.UndefOr[js.Array[SchemaBlogUserInfo]] = js.undefined
  
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[SchemaBlog]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#blogList
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBlogList {
  
  @scala.inline
  def apply(): SchemaBlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogList]
  }
  
  @scala.inline
  implicit class SchemaBlogListMutableBuilder[Self <: SchemaBlogList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogUserInfos(value: js.Array[SchemaBlogUserInfo]): Self = StObject.set(x, "blogUserInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUserInfosUndefined: Self = StObject.set(x, "blogUserInfos", js.undefined)
    
    @scala.inline
    def setBlogUserInfosVarargs(value: SchemaBlogUserInfo*): Self = StObject.set(x, "blogUserInfos", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaBlog]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBlog*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
