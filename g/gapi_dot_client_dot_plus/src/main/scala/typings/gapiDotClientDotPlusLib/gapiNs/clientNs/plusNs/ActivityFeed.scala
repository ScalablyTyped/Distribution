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

object ActivityFeed {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Array[Activity] = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null
  ): ActivityFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[ActivityFeed]
  }
}

