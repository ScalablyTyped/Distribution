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

object CircleFeed {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Circle] = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null,
    title: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): CircleFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleFeed]
  }
}

