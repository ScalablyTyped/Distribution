package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Output extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The most likely class label (Categorical models only). */
  var outputLabel: js.UndefOr[java.lang.String] = js.undefined
  /** A list of class labels with their estimated probabilities (Categorical models only). */
  var outputMulti: js.UndefOr[js.Array[gapiDotClientDotPredictionLib.Anon_Label]] = js.undefined
  /** The estimated regression value (Regression models only). */
  var outputValue: js.UndefOr[java.lang.String] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

