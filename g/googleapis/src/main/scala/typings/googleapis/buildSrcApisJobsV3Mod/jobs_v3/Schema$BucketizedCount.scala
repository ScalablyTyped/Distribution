package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents count of jobs within one bucket.
  */
@js.native
trait Schema$BucketizedCount extends js.Object {
  /**
    * Number of jobs whose numeric field value fall into `range`.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Bucket range on which histogram was performed for the numeric field, that
    * is, the count represents number of jobs in this range.
    */
  var range: js.UndefOr[Schema$BucketRange] = js.native
}

object Schema$BucketizedCount {
  @scala.inline
  def apply(count: Int | Double = null, range: Schema$BucketRange = null): Schema$BucketizedCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BucketizedCount]
  }
}

