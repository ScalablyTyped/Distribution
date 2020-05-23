package typings.googleCloudStorage.bucketMod

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
    maxApiCalls: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prefix: String = null,
    userProject: String = null,
    versions: js.UndefOr[Boolean] = js.undefined
  ): DeleteFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxApiCalls)) __obj.updateDynamic("maxApiCalls")(maxApiCalls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilesOptions]
  }
}

