package typings.gapiDotClientDotPrediction.gapiNs.clientNs.predictionNs

import typings.gapiDotClientDotPrediction.Anon_Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /** The unique name for the predictive model. */
  var id: js.UndefOr[String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** The most likely class label (Categorical models only). */
  var outputLabel: js.UndefOr[String] = js.undefined
  /** A list of class labels with their estimated probabilities (Categorical models only). */
  var outputMulti: js.UndefOr[js.Array[Anon_Label]] = js.undefined
  /** The estimated regression value (Regression models only). */
  var outputValue: js.UndefOr[String] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    outputLabel: String = null,
    outputMulti: js.Array[Anon_Label] = null,
    outputValue: String = null,
    selfLink: String = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (outputLabel != null) __obj.updateDynamic("outputLabel")(outputLabel)
    if (outputMulti != null) __obj.updateDynamic("outputMulti")(outputMulti)
    if (outputValue != null) __obj.updateDynamic("outputValue")(outputValue)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Output]
  }
}

