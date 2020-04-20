package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllTime extends js.Object {
  /**
    * Click analytics over all time.
    */
  var allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  /**
    * Click analytics over the last day.
    */
  var day: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  /**
    * Click analytics over the last month.
    */
  var month: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  /**
    * Click analytics over the last two hours.
    */
  var twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  /**
    * Click analytics over the last week.
    */
  var week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
}

object AnonAllTime {
  @scala.inline
  def apply(
    allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    day: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    month: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  ): AnonAllTime = {
    val __obj = js.Dynamic.literal(allTime = allTime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], twoHours = twoHours.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllTime]
  }
}

