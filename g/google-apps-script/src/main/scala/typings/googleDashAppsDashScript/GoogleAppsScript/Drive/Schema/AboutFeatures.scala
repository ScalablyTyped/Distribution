package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutFeatures extends js.Object {
  var featureName: js.UndefOr[String] = js.undefined
  var featureRate: js.UndefOr[Double] = js.undefined
}

object AboutFeatures {
  @scala.inline
  def apply(featureName: String = null, featureRate: Int | Double = null): AboutFeatures = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName)
    if (featureRate != null) __obj.updateDynamic("featureRate")(featureRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutFeatures]
  }
}

