package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsDatabasesDocumentsCommitNamedParameters extends js.Object {
  @JSName("$Xgafv")
  var $Xgafv: js.UndefOr[ProjectsDatabasesDocumentsApiClient$Xgafv] = js.undefined
  var access_token: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[ProjectsDatabasesDocumentsApiClientAlt] = js.undefined
  var bearer_token: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var oauth_token: js.UndefOr[String] = js.undefined
  var pp: js.UndefOr[Boolean] = js.undefined
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  var quotaUser: js.UndefOr[String] = js.undefined
  var uploadType: js.UndefOr[String] = js.undefined
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object ProjectsDatabasesDocumentsCommitNamedParameters {
  @scala.inline
  def apply(
    $Xgafv: ProjectsDatabasesDocumentsApiClient$Xgafv = null,
    access_token: String = null,
    alt: ProjectsDatabasesDocumentsApiClientAlt = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ProjectsDatabasesDocumentsCommitNamedParameters = {
    val __obj = js.Dynamic.literal()
    if ($Xgafv != null) __obj.updateDynamic("$Xgafv")($Xgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDatabasesDocumentsCommitNamedParameters]
  }
}

