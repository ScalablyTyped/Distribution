package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a user.
  */
trait SchemaUser extends StObject {
  
  /**
    * A boolean which indicates whether the specified User was deleted. If
    * true, name, photo and permission_id will be omitted.
    */
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user is the authenticated user.
    */
  var isMe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The displayable name of the user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The permission ID associated with this user. Equivalent to the Drive
    * API&#39;s permission ID for this user, returned as part of the Drive
    * Permissions resource.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * The profile photo of the user. Not present if the user has no profile
    * photo.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.undefined
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserMutableBuilder[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
    
    @scala.inline
    def setIsMe(value: Boolean): Self = StObject.set(x, "isMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeUndefined: Self = StObject.set(x, "isMe", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setPhoto(value: SchemaPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
  }
}
