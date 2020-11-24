package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBlogUserInfo extends js.Object {
  
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
  implicit class SchemaBlogUserInfoOps[Self <: SchemaBlogUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlog(value: SchemaBlog): Self = this.set("blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlog: Self = this.set("blog", js.undefined)
    
    @scala.inline
    def setBlog_user_info(value: SchemaBlogPerUserInfo): Self = this.set("blog_user_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlog_user_info: Self = this.set("blog_user_info", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
