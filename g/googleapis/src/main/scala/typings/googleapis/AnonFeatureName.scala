package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatureName extends js.Object {
  var featureName: js.UndefOr[String] = js.native
  var featureRate: js.UndefOr[Double] = js.native
}

object AnonFeatureName {
  @scala.inline
  def apply(featureName: String = null, featureRate: Int | Double = null): AnonFeatureName = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName.asInstanceOf[js.Any])
    if (featureRate != null) __obj.updateDynamic("featureRate")(featureRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatureName]
  }
}

