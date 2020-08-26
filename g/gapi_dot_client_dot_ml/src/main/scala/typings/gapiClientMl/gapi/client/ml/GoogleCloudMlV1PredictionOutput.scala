package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1PredictionOutput extends js.Object {
  /** The number of data instances which resulted in errors. */
  var errorCount: js.UndefOr[String] = js.native
  /** Node hours used by the batch prediction job. */
  var nodeHours: js.UndefOr[Double] = js.native
  /** The output Google Cloud Storage location provided at the job creation time. */
  var outputPath: js.UndefOr[String] = js.native
  /** The number of generated predictions. */
  var predictionCount: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1PredictionOutput {
  @scala.inline
  def apply(): GoogleCloudMlV1PredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictionOutput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1PredictionOutputOps[Self <: GoogleCloudMlV1PredictionOutput] (val x: Self) extends AnyVal {
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
    def setErrorCount(value: String): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    @scala.inline
    def setNodeHours(value: Double): Self = this.set("nodeHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeHours: Self = this.set("nodeHours", js.undefined)
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    @scala.inline
    def setPredictionCount(value: String): Self = this.set("predictionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictionCount: Self = this.set("predictionCount", js.undefined)
  }
  
}

