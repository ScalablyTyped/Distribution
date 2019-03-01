package typings
package gapiDotClientDotAcceleratedmobilepageurlLib.gapiNs.clientNs.acceleratedmobilepageurlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrl extends js.Object {
  /** The AMP URL pointing to the publisher's web server. */
  var ampUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to
    * the cached document in the Google AMP Cache.
    */
  var cdnAmpUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[java.lang.String] = js.undefined
}

object AmpUrl {
  @scala.inline
  def apply(
    ampUrl: java.lang.String = null,
    cdnAmpUrl: java.lang.String = null,
    originalUrl: java.lang.String = null
  ): AmpUrl = {
    val __obj = js.Dynamic.literal()
    if (ampUrl != null) __obj.updateDynamic("ampUrl")(ampUrl)
    if (cdnAmpUrl != null) __obj.updateDynamic("cdnAmpUrl")(cdnAmpUrl)
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl)
    __obj.asInstanceOf[AmpUrl]
  }
}

