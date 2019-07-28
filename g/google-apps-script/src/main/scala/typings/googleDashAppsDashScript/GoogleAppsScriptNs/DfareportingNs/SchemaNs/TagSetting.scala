package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSetting extends js.Object {
  var additionalKeyValues: js.UndefOr[String] = js.undefined
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.undefined
  var includeClickTracking: js.UndefOr[Boolean] = js.undefined
  var keywordOption: js.UndefOr[String] = js.undefined
}

object TagSetting {
  @scala.inline
  def apply(
    additionalKeyValues: String = null,
    includeClickThroughUrls: js.UndefOr[Boolean] = js.undefined,
    includeClickTracking: js.UndefOr[Boolean] = js.undefined,
    keywordOption: String = null
  ): TagSetting = {
    val __obj = js.Dynamic.literal()
    if (additionalKeyValues != null) __obj.updateDynamic("additionalKeyValues")(additionalKeyValues)
    if (!js.isUndefined(includeClickThroughUrls)) __obj.updateDynamic("includeClickThroughUrls")(includeClickThroughUrls)
    if (!js.isUndefined(includeClickTracking)) __obj.updateDynamic("includeClickTracking")(includeClickTracking)
    if (keywordOption != null) __obj.updateDynamic("keywordOption")(keywordOption)
    __obj.asInstanceOf[TagSetting]
  }
}

