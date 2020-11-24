package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceUser extends js.Object {
  
  /**
    * The account ID associated with the workspace user.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the user joined the workspace.
    */
  var activeSince: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the workspace user was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who created this workspace user.
    */
  var createdById: js.UndefOr[String] = js.native
  
  /**
    * The workspace user's email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The text of the workspace invitation email message sent to the user.
    */
  var invitationEmailBlurb: js.UndefOr[String] = js.native
  
  /**
    * The subject line of the workspace invitation email message sent to the user.
    */
  var invitationEmailSubject: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime that the workspace user was last modified.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who last modified the workspace user.
    */
  var lastModifiedById: js.UndefOr[String] = js.native
  
  /**
    * Filters the results by user status.
    * You can specify a comma-separated
    * list of the following statuses:
    *
    * * ActivationRequired
    * * ActivationSent
    * * Active
    * * Closed
    * * Disabled
    */
  var status: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace user.
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * The name of workspace user.
    */
  var userName: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
  
  /**
    * The URL for accessing the workspace user.
    */
  var workspaceUserBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace user.
    */
  var workspaceUserId: js.UndefOr[String] = js.native
  
  /**
    * The URI for accessing the workspace user.
    */
  var workspaceUserUri: js.UndefOr[String] = js.native
}
object WorkspaceUser {
  
  @scala.inline
  def apply(): WorkspaceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceUser]
  }
  
  @scala.inline
  implicit class WorkspaceUserOps[Self <: WorkspaceUser] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setActiveSince(value: String): Self = this.set("activeSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSince: Self = this.set("activeSince", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedById(value: String): Self = this.set("createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedById: Self = this.set("createdById", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setInvitationEmailBlurb(value: String): Self = this.set("invitationEmailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationEmailBlurb: Self = this.set("invitationEmailBlurb", js.undefined)
    
    @scala.inline
    def setInvitationEmailSubject(value: String): Self = this.set("invitationEmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationEmailSubject: Self = this.set("invitationEmailSubject", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLastModifiedById(value: String): Self = this.set("lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedById: Self = this.set("lastModifiedById", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceUserBaseUrl(value: String): Self = this.set("workspaceUserBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUserBaseUrl: Self = this.set("workspaceUserBaseUrl", js.undefined)
    
    @scala.inline
    def setWorkspaceUserId(value: String): Self = this.set("workspaceUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUserId: Self = this.set("workspaceUserId", js.undefined)
    
    @scala.inline
    def setWorkspaceUserUri(value: String): Self = this.set("workspaceUserUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUserUri: Self = this.set("workspaceUserUri", js.undefined)
  }
}
