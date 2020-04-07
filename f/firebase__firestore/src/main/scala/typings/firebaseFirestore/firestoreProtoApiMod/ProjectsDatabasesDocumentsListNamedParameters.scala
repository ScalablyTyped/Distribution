package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsDatabasesDocumentsListNamedParameters extends js.Object {
  @JSName("$Xgafv")
  var $Xgafv: js.UndefOr[ProjectsDatabasesDocumentsApiClientXgafv] = js.undefined
  var access_token: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[ProjectsDatabasesDocumentsApiClientAlt] = js.undefined
  var bearer_token: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var maskFieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  var oauth_token: js.UndefOr[String] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var pp: js.UndefOr[Boolean] = js.undefined
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  var quotaUser: js.UndefOr[String] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var showMissing: js.UndefOr[Boolean] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
  var uploadType: js.UndefOr[String] = js.undefined
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object ProjectsDatabasesDocumentsListNamedParameters {
  @scala.inline
  def apply(
    $Xgafv: ProjectsDatabasesDocumentsApiClientXgafv = null,
    access_token: String = null,
    alt: ProjectsDatabasesDocumentsApiClientAlt = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    maskFieldPaths: js.Array[String] = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    readTime: String = null,
    showMissing: js.UndefOr[Boolean] = js.undefined,
    transaction: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ProjectsDatabasesDocumentsListNamedParameters = {
    val __obj = js.Dynamic.literal()
    if ($Xgafv != null) __obj.updateDynamic("$Xgafv")($Xgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maskFieldPaths != null) __obj.updateDynamic("maskFieldPaths")(maskFieldPaths.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showMissing)) __obj.updateDynamic("showMissing")(showMissing.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDatabasesDocumentsListNamedParameters]
  }
}

