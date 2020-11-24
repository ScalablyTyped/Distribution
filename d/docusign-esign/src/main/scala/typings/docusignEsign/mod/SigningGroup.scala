package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningGroup extends js.Object {
  
  /**
    * The UTC DateTime when the signing group was created. Read only.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The name of the user who created the signing group.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The email address for the signing group. You can use a group email address to email all of the group members at the same time.
    */
  var groupEmail: js.UndefOr[String] = js.native
  
  /**
    * The name of the group. The search_text provided in the call automatically performs a wild card search on group_name.
    */
  var groupName: js.UndefOr[String] = js.native
  
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
  var groupType: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the signing group was last modified. Read only.
    */
  var modified: js.UndefOr[String] = js.native
  
  /**
    * The user id (GUID) of the user who last modified this user record.
    */
  var modifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Optional. The ID of the [signing group](https://support.docusign.com/en/guides/ndse-user-guide-signing-groups).
    *
    * **Note**: When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature.
    * For this reason, we recommend that you do not include non-signer recipients (such as carbon copy recipients) in the same signing group as signer recipients.
    * However, you could create a second signing group for the non-signer recipients and change the default action of Needs to Sign to a different value, such as Receives a Copy.
    */
  var signingGroupId: js.UndefOr[String] = js.native
  
  /**
    * User management information.
    */
  var users: js.UndefOr[js.Array[SigningGroupUser]] = js.native
}
object SigningGroup {
  
  @scala.inline
  def apply(): SigningGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningGroup]
  }
  
  @scala.inline
  implicit class SigningGroupOps[Self <: SigningGroup] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setGroupEmail(value: String): Self = this.set("groupEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupEmail: Self = this.set("groupEmail", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedBy: Self = this.set("modifiedBy", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = this.set("signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupId: Self = this.set("signingGroupId", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SigningGroupUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[SigningGroupUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
