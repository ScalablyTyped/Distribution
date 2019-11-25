package typings.gapiDotClientDotAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrl extends js.Object {
  /** The AMP URL pointing to the publisher's web server. */
  var ampUrl: js.UndefOr[String] = js.undefined
  /**
    * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to
    * the cached document in the Google AMP Cache.
    */
  var cdnAmpUrl: js.UndefOr[String] = js.undefined
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[String] = js.undefined
}

object AmpUrl {
  @scala.inline
  def apply(ampUrl: String = null, cdnAmpUrl: String = null, originalUrl: String = null): AmpUrl = {
    val __obj = js.Dynamic.literal()
    if (ampUrl != null) __obj.updateDynamic("ampUrl")(ampUrl.asInstanceOf[js.Any])
    if (cdnAmpUrl != null) __obj.updateDynamic("cdnAmpUrl")(cdnAmpUrl.asInstanceOf[js.Any])
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpUrl]
  }
}

