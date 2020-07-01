package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

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
trait SchemaDate extends js.Object {
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

object SchemaDate {
  @scala.inline
  def apply(
    day: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): SchemaDate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDate]
  }
}

