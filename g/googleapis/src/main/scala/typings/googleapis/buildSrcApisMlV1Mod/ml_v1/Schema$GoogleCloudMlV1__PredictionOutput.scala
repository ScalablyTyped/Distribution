package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents results of a prediction job.
  */
@js.native
trait Schema$GoogleCloudMlV1__PredictionOutput extends js.Object {
  /**
    * The number of data instances which resulted in errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * Node hours used by the batch prediction job.
    */
  var nodeHours: js.UndefOr[Double] = js.native
  /**
    * The output Google Cloud Storage location provided at the job creation
    * time.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * The number of generated predictions.
    */
  var predictionCount: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__PredictionOutput {
  @scala.inline
  def apply(
    errorCount: String = null,
    nodeHours: Int | Double = null,
    outputPath: String = null,
    predictionCount: String = null
  ): Schema$GoogleCloudMlV1__PredictionOutput = {
    val __obj = js.Dynamic.literal()
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (nodeHours != null) __obj.updateDynamic("nodeHours")(nodeHours.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (predictionCount != null) __obj.updateDynamic("predictionCount")(predictionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__PredictionOutput]
  }
}

