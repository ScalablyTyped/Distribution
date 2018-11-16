package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActivityFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this collection of activities. Deprecated. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The activities in this page of results. */
  var items: js.UndefOr[js.Array[Activity]] = js.undefined
  /** Identifies this resource as a collection of activities. Value: "plus#activityFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to the next page of activities. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Link to this activity resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this collection of activities, which is a truncated portion of the content. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this collection of activities was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

