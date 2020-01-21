package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single iteration of the training run.
  */
@js.native
trait SchemaIterationResult extends js.Object {
  /**
    * [Beta] Information about top clusters for clustering models.
    */
  var clusterInfos: js.UndefOr[js.Array[SchemaClusterInfo]] = js.native
  /**
    * Time taken to run the iteration in milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Loss computed on the eval data at the end of iteration.
    */
  var evalLoss: js.UndefOr[Double] = js.native
  /**
    * Index of the iteration, 0 based.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Learn rate used for this iteration.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * Loss computed on the training data at the end of iteration.
    */
  var trainingLoss: js.UndefOr[Double] = js.native
}

object SchemaIterationResult {
  @scala.inline
  def apply(
    clusterInfos: js.Array[SchemaClusterInfo] = null,
    durationMs: String = null,
    evalLoss: Int | Double = null,
    index: Int | Double = null,
    learnRate: Int | Double = null,
    trainingLoss: Int | Double = null
  ): SchemaIterationResult = {
    val __obj = js.Dynamic.literal()
    if (clusterInfos != null) __obj.updateDynamic("clusterInfos")(clusterInfos.asInstanceOf[js.Any])
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (evalLoss != null) __obj.updateDynamic("evalLoss")(evalLoss.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (trainingLoss != null) __obj.updateDynamic("trainingLoss")(trainingLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIterationResult]
  }
}

