package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneResponse extends js.Object {
  /**
    * the offset for daylight-savings time in seconds.
    * This will be zero if the time zone is not in Daylight Savings Time during the specified `timestamp`.
    */
  var dstOffset: scala.Double
  /** more detailed information about the reasons behind the given status code, if other than `OK`. */
  var errorMessage: java.lang.String
  /** the offset from UTC (in seconds) for the given location. This does not take into effect daylight savings. */
  var rawOffset: scala.Double
  /** a string indicating the status of the response. */
  var status: TimeZoneResponseStatus
  /**
    * a string containing the ID of the time zone, such as "America/Los_Angeles" or "Australia/Sydney".
    * These IDs are defined by [Unicode Common Locale Data Repository (CLDR) project](http://cldr.unicode.org/),
    * and currently available in file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml).
    * When a timezone has several IDs, the canonical one is returned. In timezone.xml, this is the first alias of each timezone.
    * For example, "Asia/Calcutta" is returned, not "Asia/Kolkata".
    */
  var timeZoneId: java.lang.String
  /**
    * a string containing the long form name of the time zone.
    * This field will be localized if the `language` parameter is set.
    * eg. "Pacific Daylight Time" or "Australian Eastern Daylight Time"
    */
  var timeZoneName: java.lang.String
}

object TimeZoneResponse {
  @scala.inline
  def apply(
    dstOffset: scala.Double,
    errorMessage: java.lang.String,
    rawOffset: scala.Double,
    status: TimeZoneResponseStatus,
    timeZoneId: java.lang.String,
    timeZoneName: java.lang.String
  ): TimeZoneResponse = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset, errorMessage = errorMessage, rawOffset = rawOffset, status = status, timeZoneId = timeZoneId, timeZoneName = timeZoneName)
  
    __obj.asInstanceOf[TimeZoneResponse]
  }
}

