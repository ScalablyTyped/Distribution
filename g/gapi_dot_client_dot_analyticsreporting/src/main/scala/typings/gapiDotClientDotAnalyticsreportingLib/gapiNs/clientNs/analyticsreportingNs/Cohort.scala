package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cohort extends js.Object {
  /**
    * This is used for `FIRST_VISIT_DATE` cohort, the cohort selects users
    * whose first visit date is between start date and end date defined in the
    * DateRange. The date ranges should be aligned for cohort requests. If the
    * request contains `ga:cohortNthDay` it should be exactly one day long,
    * if `ga:cohortNthWeek` it should be aligned to the week boundary (starting
    * at Sunday and ending Saturday), and for `ga:cohortNthMonth` the date range
    * should be aligned to the month (starting at the first and ending on the
    * last day of the month).
    * For LTV requests there are no such restrictions.
    * You do not need to supply a date range for the
    * `reportsRequest.dateRanges` field.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  /**
    * A unique name for the cohort. If not defined name will be auto-generated
    * with values cohort_[1234...].
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of the cohort. The only supported type as of now is
    * `FIRST_VISIT_DATE`. If this field is unspecified the cohort is treated
    * as `FIRST_VISIT_DATE` type cohort.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Cohort {
  @scala.inline
  def apply(dateRange: DateRange = null, name: java.lang.String = null, `type`: java.lang.String = null): Cohort = {
    val __obj = js.Dynamic.literal()
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Cohort]
  }
}

