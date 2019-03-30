package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutFeatures extends js.Object {
  var featureName: js.UndefOr[java.lang.String] = js.undefined
  var featureRate: js.UndefOr[stdLib.Number] = js.undefined
}

object AboutFeatures {
  @scala.inline
  def apply(featureName: java.lang.String = null, featureRate: stdLib.Number = null): AboutFeatures = {
    val __obj = js.Dynamic.literal()
    if (featureName != null) __obj.updateDynamic("featureName")(featureName)
    if (featureRate != null) __obj.updateDynamic("featureRate")(featureRate)
    __obj.asInstanceOf[AboutFeatures]
  }
}

