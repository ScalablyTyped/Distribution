package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The audiences in this result. */
  var items: js.UndefOr[js.Array[Audience]] = js.undefined
  /** Identifies this resource as a collection of audiences. Value: "plus#audienceFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of ACL entries. The number of entries in this response may be smaller due to paging. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

