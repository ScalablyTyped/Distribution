package typings.gapiClientMl.gapi.client.ml

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterOutput extends js.Object {
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[Record[String, String]] = js.native
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1HyperparameterOutput {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputOps[Self <: GoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
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
    def setAllMetricsVarargs(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = this.set("allMetrics", js.Array(value :_*))
    @scala.inline
    def setAllMetrics(value: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = this.set("allMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllMetrics: Self = this.set("allMetrics", js.undefined)
    @scala.inline
    def setFinalMetric(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = this.set("finalMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalMetric: Self = this.set("finalMetric", js.undefined)
    @scala.inline
    def setHyperparameters(value: Record[String, String]): Self = this.set("hyperparameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperparameters: Self = this.set("hyperparameters", js.undefined)
    @scala.inline
    def setTrialId(value: String): Self = this.set("trialId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialId: Self = this.set("trialId", js.undefined)
  }
  
}

