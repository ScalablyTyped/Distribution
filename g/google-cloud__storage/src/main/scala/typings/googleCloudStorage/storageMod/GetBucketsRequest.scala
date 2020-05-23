package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketsRequest extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var maxApiCalls: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object GetBucketsRequest {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    maxApiCalls: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prefix: String = null,
    project: String = null,
    userProject: String = null
  ): GetBucketsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxApiCalls)) __obj.updateDynamic("maxApiCalls")(maxApiCalls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketsRequest]
  }
}

