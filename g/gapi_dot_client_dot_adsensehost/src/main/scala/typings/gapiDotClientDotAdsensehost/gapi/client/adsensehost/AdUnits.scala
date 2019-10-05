package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnits extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ad units returned in this list response. */
  var items: js.UndefOr[js.Array[AdUnit]] = js.undefined
  /** Kind of list this is, in this case adsensehost#adUnits. */
  var kind: js.UndefOr[String] = js.undefined
  /** Continuation token used to page through ad units. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AdUnits {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[AdUnit] = null,
    kind: String = null,
    nextPageToken: String = null
  ): AdUnits = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdUnits]
  }
}

