package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A calendar date broken down into year, month, and day. */
trait GoogleAdsDate extends StObject {
  
  /** The year for this date. */
  var day: Double
  
  /** The month index for this date, where 1 corresponds to January, 2 to February, and so on. */
  var month: Double
  
  /** The day of month (1 to 31) for this date. */
  var year: Double
}
object GoogleAdsDate {
  
  inline def apply(day: Double, month: Double, year: Double): GoogleAdsDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAdsDate]
  }
  
  extension [Self <: GoogleAdsDate](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
