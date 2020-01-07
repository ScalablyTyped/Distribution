package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAccountsDollarContainersDollarMove_foldersDollarUpdate extends StandardParameters {
  /**
    * The GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The GTM Folder ID.
    */
  var folderId: js.UndefOr[String] = js.native
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

object ParamsDollarResourceDollarAccountsDollarContainersDollarMove_foldersDollarUpdate {
  @scala.inline
  def apply(
    accountId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    containerId: String = null,
    fields: String = null,
    folderId: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Folder = null,
    tagId: js.Array[String] = null,
    triggerId: js.Array[String] = null,
    userIp: String = null,
    variableId: js.Array[String] = null
  ): ParamsDollarResourceDollarAccountsDollarContainersDollarMove_foldersDollarUpdate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (folderId != null) __obj.updateDynamic("folderId")(folderId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (tagId != null) __obj.updateDynamic("tagId")(tagId.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (variableId != null) __obj.updateDynamic("variableId")(variableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarAccountsDollarContainersDollarMove_foldersDollarUpdate]
  }
}

