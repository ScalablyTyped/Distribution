package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a training, prediction or explanation job.
  */
@js.native
trait Schema$GoogleCloudMlV1__Job extends js.Object {
  /**
    * Output only. When the job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. When the job processing was completed.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The details of a failure or a cancellation.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a job from overwriting each other. It is
    * strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform job updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetJob`, and
    * systems are expected to put that etag in the request to `UpdateJob` to
    * ensure that their change will be applied to the same version of the job.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Required. The user-specified id of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Optional. One or more labels that you can add, to organize your jobs.
    * Each label is a key-value pair, where both the key and the value are
    * arbitrary strings that you supply. For more information, see the
    * documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Input parameters to create a prediction job.
    */
  var predictionInput: js.UndefOr[Schema$GoogleCloudMlV1__PredictionInput] = js.native
  /**
    * The current prediction job result.
    */
  var predictionOutput: js.UndefOr[Schema$GoogleCloudMlV1__PredictionOutput] = js.native
  /**
    * Output only. When the job processing was started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The detailed state of a job.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Input parameters to create a training job.
    */
  var trainingInput: js.UndefOr[Schema$GoogleCloudMlV1__TrainingInput] = js.native
  /**
    * The current training job result.
    */
  var trainingOutput: js.UndefOr[Schema$GoogleCloudMlV1__TrainingOutput] = js.native
}

object Schema$GoogleCloudMlV1__Job {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    errorMessage: String = null,
    etag: String = null,
    jobId: String = null,
    labels: StringDictionary[String] = null,
    predictionInput: Schema$GoogleCloudMlV1__PredictionInput = null,
    predictionOutput: Schema$GoogleCloudMlV1__PredictionOutput = null,
    startTime: String = null,
    state: String = null,
    trainingInput: Schema$GoogleCloudMlV1__TrainingInput = null,
    trainingOutput: Schema$GoogleCloudMlV1__TrainingOutput = null
  ): Schema$GoogleCloudMlV1__Job = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (predictionInput != null) __obj.updateDynamic("predictionInput")(predictionInput.asInstanceOf[js.Any])
    if (predictionOutput != null) __obj.updateDynamic("predictionOutput")(predictionOutput.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (trainingInput != null) __obj.updateDynamic("trainingInput")(trainingInput.asInstanceOf[js.Any])
    if (trainingOutput != null) __obj.updateDynamic("trainingOutput")(trainingOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__Job]
  }
}

