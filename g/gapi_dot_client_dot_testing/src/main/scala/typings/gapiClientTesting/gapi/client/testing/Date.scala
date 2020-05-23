package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
    * if specifying a year/month where the day is not significant.
    */
  var day: js.UndefOr[Double] = js.undefined
  /** Month of year. Must be from 1 to 12. */
  var month: js.UndefOr[Double] = js.undefined
  /**
    * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
    * a year.
    */
  var year: js.UndefOr[Double] = js.undefined
}

object Date {
  @scala.inline
  def apply(
    day: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): Date = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

