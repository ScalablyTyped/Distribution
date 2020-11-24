package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspaces extends js.Object {
  
  /**
    * The id of the account to bill.
    */
  var billableAccountId: js.UndefOr[String] = js.native
  
  var callerInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The UTC DateTime when the workspace user authorization was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who created the workspace.
    */
  var createdByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The UTC date and time that the comment was last updated.
    *
    * **Note**: This can only be done by the creator.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who last modified the workspace.
    */
  var lastModifiedByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * Information about the settings for the workspace.
    */
  var settings: js.UndefOr[
    /* This object provides information about the settings for the workspace. */ WorkspaceSettings
  ] = js.native
  
  /**
    * The status of the workspace. Valid values are:
    *
    * - `active`
    * - `closed`
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The relative URL for accessing the workspace.
    */
  var workspaceBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * Text describing the purpose of the workspace.
    */
  var workspaceDescription: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
  
  /**
    * The name of the workspace.
    */
  var workspaceName: js.UndefOr[String] = js.native
  
  /**
    * The relative URI for accessing the workspace.
    */
  var workspaceUri: js.UndefOr[String] = js.native
}
object Workspaces {
  
  @scala.inline
  def apply(): Workspaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspaces]
  }
  
  @scala.inline
  implicit class WorkspacesOps[Self <: Workspaces] (val x: Self) extends AnyVal {
    
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
    def setBillableAccountId(value: String): Self = this.set("billableAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillableAccountId: Self = this.set("billableAccountId", js.undefined)
    
    @scala.inline
    def setCallerInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("callerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerInformation: Self = this.set("callerInformation", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("createdByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByInformation: Self = this.set("createdByInformation", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedByInformation: Self = this.set("lastModifiedByInformation", js.undefined)
    
    @scala.inline
    def setSettings(
      value: /* This object provides information about the settings for the workspace. */ WorkspaceSettings
    ): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWorkspaceBaseUrl(value: String): Self = this.set("workspaceBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceBaseUrl: Self = this.set("workspaceBaseUrl", js.undefined)
    
    @scala.inline
    def setWorkspaceDescription(value: String): Self = this.set("workspaceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceDescription: Self = this.set("workspaceDescription", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceName(value: String): Self = this.set("workspaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceName: Self = this.set("workspaceName", js.undefined)
    
    @scala.inline
    def setWorkspaceUri(value: String): Self = this.set("workspaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceUri: Self = this.set("workspaceUri", js.undefined)
  }
}
