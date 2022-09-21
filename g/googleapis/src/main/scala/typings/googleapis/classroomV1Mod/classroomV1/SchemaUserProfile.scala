package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserProfile extends StObject {
  
  /**
    * Email address of the user. Read-only.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier of the user. Read-only.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the user. Read-only.
    */
  var name: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * Global permissions of the user. Read-only.
    */
  var permissions: js.UndefOr[js.Array[SchemaGlobalPermission]] = js.undefined
  
  /**
    * URL of user's profile photo. Read-only.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents whether a G Suite for Education user's domain administrator has explicitly verified them as being a teacher. If the user is not a member of a G Suite for Education domain, than this field is always false. Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaUserProfile {
  
  inline def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  
  extension [Self <: SchemaUserProfile](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaGlobalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaGlobalPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setVerifiedTeacher(value: Boolean): Self = StObject.set(x, "verifiedTeacher", value.asInstanceOf[js.Any])
    
    inline def setVerifiedTeacherNull: Self = StObject.set(x, "verifiedTeacher", null)
    
    inline def setVerifiedTeacherUndefined: Self = StObject.set(x, "verifiedTeacher", js.undefined)
  }
}
