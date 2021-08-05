package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermissionProfiles extends StObject {
  
  /**
    * The username of the user who last modified the permission profile.
    */
  var modifiedByUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the permission profile was last modified.
    */
  var modifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the permission profile. Possible values include:
    *
    * - `2301416` (for the `DocuSign Viewer` profile)
    * - `2301415` (for the `DocuSign Sender` profile)
    * - `2301414` (for the `Account Administrator` profile)
    *
    * In addition, any custom permission profiles associated with your account will have an automatically generated `permissionProfileId`.
    */
  var permissionProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the account permission profile.
    *
    * Example: `Account Administrator`
    */
  var permissionProfileName: js.UndefOr[String] = js.undefined
  
  /**
    * This object specifies the permissions that are associated with the account permission profile.
    */
  var settings: js.UndefOr[
    /* This object defines account permissions for users who are associated with the account permission profile.  */ AccountRoleSettings
  ] = js.undefined
  
  /**
    * The total number of users in the group associated with the account permission profile.
    */
  var userCount: js.UndefOr[String] = js.undefined
  
  /**
    * A list of user objects containing information about the users who are associated with the account permission profile.
    */
  var users: js.UndefOr[js.Array[UserInformation]] = js.undefined
}
object AccountPermissionProfiles {
  
  inline def apply(): AccountPermissionProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionProfiles]
  }
  
  extension [Self <: AccountPermissionProfiles](x: Self) {
    
    inline def setModifiedByUsername(value: String): Self = StObject.set(x, "modifiedByUsername", value.asInstanceOf[js.Any])
    
    inline def setModifiedByUsernameUndefined: Self = StObject.set(x, "modifiedByUsername", js.undefined)
    
    inline def setModifiedDateTime(value: String): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setPermissionProfileId(value: String): Self = StObject.set(x, "permissionProfileId", value.asInstanceOf[js.Any])
    
    inline def setPermissionProfileIdUndefined: Self = StObject.set(x, "permissionProfileId", js.undefined)
    
    inline def setPermissionProfileName(value: String): Self = StObject.set(x, "permissionProfileName", value.asInstanceOf[js.Any])
    
    inline def setPermissionProfileNameUndefined: Self = StObject.set(x, "permissionProfileName", js.undefined)
    
    inline def setSettings(
      value: /* This object defines account permissions for users who are associated with the account permission profile.  */ AccountRoleSettings
    ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUserCount(value: String): Self = StObject.set(x, "userCount", value.asInstanceOf[js.Any])
    
    inline def setUserCountUndefined: Self = StObject.set(x, "userCount", js.undefined)
    
    inline def setUsers(value: js.Array[UserInformation]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: UserInformation*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
