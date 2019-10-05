package typings.gapiDotClientDotAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdClients extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ad clients returned in this list response. */
  var items: js.UndefOr[js.Array[AdClient]] = js.undefined
  /** Kind of list this is, in this case adsense#adClients. */
  var kind: js.UndefOr[String] = js.undefined
  /** Continuation token used to page through ad clients. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AdClients {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[AdClient] = null,
    kind: String = null,
    nextPageToken: String = null
  ): AdClients = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdClients]
  }
}

