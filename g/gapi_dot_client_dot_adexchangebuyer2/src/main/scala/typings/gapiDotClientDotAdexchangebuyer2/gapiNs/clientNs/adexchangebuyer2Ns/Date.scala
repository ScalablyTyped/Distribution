package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

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
  def apply(day: Int | Double = null, month: Int | Double = null, year: Int | Double = null): Date = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

