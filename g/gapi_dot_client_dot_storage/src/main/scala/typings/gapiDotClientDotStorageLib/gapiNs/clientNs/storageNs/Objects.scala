package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Objects extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[Object]] = js.undefined
  /** The kind of item this is. For lists of objects, this is always storage#objects. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of prefixes of objects matching-but-not-listed up to and including the requested delimiter. */
  var prefixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Objects {
  @scala.inline
  def apply(
    items: js.Array[Object] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    prefixes: js.Array[java.lang.String] = null
  ): Objects = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[Objects]
  }
}

