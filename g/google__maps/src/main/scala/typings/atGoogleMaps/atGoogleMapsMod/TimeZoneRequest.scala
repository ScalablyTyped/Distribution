package typings.atGoogleMaps.atGoogleMapsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneRequest extends js.Object {
  /**
    * The language in which to return results.
    * Note that we often update supported languages so this list may not be exhaustive.
    *
    * @default Language.English
    */
  var language: js.UndefOr[Language] = js.undefined
  /** a comma-separated `lat,lng` tuple (eg. `location=-33.86,151.20`), representing the location to look up. */
  var location: LatLng
  /**
    * specifies the desired time as seconds since midnight, January 1, 1970 UTC.
    * The Time Zone API uses the timestamp to determine whether or not Daylight Savings should be applied,
    * based on the time zone of the location. Note that the API does not take historical time zones into account.
    * That is, if you specify a past timestamp, the API does not take into account the possibility that
    * the location was previously in a different time zone.
    */
  var timestamp: js.UndefOr[Date | Double] = js.undefined
}

object TimeZoneRequest {
  @scala.inline
  def apply(location: LatLng, language: Language = null, timestamp: Date | Double = null): TimeZoneRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneRequest]
  }
}

