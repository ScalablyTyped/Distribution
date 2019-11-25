package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlChannel extends js.Object {
  /** Unique identifier of this URL channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#urlChannel. */
  var kind: js.UndefOr[String] = js.undefined
  /** URL Pattern of this URL channel. Does not include "http://" or "https://". Example: www.example.com/home */
  var urlPattern: js.UndefOr[String] = js.undefined
}

object UrlChannel {
  @scala.inline
  def apply(id: String = null, kind: String = null, urlPattern: String = null): UrlChannel = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (urlPattern != null) __obj.updateDynamic("urlPattern")(urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlChannel]
  }
}

