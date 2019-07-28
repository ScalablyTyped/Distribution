package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilesOptions extends GetFilesOptions {
  var force: js.UndefOr[Boolean] = js.undefined
}

object DeleteFilesOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    directory: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    maxApiCalls: Int | Double = null,
    maxResults: Int | Double = null,
    pageToken: String = null,
    prefix: String = null,
    userProject: String = null,
    versions: js.UndefOr[Boolean] = js.undefined
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

