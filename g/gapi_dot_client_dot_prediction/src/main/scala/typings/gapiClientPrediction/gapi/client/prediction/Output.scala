package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClientPrediction.anon.Label
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
  var outputMulti: js.UndefOr[js.Array[Label]] = js.undefined
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
    outputMulti: js.Array[Label] = null,
    outputValue: String = null,
    selfLink: String = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (outputLabel != null) __obj.updateDynamic("outputLabel")(outputLabel.asInstanceOf[js.Any])
    if (outputMulti != null) __obj.updateDynamic("outputMulti")(outputMulti.asInstanceOf[js.Any])
    if (outputValue != null) __obj.updateDynamic("outputValue")(outputValue.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

