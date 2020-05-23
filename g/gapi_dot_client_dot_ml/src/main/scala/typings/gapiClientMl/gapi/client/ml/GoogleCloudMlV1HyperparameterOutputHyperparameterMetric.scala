package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends js.Object {
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[Double] = js.undefined
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  @scala.inline
  def apply(objectiveValue: js.UndefOr[Double] = js.undefined, trainingStep: String = null): GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectiveValue)) __obj.updateDynamic("objectiveValue")(objectiveValue.get.asInstanceOf[js.Any])
    if (trainingStep != null) __obj.updateDynamic("trainingStep")(trainingStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
}

