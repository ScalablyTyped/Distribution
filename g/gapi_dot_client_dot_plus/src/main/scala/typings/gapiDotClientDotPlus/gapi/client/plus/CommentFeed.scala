package typings.gapiDotClientDotPlus.gapi.client.plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID of this collection of comments. */
  var id: js.UndefOr[String] = js.undefined
  /** The comments in this page of results. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Identifies this resource as a collection of comments. Value: "plus#commentFeed". */
  var kind: js.UndefOr[String] = js.undefined
  /** Link to the next page of activities. */
  var nextLink: js.UndefOr[String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The title of this collection of comments. */
  var title: js.UndefOr[String] = js.undefined
  /** The time at which this collection of comments was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.undefined
}

object CommentFeed {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    items: js.Array[Comment] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    title: String = null,
    updated: String = null
  ): CommentFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentFeed]
  }
}

