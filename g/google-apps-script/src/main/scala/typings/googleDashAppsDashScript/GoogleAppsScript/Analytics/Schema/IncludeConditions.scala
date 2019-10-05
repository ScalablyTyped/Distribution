package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeConditions extends js.Object {
  var daysToLookBack: js.UndefOr[Double] = js.undefined
  var isSmartList: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var membershipDurationDays: js.UndefOr[Double] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
}

object IncludeConditions {
  @scala.inline
  def apply(
    daysToLookBack: Int | Double = null,
    isSmartList: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    membershipDurationDays: Int | Double = null,
    segment: String = null
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

