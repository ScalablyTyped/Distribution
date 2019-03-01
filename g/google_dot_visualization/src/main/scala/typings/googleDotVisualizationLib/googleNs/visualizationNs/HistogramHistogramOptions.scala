package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramHistogramOptions extends js.Object {
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  var hideBucketItems: js.UndefOr[scala.Boolean] = js.undefined
  var lastBucketPercentile: js.UndefOr[scala.Double] = js.undefined
}

object HistogramHistogramOptions {
  @scala.inline
  def apply(
    bucketSize: scala.Int | scala.Double = null,
    hideBucketItems: js.UndefOr[scala.Boolean] = js.undefined,
    lastBucketPercentile: scala.Int | scala.Double = null
  ): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBucketItems)) __obj.updateDynamic("hideBucketItems")(hideBucketItems)
    if (lastBucketPercentile != null) __obj.updateDynamic("lastBucketPercentile")(lastBucketPercentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
}

