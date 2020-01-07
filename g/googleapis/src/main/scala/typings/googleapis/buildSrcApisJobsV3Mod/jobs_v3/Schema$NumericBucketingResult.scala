package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom numeric bucketing result.
  */
@js.native
trait Schema$NumericBucketingResult extends js.Object {
  /**
    * Count within each bucket. Its size is the length of
    * NumericBucketingOption.bucket_bounds plus 1.
    */
  var counts: js.UndefOr[js.Array[Schema$BucketizedCount]] = js.native
  /**
    * Stores the maximum value of the numeric field. Is populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Stores the minimum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var minValue: js.UndefOr[Double] = js.native
}

object Schema$NumericBucketingResult {
  @scala.inline
  def apply(
    counts: js.Array[Schema$BucketizedCount] = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null
  ): Schema$NumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NumericBucketingResult]
  }
}

