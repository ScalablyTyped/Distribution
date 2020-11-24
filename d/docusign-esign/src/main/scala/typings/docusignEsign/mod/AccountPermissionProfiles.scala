package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionProfiles extends js.Object {
  
  /**
    * The username of the user who last modified the permission profile.
    */
  var modifiedByUsername: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the permission profile was last modified.
    */
  var modifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The ID of the permission profile. Possible values include:
    *
    * - `2301416` (for the `DocuSign Viewer` profile)
    * - `2301415` (for the `DocuSign Sender` profile)
    * - `2301414` (for the `Account Administrator` profile)
    *
    * In addition, any custom permission profiles associated with your account will have an automatically generated `permissionProfileId`.
    */
  var permissionProfileId: js.UndefOr[String] = js.native
  
  /**
    * The name of the account permission profile.
    *
    * Example: `Account Administrator`
    */
  var permissionProfileName: js.UndefOr[String] = js.native
  
  /**
    * This object specifies the permissions that are associated with the account permission profile.
    */
  var settings: js.UndefOr[
    /* This object defines account permissions for users who are associated with the account permission profile.  */ AccountRoleSettings
  ] = js.native
  
  /**
    * The total number of users in the group associated with the account permission profile.
    */
  var userCount: js.UndefOr[String] = js.native
  
  /**
    * A list of user objects containing information about the users who are associated with the account permission profile.
    */
  var users: js.UndefOr[js.Array[UserInformation]] = js.native
}
object AccountPermissionProfiles {
  
  @scala.inline
  def apply(): AccountPermissionProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionProfiles]
  }
  
  @scala.inline
  implicit class AccountPermissionProfilesOps[Self <: AccountPermissionProfiles] (val x: Self) extends AnyVal {
    
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
    def setModifiedByUsername(value: String): Self = this.set("modifiedByUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByUsername: Self = this.set("modifiedByUsername", js.undefined)
    
    @scala.inline
    def setModifiedDateTime(value: String): Self = this.set("modifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDateTime: Self = this.set("modifiedDateTime", js.undefined)
    
    @scala.inline
    def setPermissionProfileId(value: String): Self = this.set("permissionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionProfileId: Self = this.set("permissionProfileId", js.undefined)
    
    @scala.inline
    def setPermissionProfileName(value: String): Self = this.set("permissionProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionProfileName: Self = this.set("permissionProfileName", js.undefined)
    
    @scala.inline
    def setSettings(
      value: /* This object defines account permissions for users who are associated with the account permission profile.  */ AccountRoleSettings
    ): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setUserCount(value: String): Self = this.set("userCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCount: Self = this.set("userCount", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInformation*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserInformation]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
