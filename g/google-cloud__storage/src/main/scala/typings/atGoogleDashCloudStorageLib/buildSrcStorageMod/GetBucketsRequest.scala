package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketsRequest extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var maxApiCalls: js.UndefOr[scala.Double] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var project: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetBucketsRequest {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    maxApiCalls: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    project: java.lang.String = null,
    userProject: java.lang.String = null
  ): GetBucketsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (project != null) __obj.updateDynamic("project")(project)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetBucketsRequest]
  }
}

