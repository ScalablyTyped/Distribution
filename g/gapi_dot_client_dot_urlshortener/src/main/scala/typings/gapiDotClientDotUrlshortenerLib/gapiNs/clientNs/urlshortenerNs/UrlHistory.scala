package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlHistory extends js.Object {
  /** A list of URL resources. */
  var items: js.UndefOr[js.Array[Url]] = js.undefined
  /** Number of items returned with each full "page" of results. Note that the last page could have fewer items than the "itemsPerPage" value. */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** The fixed string "urlshortener#urlHistory". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token to provide to get the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of short URLs associated with this user (may be approximate). */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object UrlHistory {
  @scala.inline
  def apply(
    items: js.Array[Url] = null,
    itemsPerPage: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): UrlHistory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlHistory]
  }
}

