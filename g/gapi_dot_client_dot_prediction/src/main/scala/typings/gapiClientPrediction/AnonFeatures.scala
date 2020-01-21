package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends js.Object {
  /** Description of the input features in the data set. */
  var features: js.UndefOr[js.Array[AnonCategorical]] = js.undefined
  /** Description of the output value or label. */
  var outputFeature: js.UndefOr[AnonNumeric] = js.undefined
}

object AnonFeatures {
  @scala.inline
  def apply(features: js.Array[AnonCategorical] = null, outputFeature: AnonNumeric = null): AnonFeatures = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (outputFeature != null) __obj.updateDynamic("outputFeature")(outputFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
}

