package typings.gapiDotClientDotPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features extends js.Object {
  /** Description of the input features in the data set. */
  var features: js.UndefOr[js.Array[Anon_Categorical]] = js.undefined
  /** Description of the output value or label. */
  var outputFeature: js.UndefOr[Anon_Numeric] = js.undefined
}

object Anon_Features {
  @scala.inline
  def apply(features: js.Array[Anon_Categorical] = null, outputFeature: Anon_Numeric = null): Anon_Features = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (outputFeature != null) __obj.updateDynamic("outputFeature")(outputFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Features]
  }
}

