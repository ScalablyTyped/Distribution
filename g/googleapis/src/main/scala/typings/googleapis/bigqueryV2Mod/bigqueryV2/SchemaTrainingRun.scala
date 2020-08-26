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
  def apply(): SchemaTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingRun]
  }
  @scala.inline
  implicit class SchemaTrainingRunOps[Self <: SchemaTrainingRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvaluationMetrics(value: SchemaEvaluationMetrics): Self = this.set("evaluationMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationMetrics: Self = this.set("evaluationMetrics", js.undefined)
    @scala.inline
    def setResultsVarargs(value: SchemaIterationResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaIterationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTrainingOptions(value: SchemaTrainingOptions): Self = this.set("trainingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingOptions: Self = this.set("trainingOptions", js.undefined)
  }
  
}

