package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFilesOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var maxApiCalls: js.UndefOr[scala.Double] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[scala.Boolean] = js.undefined
}

object GetFilesOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    directory: java.lang.String = null,
    maxApiCalls: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    userProject: java.lang.String = null,
    versions: js.UndefOr[scala.Boolean] = js.undefined
  ): GetFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[GetFilesOptions]
  }
}

