package typings.googleMaps.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneRequest extends js.Object {
  
  /**
    * The language in which to return results.
    * Note that we often update supported languages so this list may not be exhaustive.
    *
    * @default Language.English
    */
  var language: js.UndefOr[Language] = js.native
  
  /** a comma-separated `lat,lng` tuple (eg. `location=-33.86,151.20`), representing the location to look up. */
  var location: LatLng = js.native
  
  /**
    * specifies the desired time as seconds since midnight, January 1, 1970 UTC.
    * The Time Zone API uses the timestamp to determine whether or not Daylight Savings should be applied,
    * based on the time zone of the location. Note that the API does not take historical time zones into account.
    * That is, if you specify a past timestamp, the API does not take into account the possibility that
    * the location was previously in a different time zone.
    */
  var timestamp: js.UndefOr[Date | Double] = js.native
}
object TimeZoneRequest {
  
  @scala.inline
  def apply(location: LatLng): TimeZoneRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneRequest]
  }
  
  @scala.inline
  implicit class TimeZoneRequestOps[Self <: TimeZoneRequest] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date | Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
