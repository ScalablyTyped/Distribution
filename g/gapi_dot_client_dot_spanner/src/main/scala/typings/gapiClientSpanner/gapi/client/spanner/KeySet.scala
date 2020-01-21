package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySet extends js.Object {
  /**
    * For convenience `all` can be set to `true` to indicate that this
    * `KeySet` matches all keys in the table or index. Note that any keys
    * specified in `keys` or `ranges` are only yielded once.
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of specific keys. Entries in `keys` should have exactly as
    * many elements as there are columns in the primary or index key
    * with which this `KeySet` is used.  Individual key values are
    * encoded as described here.
    */
  var keys: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
    * A list of key ranges. See KeyRange for more information about
    * key range specifications.
    */
  var ranges: js.UndefOr[js.Array[KeyRange]] = js.undefined
}

object KeySet {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[js.Array[_]] = null,
    ranges: js.Array[KeyRange] = null
  ): KeySet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySet]
  }
}

