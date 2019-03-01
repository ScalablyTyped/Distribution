package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketOptions extends js.Object {
  /** The explicit buckets. */
  var explicitBuckets: js.UndefOr[Explicit] = js.undefined
  /** The exponential buckets. */
  var exponentialBuckets: js.UndefOr[Exponential] = js.undefined
  /** The linear bucket. */
  var linearBuckets: js.UndefOr[Linear] = js.undefined
}

object BucketOptions {
  @scala.inline
  def apply(
    explicitBuckets: Explicit = null,
    exponentialBuckets: Exponential = null,
    linearBuckets: Linear = null
  ): BucketOptions = {
    val __obj = js.Dynamic.literal()
    if (explicitBuckets != null) __obj.updateDynamic("explicitBuckets")(explicitBuckets)
    if (exponentialBuckets != null) __obj.updateDynamic("exponentialBuckets")(exponentialBuckets)
    if (linearBuckets != null) __obj.updateDynamic("linearBuckets")(linearBuckets)
    __obj.asInstanceOf[BucketOptions]
  }
}

