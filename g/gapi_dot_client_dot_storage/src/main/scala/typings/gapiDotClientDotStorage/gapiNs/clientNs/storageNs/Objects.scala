package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Objects extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[Object]] = js.undefined
  /** The kind of item this is. For lists of objects, this is always storage#objects. */
  var kind: js.UndefOr[String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of prefixes of objects matching-but-not-listed up to and including the requested delimiter. */
  var prefixes: js.UndefOr[js.Array[String]] = js.undefined
}

object Objects {
  @scala.inline
  def apply(
    items: js.Array[Object] = null,
    kind: String = null,
    nextPageToken: String = null,
    prefixes: js.Array[String] = null
  ): Objects = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[Objects]
  }
}

