package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelConfig extends WatchAllOptions {
  var address: String
}

object CreateChannelConfig {
  @scala.inline
  def apply(
    address: String,
    delimiter: String = null,
    maxResults: Int | Double = null,
    pageToken: String = null,
    prefix: String = null,
    projection: String = null,
    userProject: String = null,
    versions: js.UndefOr[Boolean] = js.undefined
  ): CreateChannelConfig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelConfig]
  }
}

