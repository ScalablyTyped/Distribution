package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global information for a user.
  */
@js.native
trait SchemaUserProfile extends StObject {
  
  /**
    * Email address of the user.  Read-only.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the user.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the user.  Read-only.
    */
  var name: js.UndefOr[SchemaName] = js.native
  
  /**
    * Global permissions of the user.  Read-only.
    */
  var permissions: js.UndefOr[js.Array[SchemaGlobalPermission]] = js.native
  
  /**
    * URL of user&#39;s profile photo.  Read-only.
    */
  var photoUrl: js.UndefOr[String] = js.native
  
  /**
    * Represents whether a G Suite for Education user&#39;s domain
    * administrator has explicitly verified them as being a teacher. If the
    * user is not a member of a G Suite for Education domain, than this field
    * will always be false.  Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.native
}
object SchemaUserProfile {
  
  @scala.inline
  def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  
  @scala.inline
  implicit class SchemaUserProfileMutableBuilder[Self <: SchemaUserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: SchemaName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaGlobalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaGlobalPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setVerifiedTeacher(value: Boolean): Self = StObject.set(x, "verifiedTeacher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedTeacherUndefined: Self = StObject.set(x, "verifiedTeacher", js.undefined)
  }
}
