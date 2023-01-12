package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneResponse extends StObject {
  
  /**
    * the offset for daylight-savings time in seconds.
    * This will be zero if the time zone is not in Daylight Savings Time during the specified `timestamp`.
    */
  var dstOffset: Double
  
  /** more detailed information about the reasons behind the given status code, if other than `OK`. */
  var errorMessage: String
  
  /** the offset from UTC (in seconds) for the given location. This does not take into effect daylight savings. */
  var rawOffset: Double
  
  /** a string indicating the status of the response. */
  var status: TimeZoneResponseStatus
  
  /**
    * a string containing the ID of the time zone, such as "America/Los_Angeles" or "Australia/Sydney".
    * These IDs are defined by [Unicode Common Locale Data Repository (CLDR) project](http://cldr.unicode.org/),
    * and currently available in file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml).
    * When a timezone has several IDs, the canonical one is returned. In timezone.xml, this is the first alias of each timezone.
    * For example, "Asia/Calcutta" is returned, not "Asia/Kolkata".
    */
  var timeZoneId: String
  
  /**
    * a string containing the long form name of the time zone.
    * This field will be localized if the `language` parameter is set.
    * eg. "Pacific Daylight Time" or "Australian Eastern Daylight Time"
    */
  var timeZoneName: String
}
object TimeZoneResponse {
  
  inline def apply(
    dstOffset: Double,
    errorMessage: String,
    rawOffset: Double,
    status: TimeZoneResponseStatus,
    timeZoneId: String,
    timeZoneName: String
  ): TimeZoneResponse = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], rawOffset = rawOffset.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZoneResponse] (val x: Self) extends AnyVal {
    
    inline def setDstOffset(value: Double): Self = StObject.set(x, "dstOffset", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setRawOffset(value: Double): Self = StObject.set(x, "rawOffset", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TimeZoneResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
  }
}
