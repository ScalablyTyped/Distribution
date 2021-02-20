package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBlogPerUserInfo extends StObject {
  
  /**
    * ID of the Blog resource
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * True if the user has Admin level access to the blog.
    */
  var hasAdminAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * The kind of this entity. Always blogger#blogPerUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The Photo Album Key for the user when adding photos to the blog
    */
  var photosAlbumKey: js.UndefOr[String] = js.native
  
  /**
    * Access permissions that the user has for the blog (ADMIN, AUTHOR, or
    * READER).
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * ID of the User
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaBlogPerUserInfo {
  
  @scala.inline
  def apply(): SchemaBlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogPerUserInfo]
  }
  
  @scala.inline
  implicit class SchemaBlogPerUserInfoMutableBuilder[Self <: SchemaBlogPerUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setHasAdminAccess(value: Boolean): Self = StObject.set(x, "hasAdminAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAdminAccessUndefined: Self = StObject.set(x, "hasAdminAccess", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPhotosAlbumKey(value: String): Self = StObject.set(x, "photosAlbumKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosAlbumKeyUndefined: Self = StObject.set(x, "photosAlbumKey", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
