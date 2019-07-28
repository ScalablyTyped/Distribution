package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buckets extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[Bucket]] = js.undefined
  /** The kind of item this is. For lists of buckets, this is always storage#buckets. */
  var kind: js.UndefOr[String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Buckets {
  @scala.inline
  def apply(items: js.Array[Bucket] = null, kind: String = null, nextPageToken: String = null): Buckets = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Buckets]
  }
}

