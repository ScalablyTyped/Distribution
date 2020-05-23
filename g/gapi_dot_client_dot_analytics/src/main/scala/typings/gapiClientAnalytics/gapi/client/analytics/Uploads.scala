package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uploads extends js.Object {
  /** A list of uploads. */
  var items: js.UndefOr[js.Array[Upload]] = js.undefined
  /**
    * The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Link to next page for this upload collection. */
  var nextLink: js.UndefOr[String] = js.undefined
  /** Link to previous page for this upload collection. */
  var previousLink: js.UndefOr[String] = js.undefined
  /** The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** The total number of results for the query, regardless of the number of resources in the result. */
  var totalResults: js.UndefOr[Double] = js.undefined
}

object Uploads {
  @scala.inline
  def apply(
    items: js.Array[Upload] = null,
    itemsPerPage: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    totalResults: js.UndefOr[Double] = js.undefined
  ): Uploads = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsPerPage)) __obj.updateDynamic("itemsPerPage")(itemsPerPage.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uploads]
  }
}

