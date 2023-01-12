package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspaces extends StObject {
  
  /**
    * The id of the account to bill.
    */
  var billableAccountId: js.UndefOr[String] = js.undefined
  
  var callerInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
  
  /**
    * The UTC DateTime when the workspace user authorization was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user who created the workspace.
    */
  var createdByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
  
  /**
    * The UTC date and time that the comment was last updated.
    *
    * **Note**: This can only be done by the creator.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user who last modified the workspace.
    */
  var lastModifiedByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
  
  /**
    * Information about the settings for the workspace.
    */
  var settings: js.UndefOr[
    /* This object provides information about the settings for the workspace. */ WorkspaceSettings
  ] = js.undefined
  
  /**
    * The status of the workspace. Valid values are:
    *
    * - `active`
    * - `closed`
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The relative URL for accessing the workspace.
    */
  var workspaceBaseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Text describing the purpose of the workspace.
    */
  var workspaceDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workspace.
    */
  var workspaceName: js.UndefOr[String] = js.undefined
  
  /**
    * The relative URI for accessing the workspace.
    */
  var workspaceUri: js.UndefOr[String] = js.undefined
}
object Workspaces {
  
  inline def apply(): Workspaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workspaces] (val x: Self) extends AnyVal {
    
    inline def setBillableAccountId(value: String): Self = StObject.set(x, "billableAccountId", value.asInstanceOf[js.Any])
    
    inline def setBillableAccountIdUndefined: Self = StObject.set(x, "billableAccountId", js.undefined)
    
    inline def setCallerInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "callerInformation", value.asInstanceOf[js.Any])
    
    inline def setCallerInformationUndefined: Self = StObject.set(x, "callerInformation", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "createdByInformation", value.asInstanceOf[js.Any])
    
    inline def setCreatedByInformationUndefined: Self = StObject.set(x, "createdByInformation", js.undefined)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByInformationUndefined: Self = StObject.set(x, "lastModifiedByInformation", js.undefined)
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setSettings(
      value: /* This object provides information about the settings for the workspace. */ WorkspaceSettings
    ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWorkspaceBaseUrl(value: String): Self = StObject.set(x, "workspaceBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceBaseUrlUndefined: Self = StObject.set(x, "workspaceBaseUrl", js.undefined)
    
    inline def setWorkspaceDescription(value: String): Self = StObject.set(x, "workspaceDescription", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDescriptionUndefined: Self = StObject.set(x, "workspaceDescription", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    inline def setWorkspaceName(value: String): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    
    inline def setWorkspaceUri(value: String): Self = StObject.set(x, "workspaceUri", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUriUndefined: Self = StObject.set(x, "workspaceUri", js.undefined)
  }
}
