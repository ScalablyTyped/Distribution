package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSetting extends js.Object {
  var additionalKeyValues: js.UndefOr[java.lang.String] = js.undefined
  var includeClickThroughUrls: js.UndefOr[scala.Boolean] = js.undefined
  var includeClickTracking: js.UndefOr[scala.Boolean] = js.undefined
  var keywordOption: js.UndefOr[java.lang.String] = js.undefined
}

object TagSetting {
  @scala.inline
  def apply(
    additionalKeyValues: java.lang.String = null,
    includeClickThroughUrls: js.UndefOr[scala.Boolean] = js.undefined,
    includeClickTracking: js.UndefOr[scala.Boolean] = js.undefined,
    keywordOption: java.lang.String = null
  ): TagSetting = {
    val __obj = js.Dynamic.literal()
    if (additionalKeyValues != null) __obj.updateDynamic("additionalKeyValues")(additionalKeyValues)
    if (!js.isUndefined(includeClickThroughUrls)) __obj.updateDynamic("includeClickThroughUrls")(includeClickThroughUrls)
    if (!js.isUndefined(includeClickTracking)) __obj.updateDynamic("includeClickTracking")(includeClickTracking)
    if (keywordOption != null) __obj.updateDynamic("keywordOption")(keywordOption)
    __obj.asInstanceOf[TagSetting]
  }
}

