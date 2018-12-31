package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDistribution extends js.Object {
  /** The finite buckets. */
  var buckets: js.UndefOr[js.Array[PointDistributionBucket]] = js.undefined
  /** The overflow bucket. */
  var overflowBucket: js.UndefOr[PointDistributionOverflowBucket] = js.undefined
  /** The underflow bucket. */
  var underflowBucket: js.UndefOr[PointDistributionUnderflowBucket] = js.undefined
}

