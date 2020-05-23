package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  /** Description of the input features in the data set. */
  var features: js.UndefOr[js.Array[Categorical]] = js.undefined
  /** Description of the output value or label. */
  var outputFeature: js.UndefOr[Numeric] = js.undefined
}

object Features {
  @scala.inline
  def apply(features: js.Array[Categorical] = null, outputFeature: Numeric = null): Features = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (outputFeature != null) __obj.updateDynamic("outputFeature")(outputFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

