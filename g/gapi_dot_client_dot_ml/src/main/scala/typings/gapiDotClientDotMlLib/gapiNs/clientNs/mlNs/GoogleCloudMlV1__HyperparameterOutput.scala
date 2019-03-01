package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__HyperparameterOutput extends js.Object {
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric]] = js.undefined
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric] = js.undefined
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The trial id for these results. */
  var trialId: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudMlV1__HyperparameterOutput {
  @scala.inline
  def apply(
    allMetrics: js.Array[GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric] = null,
    finalMetric: GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric = null,
    hyperparameters: stdLib.Record[java.lang.String, java.lang.String] = null,
    trialId: java.lang.String = null
  ): GoogleCloudMlV1__HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    if (allMetrics != null) __obj.updateDynamic("allMetrics")(allMetrics)
    if (finalMetric != null) __obj.updateDynamic("finalMetric")(finalMetric)
    if (hyperparameters != null) __obj.updateDynamic("hyperparameters")(hyperparameters)
    if (trialId != null) __obj.updateDynamic("trialId")(trialId)
    __obj.asInstanceOf[GoogleCloudMlV1__HyperparameterOutput]
  }
}

