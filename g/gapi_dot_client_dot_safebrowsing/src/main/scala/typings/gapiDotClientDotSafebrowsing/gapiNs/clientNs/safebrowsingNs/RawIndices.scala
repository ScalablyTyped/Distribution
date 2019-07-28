package typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawIndices extends js.Object {
  /** The indices to remove from a lexicographically-sorted local list. */
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
}

object RawIndices {
  @scala.inline
  def apply(indices: js.Array[Double] = null): RawIndices = {
    val __obj = js.Dynamic.literal()
    if (indices != null) __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[RawIndices]
  }
}

