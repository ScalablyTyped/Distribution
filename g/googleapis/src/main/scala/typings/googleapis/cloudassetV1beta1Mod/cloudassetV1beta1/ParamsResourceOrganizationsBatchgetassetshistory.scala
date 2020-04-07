package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsBatchgetassetshistory extends StandardParameters {
  /**
    * A list of the full names of the assets. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more info.  The request becomes a no-op if the asset name list is
    * empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The content type.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Required. The relative name of the root asset. It can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id")", or a project number (such as
    * "projects/12345").
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.native
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsBatchgetassetshistory {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    assetNames: js.Array[String] = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    contentType: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    readTimeWindowDotendTime: String = null,
    readTimeWindowDotstartTime: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceOrganizationsBatchgetassetshistory = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (assetNames != null) __obj.updateDynamic("assetNames")(assetNames.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (readTimeWindowDotendTime != null) __obj.updateDynamic("readTimeWindow.endTime")(readTimeWindowDotendTime.asInstanceOf[js.Any])
    if (readTimeWindowDotstartTime != null) __obj.updateDynamic("readTimeWindow.startTime")(readTimeWindowDotstartTime.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceOrganizationsBatchgetassetshistory]
  }
}

