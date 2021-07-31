package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The DocuSign group ID for the group.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * The group type. Possible values include:
    *
    * - `adminstrators`
    * - `everyone`
    * - `customGroup`
    * - `sharedSigningGroup`
    *
    * <!-- More? To do -->
    */
  var groupType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the permission profile associated with the group. Possible values include:
    *
    * - `2301416` (for the `DocuSign Viewer` profile)
    * - `2301415` (for the `DocuSign Sender` profile)
    * - `2301414` (for the `Account Administrator` profile)
    */
  var permissionProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the users in the group.
    */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
  
  /**
    * The total number of users in the group.
    */
  var usersCount: js.UndefOr[String] = js.undefined
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    @scala.inline
    def setPermissionProfileId(value: String): Self = StObject.set(x, "permissionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionProfileIdUndefined: Self = StObject.set(x, "permissionProfileId", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersCount(value: String): Self = StObject.set(x, "usersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersCountUndefined: Self = StObject.set(x, "usersCount", js.undefined)
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
