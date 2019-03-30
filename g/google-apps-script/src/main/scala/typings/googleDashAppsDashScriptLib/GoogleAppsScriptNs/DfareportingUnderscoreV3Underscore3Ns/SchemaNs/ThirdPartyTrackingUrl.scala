package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyTrackingUrl extends js.Object {
  var thirdPartyUrlType: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ThirdPartyTrackingUrl {
  @scala.inline
  def apply(thirdPartyUrlType: java.lang.String = null, url: java.lang.String = null): ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyUrlType != null) __obj.updateDynamic("thirdPartyUrlType")(thirdPartyUrlType)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ThirdPartyTrackingUrl]
  }
}

