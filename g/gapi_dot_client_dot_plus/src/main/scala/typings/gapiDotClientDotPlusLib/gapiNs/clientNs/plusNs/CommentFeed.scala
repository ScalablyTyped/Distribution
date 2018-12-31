package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this collection of comments. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The comments in this page of results. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Identifies this resource as a collection of comments. Value: "plus#commentFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to the next page of activities. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this collection of comments. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this collection of comments was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

