package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneRequest extends StObject {
  
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
  var timestamp: js.UndefOr[js.Date | Double] = js.undefined
}
object TimeZoneRequest {
  
  inline def apply(location: LatLng): TimeZoneRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZoneRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
