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

