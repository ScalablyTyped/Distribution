package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for clustering models.
  */
@js.native
trait SchemaClusteringMetrics extends js.Object {
  /**
    * Davies-Bouldin index.
    */
  var daviesBouldinIndex: js.UndefOr[Double] = js.native
  /**
    * Mean of squared distances between each sample to its cluster centroid.
    */
  var meanSquaredDistance: js.UndefOr[Double] = js.native
}

object SchemaClusteringMetrics {
  @scala.inline
  def apply(daviesBouldinIndex: Int | Double = null, meanSquaredDistance: Int | Double = null): SchemaClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    if (daviesBouldinIndex != null) __obj.updateDynamic("daviesBouldinIndex")(daviesBouldinIndex.asInstanceOf[js.Any])
    if (meanSquaredDistance != null) __obj.updateDynamic("meanSquaredDistance")(meanSquaredDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusteringMetrics]
  }
}

