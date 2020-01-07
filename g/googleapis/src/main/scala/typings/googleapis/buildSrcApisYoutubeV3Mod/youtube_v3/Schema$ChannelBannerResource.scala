package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A channel banner returned as the response to a channel_banner.insert call.
  */
@js.native
trait Schema$ChannelBannerResource extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelBannerResource&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The URL of this banner image.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ChannelBannerResource {
  @scala.inline
  def apply(etag: String = null, kind: String = null, url: String = null): Schema$ChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelBannerResource]
  }
}

