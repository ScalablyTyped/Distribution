package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1TrainingOutput extends js.Object {
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.native
  /** The amount of ML units consumed by the job. */
  var consumedMLUnits: js.UndefOr[Double] = js.native
  /** Whether this job is a hyperparameter tuning job. */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.native
  /**
    * Results for individual Hyperparameter trials.
    * Only set for hyperparameter tuning jobs.
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutput]] = js.native
}

object GoogleCloudMlV1TrainingOutput {
  @scala.inline
  def apply(): GoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrainingOutput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1TrainingOutputOps[Self <: GoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
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
    def setCompletedTrialCount(value: String): Self = this.set("completedTrialCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedTrialCount: Self = this.set("completedTrialCount", js.undefined)
    @scala.inline
    def setConsumedMLUnits(value: Double): Self = this.set("consumedMLUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedMLUnits: Self = this.set("consumedMLUnits", js.undefined)
    @scala.inline
    def setIsHyperparameterTuningJob(value: Boolean): Self = this.set("isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHyperparameterTuningJob: Self = this.set("isHyperparameterTuningJob", js.undefined)
    @scala.inline
    def setTrialsVarargs(value: GoogleCloudMlV1HyperparameterOutput*): Self = this.set("trials", js.Array(value :_*))
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1HyperparameterOutput]): Self = this.set("trials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrials: Self = this.set("trials", js.undefined)
  }
  
}

