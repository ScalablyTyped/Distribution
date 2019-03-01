package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchAllOptions extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var projection: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[scala.Boolean] = js.undefined
}

object WatchAllOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    projection: java.lang.String = null,
    userProject: java.lang.String = null,
    versions: js.UndefOr[scala.Boolean] = js.undefined
  ): WatchAllOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[WatchAllOptions]
  }
}

