package typings.gapiUrlshortener.anon

import typings.gapiUrlshortener.GoogleApiUrlShortenerUrlResourceAnalyticsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllTime extends js.Object {
  /**
    * Click analytics over all time.
    */
  var allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last day.
    */
  var day: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last month.
    */
  var month: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last two hours.
    */
  var twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
  /**
    * Click analytics over the last week.
    */
  var week: GoogleApiUrlShortenerUrlResourceAnalyticsObject = js.native
}

object AllTime {
  @scala.inline
  def apply(
    allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    day: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    month: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  ): AllTime = {
    val __obj = js.Dynamic.literal(allTime = allTime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], twoHours = twoHours.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTime]
  }
  @scala.inline
  implicit class AllTimeOps[Self <: AllTime] (val x: Self) extends AnyVal {
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
    def setAllTime(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = this.set("allTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoHours(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = this.set("twoHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = this.set("week", value.asInstanceOf[js.Any])
  }
  
}

