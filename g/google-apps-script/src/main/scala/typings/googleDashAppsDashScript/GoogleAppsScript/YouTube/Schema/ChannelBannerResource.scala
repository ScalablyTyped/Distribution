package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBannerResource extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ChannelBannerResource {
  @scala.inline
  def apply(etag: String = null, kind: String = null, url: String = null): ChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ChannelBannerResource]
  }
}

