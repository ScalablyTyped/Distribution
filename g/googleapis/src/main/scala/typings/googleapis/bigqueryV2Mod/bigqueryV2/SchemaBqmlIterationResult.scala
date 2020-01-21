package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBqmlIterationResult extends js.Object {
  /**
    * [Output-only, Beta] Time taken to run the training iteration in
    * milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Eval loss computed on the eval data at the end of the
    * iteration. The eval loss is used for early stopping to avoid overfitting.
    * No eval loss if eval_split_method option is specified as no_split or
    * auto_split with input data size less than 500 rows.
    */
  var evalLoss: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Index of the ML training iteration, starting from
    * zero for each training run.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Learning rate used for this iteration, it varies for
    * different training iterations if learn_rate_strategy option is not
    * constant.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Training loss computed on the training data at the
    * end of the iteration. The training loss function is defined by model
    * type.
    */
  var trainingLoss: js.UndefOr[Double] = js.native
}

object SchemaBqmlIterationResult {
  @scala.inline
  def apply(
    durationMs: String = null,
    evalLoss: Int | Double = null,
    index: Int | Double = null,
    learnRate: Int | Double = null,
    trainingLoss: Int | Double = null
  ): SchemaBqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (evalLoss != null) __obj.updateDynamic("evalLoss")(evalLoss.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (trainingLoss != null) __obj.updateDynamic("trainingLoss")(trainingLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBqmlIterationResult]
  }
}

