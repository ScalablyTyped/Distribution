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

