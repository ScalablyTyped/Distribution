package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SavedReports extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The saved reports returned in this list response. */
  var items: js.UndefOr[js.Array[SavedReport]] = js.undefined
  /** Kind of list this is, in this case adsense#savedReports. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token used to page through saved reports. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

