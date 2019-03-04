package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelConfig extends WatchAllOptions {
  var address: java.lang.String
}

object CreateChannelConfig {
  @scala.inline
  def apply(
    address: java.lang.String,
    delimiter: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    prefix: java.lang.String = null,
    projection: java.lang.String = null,
    userProject: java.lang.String = null,
    versions: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateChannelConfig = {
    val __obj = js.Dynamic.literal(address = address)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[CreateChannelConfig]
  }
}

