package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHmacKeysOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var maxApiCalls: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  var showDeletedKeys: js.UndefOr[Boolean] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object GetHmacKeysOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    maxApiCalls: Int | Double = null,
    maxResults: Int | Double = null,
    pageToken: String = null,
    projectId: String = null,
    serviceAccountEmail: String = null,
    showDeletedKeys: js.UndefOr[Boolean] = js.undefined,
    userProject: String = null
  ): GetHmacKeysOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.asInstanceOf[js.Any])
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeletedKeys)) __obj.updateDynamic("showDeletedKeys")(showDeletedKeys.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHmacKeysOptions]
  }
}

