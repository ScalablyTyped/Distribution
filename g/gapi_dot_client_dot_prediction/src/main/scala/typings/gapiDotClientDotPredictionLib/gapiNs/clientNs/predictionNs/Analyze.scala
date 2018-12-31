package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
  /** Description of the data the model was trained on. */
  var dataDescription: js.UndefOr[gapiDotClientDotPredictionLib.Anon_OutputFeature] = js.undefined
  /** List of errors with the data. */
  var errors: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  /** The unique name for the predictive model. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the model. */
  var modelDescription: js.UndefOr[gapiDotClientDotPredictionLib.Anon_ConfusionMatrixRowTotals] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

