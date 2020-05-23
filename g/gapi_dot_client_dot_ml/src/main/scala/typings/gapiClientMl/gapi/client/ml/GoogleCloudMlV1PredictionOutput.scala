package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1PredictionOutput extends js.Object {
  /** The number of data instances which resulted in errors. */
  var errorCount: js.UndefOr[String] = js.undefined
  /** Node hours used by the batch prediction job. */
  var nodeHours: js.UndefOr[Double] = js.undefined
  /** The output Google Cloud Storage location provided at the job creation time. */
  var outputPath: js.UndefOr[String] = js.undefined
  /** The number of generated predictions. */
  var predictionCount: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1PredictionOutput {
  @scala.inline
  def apply(
    errorCount: String = null,
    nodeHours: js.UndefOr[Double] = js.undefined,
    outputPath: String = null,
    predictionCount: String = null
  ): GoogleCloudMlV1PredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeHours)) __obj.updateDynamic("nodeHours")(nodeHours.get.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (predictionCount != null) __obj.updateDynamic("predictionCount")(predictionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1PredictionOutput]
  }
}

