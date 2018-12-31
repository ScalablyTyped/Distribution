package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySet extends js.Object {
  /**
    * For convenience `all` can be set to `true` to indicate that this
    * `KeySet` matches all keys in the table or index. Note that any keys
    * specified in `keys` or `ranges` are only yielded once.
    */
  var all: js.UndefOr[scala.Boolean] = js.undefined
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

