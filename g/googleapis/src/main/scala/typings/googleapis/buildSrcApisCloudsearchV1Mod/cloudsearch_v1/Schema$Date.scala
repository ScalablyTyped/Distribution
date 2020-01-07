package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a whole calendar date, for example a date of birth. The time of
  * day and time zone are either specified elsewhere or are not significant.
  * The date is relative to the [Proleptic Gregorian
  * Calendar](https://en.wikipedia.org/wiki/Proleptic_Gregorian_calendar). The
  * date must be a valid calendar date between the year 1 and 9999.
  */
@js.native
trait Schema$Date extends js.Object {
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Month of date. Must be from 1 to 12.
    */
  var month: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999.
    */
  var year: js.UndefOr[Double] = js.native
}

object Schema$Date {
  @scala.inline
  def apply(day: Int | Double = null, month: Int | Double = null, year: Int | Double = null): Schema$Date = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Date]
  }
}

