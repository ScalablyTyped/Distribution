package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An observed value of a metric.
  */
@js.native
trait Schema$GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric extends js.Object {
  /**
    * The objective value at this training step.
    */
  var objectiveValue: js.UndefOr[Double] = js.native
  /**
    * The global training step for this metric.
    */
  var trainingStep: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric {
  @scala.inline
  def apply(objectiveValue: Int | Double = null, trainingStep: String = null): Schema$GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    if (objectiveValue != null) __obj.updateDynamic("objectiveValue")(objectiveValue.asInstanceOf[js.Any])
    if (trainingStep != null) __obj.updateDynamic("trainingStep")(trainingStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric]
  }
}

