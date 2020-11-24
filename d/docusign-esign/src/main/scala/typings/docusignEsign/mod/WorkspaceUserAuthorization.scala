package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceUserAuthorization extends js.Object {
  
  /**
    * When set to **true**, the workspace user can delete items from the workspace.
    */
  var canDelete: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the workspace user can move the items in the workspace.
    */
  var canMove: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the workspace user can create transactions from the workspace.
    */
  var canTransact: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the workspace user can view the items in the workspace.
    */
  var canView: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the workspace user authorization was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who created the workspace user authorization.
    */
  var createdById: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The UTC DateTime when the workspace user authorization was last modified.
    */
  var modified: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who last modified the workspace user authorization.
    */
  var modifiedById: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace user.
    */
  var workspaceUserId: js.UndefOr[String] = js.native
  
  /**
    * An object that provides details about the workspace user.
    */
  var workspaceUserInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
}
object WorkspaceUserAuthorization {
  
  @scala.inline
  def apply(): WorkspaceUserAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceUserAuthorization]
  }
  
  @scala.inline
  implicit class WorkspaceUserAuthorizationOps[Self <: WorkspaceUserAuthorization] (val x: Self) extends AnyVal {
    
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
    def setCanDelete(value: String): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDelete: Self = this.set("canDelete", js.undefined)
    
    @scala.inline
    def setCanMove(value: String): Self = this.set("canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMove: Self = this.set("canMove", js.undefined)
    
    @scala.inline
    def setCanTransact(value: String): Self = this.set("canTransact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTransact: Self = this.set("canTransact", js.undefined)
    
    @scala.inline
    def setCanView(value: String): Self = this.set("canView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanView: Self = this.set("canView", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedById(value: String): Self = this.set("createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedById: Self = this.set("createdById", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setModifiedById(value: String): Self = this.set("modifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedById: Self = this.set("modifiedById", js.undefined)
    
    @scala.inline
    def setWorkspaceUserId(value: String): Self = this.set("workspaceUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUserId: Self = this.set("workspaceUserId", js.undefined)
    
    @scala.inline
    def setWorkspaceUserInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("workspaceUserInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUserInformation: Self = this.set("workspaceUserInformation", js.undefined)
  }
}
