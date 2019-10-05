package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Histogram extends js.Object {
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing
    * buckets with count = 0 are elided. Buckets can store the full range of
    * values of an unsigned long, with ULLONG_MAX falling into the 59th bucket
    * with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Starting index of first stored bucket. The non-inclusive upper-bound of
    * the ith bucket is given by:
    * pow(10,(i-first_bucket_offset)/3) &#42; (1,2,5)[(i-first_bucket_offset)%3]
    */
  var firstBucketOffset: js.UndefOr[Double] = js.undefined
}

object Histogram {
  @scala.inline
  def apply(bucketCounts: js.Array[String] = null, firstBucketOffset: Int | Double = null): Histogram = {
    val __obj = js.Dynamic.literal()
    if (bucketCounts != null) __obj.updateDynamic("bucketCounts")(bucketCounts)
    if (firstBucketOffset != null) __obj.updateDynamic("firstBucketOffset")(firstBucketOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
}

