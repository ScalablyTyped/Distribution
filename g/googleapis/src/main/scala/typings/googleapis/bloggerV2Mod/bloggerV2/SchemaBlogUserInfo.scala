package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlogUserInfo extends StObject {
  
  /**
    * The Blog resource.
    */
  var blog: js.UndefOr[SchemaBlog] = js.undefined
  
  /**
    * Information about a User for the Blog.
    */
  var blog_user_info: js.UndefOr[SchemaBlogPerUserInfo] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#blogUserInfo.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlogUserInfo {
  
  inline def apply(): SchemaBlogUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogUserInfo]
  }
  
  extension [Self <: SchemaBlogUserInfo](x: Self) {
    
    inline def setBlog(value: SchemaBlog): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setBlog_user_info(value: SchemaBlogPerUserInfo): Self = StObject.set(x, "blog_user_info", value.asInstanceOf[js.Any])
    
    inline def setBlog_user_infoUndefined: Self = StObject.set(x, "blog_user_info", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
