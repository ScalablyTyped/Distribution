package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlogPerUserInfo extends StObject {
  
  /**
    * ID of the Blog resource.
    */
  var blogId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the user has Admin level access to the blog.
    */
  var hasAdminAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#blogPerUserInfo.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Photo Album Key for the user when adding photos to the blog.
    */
  var photosAlbumKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER).
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the User.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlogPerUserInfo {
  
  inline def apply(): SchemaBlogPerUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogPerUserInfo]
  }
  
  extension [Self <: SchemaBlogPerUserInfo](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdNull: Self = StObject.set(x, "blogId", null)
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setHasAdminAccess(value: Boolean): Self = StObject.set(x, "hasAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setHasAdminAccessNull: Self = StObject.set(x, "hasAdminAccess", null)
    
    inline def setHasAdminAccessUndefined: Self = StObject.set(x, "hasAdminAccess", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPhotosAlbumKey(value: String): Self = StObject.set(x, "photosAlbumKey", value.asInstanceOf[js.Any])
    
    inline def setPhotosAlbumKeyNull: Self = StObject.set(x, "photosAlbumKey", null)
    
    inline def setPhotosAlbumKeyUndefined: Self = StObject.set(x, "photosAlbumKey", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
