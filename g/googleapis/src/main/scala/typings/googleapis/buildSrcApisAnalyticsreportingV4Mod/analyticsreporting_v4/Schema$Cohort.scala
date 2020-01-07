package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a cohort. A cohort is a group of users who share a common
  * characteristic. For example, all users with the same acquisition date
  * belong to the same cohort.
  */
@js.native
trait Schema$Cohort extends js.Object {
  /**
    * This is used for `FIRST_VISIT_DATE` cohort, the cohort selects users
    * whose first visit date is between start date and end date defined in the
    * DateRange. The date ranges should be aligned for cohort requests. If the
    * request contains `ga:cohortNthDay` it should be exactly one day long, if
    * `ga:cohortNthWeek` it should be aligned to the week boundary (starting at
    * Sunday and ending Saturday), and for `ga:cohortNthMonth` the date range
    * should be aligned to the month (starting at the first and ending on the
    * last day of the month). For LTV requests there are no such restrictions.
    * You do not need to supply a date range for the
    * `reportsRequest.dateRanges` field.
    */
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  /**
    * A unique name for the cohort. If not defined name will be auto-generated
    * with values cohort_[1234...].
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of the cohort. The only supported type as of now is
    * `FIRST_VISIT_DATE`. If this field is unspecified the cohort is treated as
    * `FIRST_VISIT_DATE` type cohort.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Cohort {
  @scala.inline
  def apply(dateRange: Schema$DateRange = null, name: String = null, `type`: String = null): Schema$Cohort = {
    val __obj = js.Dynamic.literal()
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Cohort]
  }
}

