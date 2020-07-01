package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureName extends js.Object {
  var featureName: js.UndefOr[String] = js.native
  var featureRate: js.UndefOr[Double] = js.native
}

object FeatureName {
  @scala.inline
  def apply(featureName: String = null, featureRate: js.UndefOr[Double] = js.undefined): FeatureName = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName.asInstanceOf[js.Any])
    if (!js.isUndefined(featureRate)) __obj.updateDynamic("featureRate")(featureRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureName]
  }
}

