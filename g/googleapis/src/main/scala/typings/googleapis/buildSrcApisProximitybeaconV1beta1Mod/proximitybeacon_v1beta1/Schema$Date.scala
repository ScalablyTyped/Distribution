package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a whole or partial calendar date, e.g. a birthday. The time of
  * day and time zone are either specified elsewhere or are not significant.
  * The date is relative to the Proleptic Gregorian Calendar. This can
  * represent:  * A full date, with non-zero year, month and day values * A
  * month and day value, with a zero year, e.g. an anniversary * A year on its
  * own, with zero month and day values * A year and month value, with a zero
  * day, e.g. a credit card expiration date  Related types are
  * google.type.TimeOfDay and `google.protobuf.Timestamp`.
  */
@js.native
trait Schema$Date extends js.Object {
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
    * if specifying a year by itself or a year and month where the day is not
    * significant.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Month of year. Must be from 1 to 12, or 0 if specifying a year without a
    * month and day.
    */
  var month: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a
    * year.
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

