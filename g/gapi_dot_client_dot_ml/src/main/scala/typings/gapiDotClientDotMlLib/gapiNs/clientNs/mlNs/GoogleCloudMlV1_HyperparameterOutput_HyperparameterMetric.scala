package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric extends js.Object {
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[scala.Double] = js.undefined
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric {
  @scala.inline
  def apply(objectiveValue: scala.Int | scala.Double = null, trainingStep: java.lang.String = null): GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    if (objectiveValue != null) __obj.updateDynamic("objectiveValue")(objectiveValue.asInstanceOf[js.Any])
    if (trainingStep != null) __obj.updateDynamic("trainingStep")(trainingStep)
    __obj.asInstanceOf[GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric]
  }
}

