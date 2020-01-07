package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CircleFeed extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The circles in this page of results.
    */
  var items: js.UndefOr[js.Array[Schema$Circle]] = js.native
  /**
    * Identifies this resource as a collection of circles. Value:
    * &quot;plus#circleFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Link to the next page of circles.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Link to this page of circles.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of this list of resources.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The total number of circles. The number of circles in this response may
    * be smaller due to paging.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$CircleFeed {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Circle] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    title: String = null,
    totalItems: Int | Double = null
  ): Schema$CircleFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CircleFeed]
  }
}

