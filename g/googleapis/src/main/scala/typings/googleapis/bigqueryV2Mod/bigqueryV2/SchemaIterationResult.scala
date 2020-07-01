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
    evalLoss: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    learnRate: js.UndefOr[Double] = js.undefined,
    trainingLoss: js.UndefOr[Double] = js.undefined
  ): SchemaIterationResult = {
    val __obj = js.Dynamic.literal()
    if (clusterInfos != null) __obj.updateDynamic("clusterInfos")(clusterInfos.asInstanceOf[js.Any])
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(evalLoss)) __obj.updateDynamic("evalLoss")(evalLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(learnRate)) __obj.updateDynamic("learnRate")(learnRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trainingLoss)) __obj.updateDynamic("trainingLoss")(trainingLoss.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIterationResult]
  }
}

