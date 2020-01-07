package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single training query run for the model.
  */
@js.native
trait Schema$TrainingRun extends js.Object {
  /**
    * The evaluation metrics over training/eval data that were computed at the
    * end of training.
    */
  var evaluationMetrics: js.UndefOr[Schema$EvaluationMetrics] = js.native
  /**
    * Output of each iteration run, results.size() &lt;= max_iterations.
    */
  var results: js.UndefOr[js.Array[Schema$IterationResult]] = js.native
  /**
    * The start time of this training run.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Options that were used for this training run, includes user specified and
    * default options that were used.
    */
  var trainingOptions: js.UndefOr[Schema$TrainingOptions] = js.native
}

object Schema$TrainingRun {
  @scala.inline
  def apply(
    evaluationMetrics: Schema$EvaluationMetrics = null,
    results: js.Array[Schema$IterationResult] = null,
    startTime: String = null,
    trainingOptions: Schema$TrainingOptions = null
  ): Schema$TrainingRun = {
    val __obj = js.Dynamic.literal()
    if (evaluationMetrics != null) __obj.updateDynamic("evaluationMetrics")(evaluationMetrics.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (trainingOptions != null) __obj.updateDynamic("trainingOptions")(trainingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrainingRun]
  }
}

