package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchAllOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[Boolean] = js.undefined
}

object WatchAllOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    maxResults: Int | Double = null,
    pageToken: String = null,
    prefix: String = null,
    projection: String = null,
    userProject: String = null,
    versions: js.UndefOr[Boolean] = js.undefined
  ): WatchAllOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchAllOptions]
  }
}

