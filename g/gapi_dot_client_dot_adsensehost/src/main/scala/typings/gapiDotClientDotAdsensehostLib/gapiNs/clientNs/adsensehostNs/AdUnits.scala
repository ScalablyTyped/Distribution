package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdUnits extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ad units returned in this list response. */
  var items: js.UndefOr[js.Array[AdUnit]] = js.undefined
  /** Kind of list this is, in this case adsensehost#adUnits. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token used to page through ad units. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

