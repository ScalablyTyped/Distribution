package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneResponse extends js.Object {
  
  /**
    * the offset for daylight-savings time in seconds.
    * This will be zero if the time zone is not in Daylight Savings Time during the specified `timestamp`.
    */
  var dstOffset: Double = js.native
  
  /** more detailed information about the reasons behind the given status code, if other than `OK`. */
  var errorMessage: String = js.native
  
  /** the offset from UTC (in seconds) for the given location. This does not take into effect daylight savings. */
  var rawOffset: Double = js.native
  
  /** a string indicating the status of the response. */
  var status: TimeZoneResponseStatus = js.native
  
  /**
    * a string containing the ID of the time zone, such as "America/Los_Angeles" or "Australia/Sydney".
    * These IDs are defined by [Unicode Common Locale Data Repository (CLDR) project](http://cldr.unicode.org/),
    * and currently available in file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml).
    * When a timezone has several IDs, the canonical one is returned. In timezone.xml, this is the first alias of each timezone.
    * For example, "Asia/Calcutta" is returned, not "Asia/Kolkata".
    */
  var timeZoneId: String = js.native
  
  /**
    * a string containing the long form name of the time zone.
    * This field will be localized if the `language` parameter is set.
    * eg. "Pacific Daylight Time" or "Australian Eastern Daylight Time"
    */
  var timeZoneName: String = js.native
}
object TimeZoneResponse {
  
  @scala.inline
  def apply(
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
  implicit class TimeZoneResponseOps[Self <: TimeZoneResponse] (val x: Self) extends AnyVal {
    
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
    def setDstOffset(value: Double): Self = this.set("dstOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawOffset(value: Double): Self = this.set("rawOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TimeZoneResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneId(value: String): Self = this.set("timeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: String): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
  }
}
