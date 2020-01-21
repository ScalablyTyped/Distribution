package typings.gapiClientMl.gapi.client.ml

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1HyperparameterOutput extends js.Object {
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.undefined
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.undefined
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[Record[String, String]] = js.undefined
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1HyperparameterOutput {
  @scala.inline
  def apply(
    allMetrics: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = null,
    finalMetric: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = null,
    hyperparameters: Record[String, String] = null,
    trialId: String = null
  ): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    if (allMetrics != null) __obj.updateDynamic("allMetrics")(allMetrics.asInstanceOf[js.Any])
    if (finalMetric != null) __obj.updateDynamic("finalMetric")(finalMetric.asInstanceOf[js.Any])
    if (hyperparameters != null) __obj.updateDynamic("hyperparameters")(hyperparameters.asInstanceOf[js.Any])
    if (trialId != null) __obj.updateDynamic("trialId")(trialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
}

