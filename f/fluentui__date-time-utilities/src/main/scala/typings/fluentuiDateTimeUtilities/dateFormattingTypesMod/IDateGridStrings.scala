package typings.fluentuiDateTimeUtilities.dateFormattingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateGridStrings extends js.Object {
  /**
    * An array of strings for the full names of days of the week.
    * The array is 0-based, so days[0] should be the full name of Sunday.
    */
  var days: js.Array[String]
  /**
    * An array of strings for the full names of months.
    * The array is 0-based, so months[0] should be the full name of January.
    */
  var months: js.Array[String]
  /**
    * An array of strings for the initials of the days of the week.
    * The array is 0-based, so days[0] should be the initial of Sunday.
    */
  var shortDays: js.Array[String]
  /**
    * An array of strings for the short names of months.
    * The array is 0-based, so shortMonths[0] should be the short name of January.
    */
  var shortMonths: js.Array[String]
}

object IDateGridStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): IDateGridStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateGridStrings]
  }
}

