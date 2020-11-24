package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostUserInfo extends js.Object {
  
  /**
    * The kind of this entity. Always blogger#postUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The Post resource.
    */
  var post: js.UndefOr[SchemaPost] = js.native
  
  /**
    * Information about a User for the Post.
    */
  var post_user_info: js.UndefOr[SchemaPostPerUserInfo] = js.native
}
object SchemaPostUserInfo {
  
  @scala.inline
  def apply(): SchemaPostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostUserInfo]
  }
  
  @scala.inline
  implicit class SchemaPostUserInfoOps[Self <: SchemaPostUserInfo] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPost(value: SchemaPost): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPost_user_info(value: SchemaPostPerUserInfo): Self = this.set("post_user_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost_user_info: Self = this.set("post_user_info", js.undefined)
  }
}
