package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsistentHashRingOptions extends js.Object {
  /** Function to compute the hash for a given link or partition key */
  var computeHash: js.UndefOr[js.Function2[/* key */ String | Double, /* seed */ Double, Double]] = js.undefined
  /** Number of points in the ring to assign to each collection link */
  var numberOfVirtualNodesPerCollection: js.UndefOr[Double] = js.undefined
}

object ConsistentHashRingOptions {
  @scala.inline
  def apply(
    computeHash: (/* key */ String | Double, /* seed */ Double) => Double = null,
    numberOfVirtualNodesPerCollection: Int | Double = null
  ): ConsistentHashRingOptions = {
    val __obj = js.Dynamic.literal()
    if (computeHash != null) __obj.updateDynamic("computeHash")(js.Any.fromFunction2(computeHash))
    if (numberOfVirtualNodesPerCollection != null) __obj.updateDynamic("numberOfVirtualNodesPerCollection")(numberOfVirtualNodesPerCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsistentHashRingOptions]
  }
}

