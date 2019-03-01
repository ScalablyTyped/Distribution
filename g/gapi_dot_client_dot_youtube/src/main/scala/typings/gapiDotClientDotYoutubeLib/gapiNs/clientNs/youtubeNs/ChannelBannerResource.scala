package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBannerResource extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelBannerResource". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of this banner image. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelBannerResource {
  @scala.inline
  def apply(etag: java.lang.String = null, kind: java.lang.String = null, url: java.lang.String = null): ChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ChannelBannerResource]
  }
}

