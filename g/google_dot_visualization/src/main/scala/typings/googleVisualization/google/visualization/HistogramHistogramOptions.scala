package typings.googleVisualization.google.visualization

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
    bucketSize: js.UndefOr[Double] = js.undefined,
    hideBucketItems: js.UndefOr[Boolean] = js.undefined,
    lastBucketPercentile: js.UndefOr[Double] = js.undefined
  ): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bucketSize)) __obj.updateDynamic("bucketSize")(bucketSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBucketItems)) __obj.updateDynamic("hideBucketItems")(hideBucketItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastBucketPercentile)) __obj.updateDynamic("lastBucketPercentile")(lastBucketPercentile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
}

