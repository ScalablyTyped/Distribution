package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeConditions extends js.Object {
  /**
    * The look-back window lets you specify a time frame for evaluating the behavior that qualifies users for your audience. For example, if your filters
    * include users from Central Asia, and Transactions Greater than 2, and you set the look-back window to 14 days, then any user from Central Asia whose
    * cumulative transactions exceed 2 during the last 14 days is added to the audience.
    */
  var daysToLookBack: js.UndefOr[Double] = js.undefined
  /** Boolean indicating whether this segment is a smart list. https://support.google.com/analytics/answer/4628577 */
  var isSmartList: js.UndefOr[Boolean] = js.undefined
  /** Resource type for include conditions. */
  var kind: js.UndefOr[String] = js.undefined
  /** Number of days (in the range 1 to 540) a user remains in the audience. */
  var membershipDurationDays: js.UndefOr[Double] = js.undefined
  /** The segment condition that will cause a user to be added to an audience. */
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
    if (!js.isUndefined(isSmartList)) __obj.updateDynamic("isSmartList")(isSmartList.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (membershipDurationDays != null) __obj.updateDynamic("membershipDurationDays")(membershipDurationDays.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeConditions]
  }
}

