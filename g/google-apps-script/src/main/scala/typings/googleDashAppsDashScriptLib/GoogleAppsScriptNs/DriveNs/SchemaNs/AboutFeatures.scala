package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutFeatures extends js.Object {
  var featureName: js.UndefOr[java.lang.String] = js.undefined
  var featureRate: js.UndefOr[scala.Double] = js.undefined
}

object AboutFeatures {
  @scala.inline
  def apply(featureName: java.lang.String = null, featureRate: scala.Int | scala.Double = null): AboutFeatures = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName)
    if (featureRate != null) __obj.updateDynamic("featureRate")(featureRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutFeatures]
  }
}

