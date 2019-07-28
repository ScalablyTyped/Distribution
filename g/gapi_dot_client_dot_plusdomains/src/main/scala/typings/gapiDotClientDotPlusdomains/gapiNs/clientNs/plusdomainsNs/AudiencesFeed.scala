package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The audiences in this result. */
  var items: js.UndefOr[js.Array[Audience]] = js.undefined
  /** Identifies this resource as a collection of audiences. Value: "plus#audienceFeed". */
  var kind: js.UndefOr[String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of ACL entries. The number of entries in this response may be smaller due to paging. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object AudiencesFeed {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Audience] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): AudiencesFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudiencesFeed]
  }
}

