package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import typings.std.Record
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
  var hyperparameters: js.UndefOr[Record[String, String]] = js.undefined
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1__HyperparameterOutput {
  @scala.inline
  def apply(
    allMetrics: js.Array[GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric] = null,
    finalMetric: GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetric = null,
    hyperparameters: Record[String, String] = null,
    trialId: String = null
  ): GoogleCloudMlV1__HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    if (allMetrics != null) __obj.updateDynamic("allMetrics")(allMetrics)
    if (finalMetric != null) __obj.updateDynamic("finalMetric")(finalMetric)
    if (hyperparameters != null) __obj.updateDynamic("hyperparameters")(hyperparameters)
    if (trialId != null) __obj.updateDynamic("trialId")(trialId)
    __obj.asInstanceOf[GoogleCloudMlV1__HyperparameterOutput]
  }
}

