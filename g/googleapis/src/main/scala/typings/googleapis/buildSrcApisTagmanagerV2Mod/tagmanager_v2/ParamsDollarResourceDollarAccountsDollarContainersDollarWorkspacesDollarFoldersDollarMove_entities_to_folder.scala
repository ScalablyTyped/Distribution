package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * GTM Folder's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Folder] = js.native
  /**
    * The tags to be moved to the folder.
    */
  var tagId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The triggers to be moved to the folder.
    */
  var triggerId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The variables to be moved to the folder.
    */
  var variableId: js.UndefOr[js.Array[String]] = js.native
}

object ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    path: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Folder = null,
    tagId: js.Array[String] = null,
    triggerId: js.Array[String] = null,
    userIp: String = null,
    variableId: js.Array[String] = null
  ): ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (tagId != null) __obj.updateDynamic("tagId")(tagId.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (variableId != null) __obj.updateDynamic("variableId")(variableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder]
  }
}

