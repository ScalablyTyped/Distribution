package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accounts extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The accounts returned in this list response. */
  var items: js.UndefOr[js.Array[Account]] = js.undefined
  /** Kind of list this is, in this case adexchangeseller#accounts. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token used to page through accounts. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object Accounts {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Account] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): Accounts = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Accounts]
  }
}

