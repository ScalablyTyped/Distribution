package typings.gapiDotClientDotAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannels extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The custom channels returned in this list response. */
  var items: js.UndefOr[js.Array[CustomChannel]] = js.undefined
  /** Kind of list this is, in this case adsense#customChannels. */
  var kind: js.UndefOr[String] = js.undefined
  /** Continuation token used to page through custom channels. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CustomChannels {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[CustomChannel] = null,
    kind: String = null,
    nextPageToken: String = null
  ): CustomChannels = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CustomChannels]
  }
}

