package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__Job extends js.Object {
  /** Output only. When the job was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. When the job processing was completed. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The user-specified id of the job. */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /** Input parameters to create a prediction job. */
  var predictionInput: js.UndefOr[GoogleCloudMlV1__PredictionInput] = js.undefined
  /** The current prediction job result. */
  var predictionOutput: js.UndefOr[GoogleCloudMlV1__PredictionOutput] = js.undefined
  /** Output only. When the job processing was started. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The detailed state of a job. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Input parameters to create a training job. */
  var trainingInput: js.UndefOr[GoogleCloudMlV1__TrainingInput] = js.undefined
  /** The current training job result. */
  var trainingOutput: js.UndefOr[GoogleCloudMlV1__TrainingOutput] = js.undefined
}

