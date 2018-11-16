package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CircleFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The circles in this page of results. */
  var items: js.UndefOr[js.Array[Circle]] = js.undefined
  /** Identifies this resource as a collection of circles. Value: "plus#circleFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to the next page of circles. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Link to this page of circles. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this list of resources. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of circles. The number of circles in this response may be smaller due to paging. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

