package typings
package gapiDotUrlshortenerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllTime extends js.Object {
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

object Anon_AllTime {
  @scala.inline
  def apply(
    allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    day: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    month: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
    week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  ): Anon_AllTime = {
    val __obj = js.Dynamic.literal(allTime = allTime, day = day, month = month, twoHours = twoHours, week = week)
  
    __obj.asInstanceOf[Anon_AllTime]
  }
}

