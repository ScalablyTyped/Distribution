package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBlogUserInfo extends StObject {
  
  /**
    * The Blog resource.
    */
  var blog: js.UndefOr[SchemaBlog] = js.native
  
  /**
    * Information about a User for the Blog.
    */
  var blog_user_info: js.UndefOr[SchemaBlogPerUserInfo] = js.native
  
  /**
    * The kind of this entity. Always blogger#blogUserInfo
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBlogUserInfo {
  
  @scala.inline
  def apply(): SchemaBlogUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogUserInfo]
  }
  
  @scala.inline
  implicit class SchemaBlogUserInfoMutableBuilder[Self <: SchemaBlogUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlog(value: SchemaBlog): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    @scala.inline
    def setBlog_user_info(value: SchemaBlogPerUserInfo): Self = StObject.set(x, "blog_user_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlog_user_infoUndefined: Self = StObject.set(x, "blog_user_info", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
