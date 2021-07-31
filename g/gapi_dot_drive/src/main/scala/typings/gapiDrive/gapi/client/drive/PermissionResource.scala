package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.anon.AdditionalRoles
import typings.gapiDrive.gapiDriveStrings.driveNumbersignpermission
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionResource extends StObject {
  
  var additionalRoles: js.Array[String]
  
  var authKey: String
  
  var deleted: Boolean
  
  var domain: String
  
  var emailAddress: String
  
  var etag: String
  
  var expirationDate: Date
  
  var id: String
  
  var kind: driveNumbersignpermission
  
  var name: String
  
  var photoLink: String
  
  var role: String
  
  var selfLink: String
  
  var teamDrivePermissionDetails: js.Array[AdditionalRoles]
  
  var `type`: String
  
  var value: String
  
  var withLink: Boolean
}
object PermissionResource {
  
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    authKey: String,
    deleted: Boolean,
    domain: String,
    emailAddress: String,
    etag: String,
    expirationDate: Date,
    id: String,
    name: String,
    photoLink: String,
    role: String,
    selfLink: String,
    teamDrivePermissionDetails: js.Array[AdditionalRoles],
    `type`: String,
    value: String,
    withLink: Boolean
  ): PermissionResource = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], authKey = authKey.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "drive#permission", name = name.asInstanceOf[js.Any], photoLink = photoLink.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], teamDrivePermissionDetails = teamDrivePermissionDetails.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], withLink = withLink.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResource]
  }
  
  @scala.inline
  implicit class PermissionResourceMutableBuilder[Self <: PermissionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: driveNumbersignpermission): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[AdditionalRoles]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: AdditionalRoles*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
  }
}
