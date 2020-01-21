package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single training query run for the model.
  */
@js.native
trait SchemaTrainingRun extends js.Object {
  /**
    * The evaluation metrics over training/eval data that were computed at the
    * end of training.
    */
  var evaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.native
  /**
    * Output of each iteration run, results.size() &lt;= max_iterations.
    */
  var results: js.UndefOr[js.Array[SchemaIterationResult]] = js.native
  /**
    * The start time of this training run.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Options that were used for this training run, includes user specified and
    * default options that were used.
    */
  var trainingOptions: js.UndefOr[SchemaTrainingOptions] = js.native
}

object SchemaTrainingRun {
  @scala.inline
  def apply(
    evaluationMetrics: SchemaEvaluationMetrics = null,
    results: js.Array[SchemaIterationResult] = null,
    startTime: String = null,
    trainingOptions: SchemaTrainingOptions = null
  ): SchemaTrainingRun = {
    val __obj = js.Dynamic.literal()
    if (evaluationMetrics != null) __obj.updateDynamic("evaluationMetrics")(evaluationMetrics.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (trainingOptions != null) __obj.updateDynamic("trainingOptions")(trainingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrainingRun]
  }
}

