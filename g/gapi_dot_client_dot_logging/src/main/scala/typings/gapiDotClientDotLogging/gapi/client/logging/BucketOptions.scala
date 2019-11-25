package typings.gapiDotClientDotLogging.gapi.client.logging

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
    if (explicitBuckets != null) __obj.updateDynamic("explicitBuckets")(explicitBuckets.asInstanceOf[js.Any])
    if (exponentialBuckets != null) __obj.updateDynamic("exponentialBuckets")(exponentialBuckets.asInstanceOf[js.Any])
    if (linearBuckets != null) __obj.updateDynamic("linearBuckets")(linearBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOptions]
  }
}

