package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceUser extends StObject {
  
  /**
    * The account ID associated with the workspace user.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the user joined the workspace.
    */
  var activeSince: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the workspace user was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who created this workspace user.
    */
  var createdById: js.UndefOr[String] = js.undefined
  
  /**
    * The workspace user's email address.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The text of the workspace invitation email message sent to the user.
    */
  var invitationEmailBlurb: js.UndefOr[String] = js.undefined
  
  /**
    * The subject line of the workspace invitation email message sent to the user.
    */
  var invitationEmailSubject: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime that the workspace user was last modified.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who last modified the workspace user.
    */
  var lastModifiedById: js.UndefOr[String] = js.undefined
  
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
  var status: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace user.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of workspace user.
    */
  var userName: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL for accessing the workspace user.
    */
  var workspaceUserBaseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace user.
    */
  var workspaceUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for accessing the workspace user.
    */
  var workspaceUserUri: js.UndefOr[String] = js.undefined
}
object WorkspaceUser {
  
  inline def apply(): WorkspaceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceUser]
  }
  
  extension [Self <: WorkspaceUser](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setActiveSince(value: String): Self = StObject.set(x, "activeSince", value.asInstanceOf[js.Any])
    
    inline def setActiveSinceUndefined: Self = StObject.set(x, "activeSince", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIdUndefined: Self = StObject.set(x, "createdById", js.undefined)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setInvitationEmailBlurb(value: String): Self = StObject.set(x, "invitationEmailBlurb", value.asInstanceOf[js.Any])
    
    inline def setInvitationEmailBlurbUndefined: Self = StObject.set(x, "invitationEmailBlurb", js.undefined)
    
    inline def setInvitationEmailSubject(value: String): Self = StObject.set(x, "invitationEmailSubject", value.asInstanceOf[js.Any])
    
    inline def setInvitationEmailSubjectUndefined: Self = StObject.set(x, "invitationEmailSubject", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByIdUndefined: Self = StObject.set(x, "lastModifiedById", js.undefined)
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    inline def setWorkspaceUserBaseUrl(value: String): Self = StObject.set(x, "workspaceUserBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUserBaseUrlUndefined: Self = StObject.set(x, "workspaceUserBaseUrl", js.undefined)
    
    inline def setWorkspaceUserId(value: String): Self = StObject.set(x, "workspaceUserId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUserIdUndefined: Self = StObject.set(x, "workspaceUserId", js.undefined)
    
    inline def setWorkspaceUserUri(value: String): Self = StObject.set(x, "workspaceUserUri", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUserUriUndefined: Self = StObject.set(x, "workspaceUserUri", js.undefined)
  }
}
