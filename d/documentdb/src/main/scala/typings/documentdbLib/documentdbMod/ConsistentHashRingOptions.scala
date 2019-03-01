package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsistentHashRingOptions extends js.Object {
  /** Function to compute the hash for a given link or partition key */
  var computeHash: js.UndefOr[
    js.Function2[/* key */ java.lang.String | scala.Double, /* seed */ scala.Double, scala.Double]
  ] = js.undefined
  /** Number of points in the ring to assign to each collection link */
  var numberOfVirtualNodesPerCollection: js.UndefOr[scala.Double] = js.undefined
}

object ConsistentHashRingOptions {
  @scala.inline
  def apply(
    computeHash: js.Function2[/* key */ java.lang.String | scala.Double, /* seed */ scala.Double, scala.Double] = null,
    numberOfVirtualNodesPerCollection: scala.Int | scala.Double = null
  ): ConsistentHashRingOptions = {
    val __obj = js.Dynamic.literal()
    if (computeHash != null) __obj.updateDynamic("computeHash")(computeHash)
    if (numberOfVirtualNodesPerCollection != null) __obj.updateDynamic("numberOfVirtualNodesPerCollection")(numberOfVirtualNodesPerCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsistentHashRingOptions]
  }
}

