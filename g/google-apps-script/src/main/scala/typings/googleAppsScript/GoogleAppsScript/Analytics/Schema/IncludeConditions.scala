package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

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
    daysToLookBack: js.UndefOr[Double] = js.undefined,
    isSmartList: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    membershipDurationDays: js.UndefOr[Double] = js.undefined,
    segment: String = null
  ): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(daysToLookBack)) __obj.updateDynamic("daysToLookBack")(daysToLookBack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmartList)) __obj.updateDynamic("isSmartList")(isSmartList.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(membershipDurationDays)) __obj.updateDynamic("membershipDurationDays")(membershipDurationDays.get.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeConditions]
  }
}

