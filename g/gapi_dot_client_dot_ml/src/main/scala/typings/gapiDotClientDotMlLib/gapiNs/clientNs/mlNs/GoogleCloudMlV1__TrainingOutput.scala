package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__TrainingOutput extends js.Object {
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[java.lang.String] = js.undefined
  /** The amount of ML units consumed by the job. */
  var consumedMLUnits: js.UndefOr[scala.Double] = js.undefined
  /** Whether this job is a hyperparameter tuning job. */
  var isHyperparameterTuningJob: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Results for individual Hyperparameter trials.
    * Only set for hyperparameter tuning jobs.
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1__HyperparameterOutput]] = js.undefined
}

object GoogleCloudMlV1__TrainingOutput {
  @scala.inline
  def apply(
    completedTrialCount: java.lang.String = null,
    consumedMLUnits: scala.Int | scala.Double = null,
    isHyperparameterTuningJob: js.UndefOr[scala.Boolean] = js.undefined,
    trials: js.Array[GoogleCloudMlV1__HyperparameterOutput] = null
  ): GoogleCloudMlV1__TrainingOutput = {
    val __obj = js.Dynamic.literal()
    if (completedTrialCount != null) __obj.updateDynamic("completedTrialCount")(completedTrialCount)
    if (consumedMLUnits != null) __obj.updateDynamic("consumedMLUnits")(consumedMLUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(isHyperparameterTuningJob)) __obj.updateDynamic("isHyperparameterTuningJob")(isHyperparameterTuningJob)
    if (trials != null) __obj.updateDynamic("trials")(trials)
    __obj.asInstanceOf[GoogleCloudMlV1__TrainingOutput]
  }
}

