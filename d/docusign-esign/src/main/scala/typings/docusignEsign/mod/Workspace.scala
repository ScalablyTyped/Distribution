package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends StObject {
  
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
    * The status of the item.
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
object Workspace {
  
  @scala.inline
  def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  @scala.inline
  implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillableAccountId(value: String): Self = StObject.set(x, "billableAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillableAccountIdUndefined: Self = StObject.set(x, "billableAccountId", js.undefined)
    
    @scala.inline
    def setCallerInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "callerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerInformationUndefined: Self = StObject.set(x, "callerInformation", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "createdByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByInformationUndefined: Self = StObject.set(x, "createdByInformation", js.undefined)
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByInformationUndefined: Self = StObject.set(x, "lastModifiedByInformation", js.undefined)
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setSettings(
      value: /* This object provides information about the settings for the workspace. */ WorkspaceSettings
    ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWorkspaceBaseUrl(value: String): Self = StObject.set(x, "workspaceBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceBaseUrlUndefined: Self = StObject.set(x, "workspaceBaseUrl", js.undefined)
    
    @scala.inline
    def setWorkspaceDescription(value: String): Self = StObject.set(x, "workspaceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceDescriptionUndefined: Self = StObject.set(x, "workspaceDescription", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    @scala.inline
    def setWorkspaceName(value: String): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    
    @scala.inline
    def setWorkspaceUri(value: String): Self = StObject.set(x, "workspaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceUriUndefined: Self = StObject.set(x, "workspaceUri", js.undefined)
  }
}
