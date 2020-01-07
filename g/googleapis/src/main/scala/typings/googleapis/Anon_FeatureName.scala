package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FeatureName extends js.Object {
  var featureName: js.UndefOr[String] = js.native
  var featureRate: js.UndefOr[Double] = js.native
}

object Anon_FeatureName {
  @scala.inline
  def apply(featureName: String = null, featureRate: Int | Double = null): Anon_FeatureName = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName.asInstanceOf[js.Any])
    if (featureRate != null) __obj.updateDynamic("featureRate")(featureRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FeatureName]
  }
}

