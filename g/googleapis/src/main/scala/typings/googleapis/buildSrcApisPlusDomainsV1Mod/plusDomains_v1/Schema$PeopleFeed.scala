package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PeopleFeed extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The people in this page of results. Each item includes the id,
    * displayName, image, and url for the person. To retrieve additional
    * profile data, see the people.get method.
    */
  var items: js.UndefOr[js.Array[Schema$Person]] = js.native
  /**
    * Identifies this resource as a collection of people. Value:
    * &quot;plus#peopleFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Link to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of this collection of people.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The total number of people available in this list. The number of people
    * in a response might be smaller due to paging. This might not be set for
    * all collections.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$PeopleFeed {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Person] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    title: String = null,
    totalItems: Int | Double = null
  ): Schema$PeopleFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PeopleFeed]
  }
}

