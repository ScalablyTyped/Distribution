package typings.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlHistory extends js.Object {
  /** A list of URL resources. */
  var items: js.UndefOr[js.Array[Url]] = js.undefined
  /** Number of items returned with each full "page" of results. Note that the last page could have fewer items than the "itemsPerPage" value. */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /** The fixed string "urlshortener#urlHistory". */
  var kind: js.UndefOr[String] = js.undefined
  /** A token to provide to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Total number of short URLs associated with this user (may be approximate). */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object UrlHistory {
  @scala.inline
  def apply(
    items: js.Array[Url] = null,
    itemsPerPage: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): UrlHistory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsPerPage)) __obj.updateDynamic("itemsPerPage")(itemsPerPage.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlHistory]
  }
}

