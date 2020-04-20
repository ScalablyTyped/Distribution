package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /** The end date for filtering the data. Applies only dateRangeRequired is set to true. It will be in YYYY-MM-DD format. */
  var endDate: String
  /** The start date for filtering the data. Applies only if dateRangeRequired is set to true. It will be in YYYY-MM-DD format. */
  var startDate: String
}

object DateRange {
  @scala.inline
  def apply(endDate: String, startDate: String): DateRange = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
}

