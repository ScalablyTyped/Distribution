package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramHistogramOptions extends js.Object {
  var bucketSize: js.UndefOr[Double] = js.undefined
  var hideBucketItems: js.UndefOr[Boolean] = js.undefined
  var lastBucketPercentile: js.UndefOr[Double] = js.undefined
}

object HistogramHistogramOptions {
  @scala.inline
  def apply(
    bucketSize: Int | Double = null,
    hideBucketItems: js.UndefOr[Boolean] = js.undefined,
    lastBucketPercentile: Int | Double = null
  ): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBucketItems)) __obj.updateDynamic("hideBucketItems")(hideBucketItems.asInstanceOf[js.Any])
    if (lastBucketPercentile != null) __obj.updateDynamic("lastBucketPercentile")(lastBucketPercentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
}

