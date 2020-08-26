package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends js.Object {
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[Double] = js.native
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputHyperparameterMetricOps[Self <: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] (val x: Self) extends AnyVal {
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
    def setObjectiveValue(value: Double): Self = this.set("objectiveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectiveValue: Self = this.set("objectiveValue", js.undefined)
    @scala.inline
    def setTrainingStep(value: String): Self = this.set("trainingStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingStep: Self = this.set("trainingStep", js.undefined)
  }
  
}

