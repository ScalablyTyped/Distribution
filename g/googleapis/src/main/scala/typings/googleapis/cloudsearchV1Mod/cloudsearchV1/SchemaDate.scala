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
  def apply(): SchemaDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDate]
  }
  @scala.inline
  implicit class SchemaDateOps[Self <: SchemaDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

