package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostPerUserInfo extends StObject {
  
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
  implicit class SchemaPostPerUserInfoMutableBuilder[Self <: SchemaPostPerUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setHasEditAccess(value: Boolean): Self = StObject.set(x, "hasEditAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasEditAccessUndefined: Self = StObject.set(x, "hasEditAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
