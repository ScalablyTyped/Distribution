package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewUploadOptionalArgs extends StObject {
  
  /** File locale, specified in ISO format. Affects how numbers and dates are parsed. Defaults to en_US. See a full list in Supported Locales. */
  var fileLocale: js.UndefOr[String] = js.undefined
  
  /** Whether or not to represent money in micros ('1370000') or in currency ('1.37'). Defaults to true. */
  var moneyInMicros: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time zone to use for dates. No default. The following formats are supported:
    *
    * A timezone in tz database (e.g. America/Los_Angeles etc.). See a full list in List of tz database time zones;
    *
    * Standard offsets in the form [+-]hhmm (e.g. +0800, -0500).
    *
    * **NOTE:** this field is required for offline conversion uploads.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object NewUploadOptionalArgs {
  
  inline def apply(): NewUploadOptionalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUploadOptionalArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewUploadOptionalArgs] (val x: Self) extends AnyVal {
    
    inline def setFileLocale(value: String): Self = StObject.set(x, "fileLocale", value.asInstanceOf[js.Any])
    
    inline def setFileLocaleUndefined: Self = StObject.set(x, "fileLocale", js.undefined)
    
    inline def setMoneyInMicros(value: Boolean): Self = StObject.set(x, "moneyInMicros", value.asInstanceOf[js.Any])
    
    inline def setMoneyInMicrosUndefined: Self = StObject.set(x, "moneyInMicros", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
