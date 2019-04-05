package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeConditions extends js.Object {
  var daysToLookBack: js.UndefOr[scala.Double] = js.undefined
  var isSmartList: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var membershipDurationDays: js.UndefOr[scala.Double] = js.undefined
  var segment: js.UndefOr[java.lang.String] = js.undefined
}

object IncludeConditions {
  @scala.inline
  def apply(
    daysToLookBack: scala.Int | scala.Double = null,
    isSmartList: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    membershipDurationDays: scala.Int | scala.Double = null,
    segment: java.lang.String = null
  ): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (daysToLookBack != null) __obj.updateDynamic("daysToLookBack")(daysToLookBack.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmartList)) __obj.updateDynamic("isSmartList")(isSmartList)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (membershipDurationDays != null) __obj.updateDynamic("membershipDurationDays")(membershipDurationDays.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[IncludeConditions]
  }
}

