package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1Job extends js.Object {
  /** Output only. When the job was created. */
  var createTime: js.UndefOr[String] = js.undefined
  /** Output only. When the job processing was completed. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /** Required. The user-specified id of the job. */
  var jobId: js.UndefOr[String] = js.undefined
  /** Input parameters to create a prediction job. */
  var predictionInput: js.UndefOr[GoogleCloudMlV1PredictionInput] = js.undefined
  /** The current prediction job result. */
  var predictionOutput: js.UndefOr[GoogleCloudMlV1PredictionOutput] = js.undefined
  /** Output only. When the job processing was started. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Output only. The detailed state of a job. */
  var state: js.UndefOr[String] = js.undefined
  /** Input parameters to create a training job. */
  var trainingInput: js.UndefOr[GoogleCloudMlV1TrainingInput] = js.undefined
  /** The current training job result. */
  var trainingOutput: js.UndefOr[GoogleCloudMlV1TrainingOutput] = js.undefined
}

object GoogleCloudMlV1Job {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    errorMessage: String = null,
    jobId: String = null,
    predictionInput: GoogleCloudMlV1PredictionInput = null,
    predictionOutput: GoogleCloudMlV1PredictionOutput = null,
    startTime: String = null,
    state: String = null,
    trainingInput: GoogleCloudMlV1TrainingInput = null,
    trainingOutput: GoogleCloudMlV1TrainingOutput = null
  ): GoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (predictionInput != null) __obj.updateDynamic("predictionInput")(predictionInput.asInstanceOf[js.Any])
    if (predictionOutput != null) __obj.updateDynamic("predictionOutput")(predictionOutput.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (trainingInput != null) __obj.updateDynamic("trainingInput")(trainingInput.asInstanceOf[js.Any])
    if (trainingOutput != null) __obj.updateDynamic("trainingOutput")(trainingOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1Job]
  }
}

