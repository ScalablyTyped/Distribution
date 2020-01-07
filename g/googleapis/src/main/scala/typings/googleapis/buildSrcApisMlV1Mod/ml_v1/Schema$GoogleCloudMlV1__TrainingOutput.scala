package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents results of a training job. Output only.
  */
@js.native
trait Schema$GoogleCloudMlV1__TrainingOutput extends js.Object {
  /**
    * Details related to built-in algorithms job. Only set for built-in
    * algorithms jobs.
    */
  var builtInAlgorithmOutput: js.UndefOr[Schema$GoogleCloudMlV1__BuiltInAlgorithmOutput] = js.native
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.native
  /**
    * The amount of ML units consumed by the job.
    */
  var consumedMLUnits: js.UndefOr[Double] = js.native
  /**
    * Whether this job is a built-in Algorithm job.
    */
  var isBuiltInAlgorithmJob: js.UndefOr[Boolean] = js.native
  /**
    * Whether this job is a hyperparameter tuning job.
    */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.native
  /**
    * Results for individual Hyperparameter trials. Only set for hyperparameter
    * tuning jobs.
    */
  var trials: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__HyperparameterOutput]] = js.native
}

object Schema$GoogleCloudMlV1__TrainingOutput {
  @scala.inline
  def apply(
    builtInAlgorithmOutput: Schema$GoogleCloudMlV1__BuiltInAlgorithmOutput = null,
    completedTrialCount: String = null,
    consumedMLUnits: Int | Double = null,
    isBuiltInAlgorithmJob: js.UndefOr[Boolean] = js.undefined,
    isHyperparameterTuningJob: js.UndefOr[Boolean] = js.undefined,
    trials: js.Array[Schema$GoogleCloudMlV1__HyperparameterOutput] = null
  ): Schema$GoogleCloudMlV1__TrainingOutput = {
    val __obj = js.Dynamic.literal()
    if (builtInAlgorithmOutput != null) __obj.updateDynamic("builtInAlgorithmOutput")(builtInAlgorithmOutput.asInstanceOf[js.Any])
    if (completedTrialCount != null) __obj.updateDynamic("completedTrialCount")(completedTrialCount.asInstanceOf[js.Any])
    if (consumedMLUnits != null) __obj.updateDynamic("consumedMLUnits")(consumedMLUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(isBuiltInAlgorithmJob)) __obj.updateDynamic("isBuiltInAlgorithmJob")(isBuiltInAlgorithmJob.asInstanceOf[js.Any])
    if (!js.isUndefined(isHyperparameterTuningJob)) __obj.updateDynamic("isHyperparameterTuningJob")(isHyperparameterTuningJob.asInstanceOf[js.Any])
    if (trials != null) __obj.updateDynamic("trials")(trials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__TrainingOutput]
  }
}

