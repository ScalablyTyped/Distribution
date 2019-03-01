package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilesOptions extends GetFilesOptions {
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object DeleteFilesOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    directory: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    maxApiCalls: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    userProject: java.lang.String = null,
    versions: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[DeleteFilesOptions]
  }
}

