package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__PredictionOutput extends js.Object {
  /** The number of data instances which resulted in errors. */
  var errorCount: js.UndefOr[java.lang.String] = js.undefined
  /** Node hours used by the batch prediction job. */
  var nodeHours: js.UndefOr[scala.Double] = js.undefined
  /** The output Google Cloud Storage location provided at the job creation time. */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
  /** The number of generated predictions. */
  var predictionCount: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudMlV1__PredictionOutput {
  @scala.inline
  def apply(
    errorCount: java.lang.String = null,
    nodeHours: scala.Int | scala.Double = null,
    outputPath: java.lang.String = null,
    predictionCount: java.lang.String = null
  ): GoogleCloudMlV1__PredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount)
    if (nodeHours != null) __obj.updateDynamic("nodeHours")(nodeHours.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (predictionCount != null) __obj.updateDynamic("predictionCount")(predictionCount)
    __obj.asInstanceOf[GoogleCloudMlV1__PredictionOutput]
  }
}

