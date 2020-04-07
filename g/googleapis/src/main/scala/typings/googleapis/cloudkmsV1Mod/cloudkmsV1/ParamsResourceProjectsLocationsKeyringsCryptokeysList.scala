package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsKeyringsCryptokeysList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional limit on the number of CryptoKeys to include in the response.
    * Further CryptoKeys can subsequently be obtained by including the
    * ListCryptoKeysResponse.next_page_token in a subsequent request.  If
    * unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token, returned earlier via
    * ListCryptoKeysResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the KeyRing to list, in the format
    * `projects/x/locations/x/keyRings/x`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The fields of the primary version to include in the response.
    */
  var versionView: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsKeyringsCryptokeysList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    versionView: String = null
  ): ParamsResourceProjectsLocationsKeyringsCryptokeysList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (versionView != null) __obj.updateDynamic("versionView")(versionView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysList]
  }
}

