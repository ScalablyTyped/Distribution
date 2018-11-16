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

