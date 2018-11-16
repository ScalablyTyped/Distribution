package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IncludeConditions extends js.Object {
  /**
               * The look-back window lets you specify a time frame for evaluating the behavior that qualifies users for your audience. For example, if your filters
               * include users from Central Asia, and Transactions Greater than 2, and you set the look-back window to 14 days, then any user from Central Asia whose
               * cumulative transactions exceed 2 during the last 14 days is added to the audience.
               */
  var daysToLookBack: js.UndefOr[scala.Double] = js.undefined
  /** Boolean indicating whether this segment is a smart list. https://support.google.com/analytics/answer/4628577 */
  var isSmartList: js.UndefOr[scala.Boolean] = js.undefined
  /** Resource type for include conditions. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Number of days (in the range 1 to 540) a user remains in the audience. */
  var membershipDurationDays: js.UndefOr[scala.Double] = js.undefined
  /** The segment condition that will cause a user to be added to an audience. */
  var segment: js.UndefOr[java.lang.String] = js.undefined
}

