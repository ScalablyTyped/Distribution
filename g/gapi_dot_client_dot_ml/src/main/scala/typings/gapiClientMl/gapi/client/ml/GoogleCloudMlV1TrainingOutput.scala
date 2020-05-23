package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1TrainingOutput extends js.Object {
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.undefined
  /** The amount of ML units consumed by the job. */
  var consumedMLUnits: js.UndefOr[Double] = js.undefined
  /** Whether this job is a hyperparameter tuning job. */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.undefined
  /**
    * Results for individual Hyperparameter trials.
    * Only set for hyperparameter tuning jobs.
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutput]] = js.undefined
}

object GoogleCloudMlV1TrainingOutput {
  @scala.inline
  def apply(
    completedTrialCount: String = null,
    consumedMLUnits: js.UndefOr[Double] = js.undefined,
    isHyperparameterTuningJob: js.UndefOr[Boolean] = js.undefined,
    trials: js.Array[GoogleCloudMlV1HyperparameterOutput] = null
  ): GoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    if (completedTrialCount != null) __obj.updateDynamic("completedTrialCount")(completedTrialCount.asInstanceOf[js.Any])
    if (!js.isUndefined(consumedMLUnits)) __obj.updateDynamic("consumedMLUnits")(consumedMLUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHyperparameterTuningJob)) __obj.updateDynamic("isHyperparameterTuningJob")(isHyperparameterTuningJob.get.asInstanceOf[js.Any])
    if (trials != null) __obj.updateDynamic("trials")(trials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1TrainingOutput]
  }
}

