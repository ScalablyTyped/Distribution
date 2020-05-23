package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CohortGroup extends js.Object {
  /** The definition for the cohort. */
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.undefined
  /**
    * Enable Life Time Value (LTV).  LTV measures lifetime value for users
    * acquired through different channels.
    * Please see:
    * [Cohort Analysis](https://support.google.com/analytics/answer/6074676) and
    * [Lifetime Value](https://support.google.com/analytics/answer/6182550)
    * If the value of lifetimeValue is false:
    *
    * - The metric values are similar to the values in the web interface cohort
    * report.
    * - The cohort definition date ranges must be aligned to the calendar week
    * and month. i.e. while requesting `ga:cohortNthWeek` the `startDate` in
    * the cohort definition should be a Sunday and the `endDate` should be the
    * following Saturday, and for `ga:cohortNthMonth`, the `startDate`
    * should be the 1st of the month and `endDate` should be the last day
    * of the month.
    *
    * When the lifetimeValue is true:
    *
    * - The metric values will correspond to the values in the web interface
    * LifeTime value report.
    * - The Lifetime Value report shows you how user value (Revenue) and
    * engagement (Appviews, Goal Completions, Sessions, and Session Duration)
    * grow during the 90 days after a user is acquired.
    * - The metrics are calculated as a cumulative average per user per the time
    * increment.
    * - The cohort definition date ranges need not be aligned to the calendar
    * week and month boundaries.
    * - The `viewId` must be an
    * [app view ID](https://support.google.com/analytics/answer/2649553#WebVersusAppViews)
    */
  var lifetimeValue: js.UndefOr[Boolean] = js.undefined
}

object CohortGroup {
  @scala.inline
  def apply(cohorts: js.Array[Cohort] = null, lifetimeValue: js.UndefOr[Boolean] = js.undefined): CohortGroup = {
    val __obj = js.Dynamic.literal()
    if (cohorts != null) __obj.updateDynamic("cohorts")(cohorts.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetimeValue)) __obj.updateDynamic("lifetimeValue")(lifetimeValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CohortGroup]
  }
}

