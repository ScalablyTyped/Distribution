package typings.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostPerUserInfo extends js.Object {
  
  /**
    * ID of the Blog that the post resource belongs to.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * True if the user has Author level access to the post.
    */
  var hasEditAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * The kind of this entity. Always blogger#postPerUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * ID of the Post resource.
    */
  var postId: js.UndefOr[String] = js.native
  
  /**
    * ID of the User.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaPostPerUserInfo {
  
  @scala.inline
  def apply(): SchemaPostPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostPerUserInfo]
  }
  
  @scala.inline
  implicit class SchemaPostPerUserInfoOps[Self <: SchemaPostPerUserInfo] (val x: Self) extends AnyVal {
    
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
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogId: Self = this.set("blogId", js.undefined)
    
    @scala.inline
    def setHasEditAccess(value: Boolean): Self = this.set("hasEditAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasEditAccess: Self = this.set("hasEditAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPostId(value: String): Self = this.set("postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostId: Self = this.set("postId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
