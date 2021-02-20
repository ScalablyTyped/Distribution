package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceUser extends StObject {
  
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
  implicit class WorkspaceUserMutableBuilder[Self <: WorkspaceUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setActiveSince(value: String): Self = StObject.set(x, "activeSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSinceUndefined: Self = StObject.set(x, "activeSince", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIdUndefined: Self = StObject.set(x, "createdById", js.undefined)
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setInvitationEmailBlurb(value: String): Self = StObject.set(x, "invitationEmailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationEmailBlurbUndefined: Self = StObject.set(x, "invitationEmailBlurb", js.undefined)
    
    @scala.inline
    def setInvitationEmailSubject(value: String): Self = StObject.set(x, "invitationEmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationEmailSubjectUndefined: Self = StObject.set(x, "invitationEmailSubject", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByIdUndefined: Self = StObject.set(x, "lastModifiedById", js.undefined)
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceUserBaseUrl(value: String): Self = StObject.set(x, "workspaceUserBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUserBaseUrlUndefined: Self = StObject.set(x, "workspaceUserBaseUrl", js.undefined)
    
    @scala.inline
    def setWorkspaceUserId(value: String): Self = StObject.set(x, "workspaceUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUserIdUndefined: Self = StObject.set(x, "workspaceUserId", js.undefined)
    
    @scala.inline
    def setWorkspaceUserUri(value: String): Self = StObject.set(x, "workspaceUserUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUserUriUndefined: Self = StObject.set(x, "workspaceUserUri", js.undefined)
  }
}
