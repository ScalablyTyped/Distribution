package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat extends StObject {
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var liveSearch: js.UndefOr[Boolean] = js.undefined
  
  var timezoneOffset: js.UndefOr[Double] = js.undefined
  
  var weekOffset: js.UndefOr[Double] = js.undefined
}
object DateFormat {
  
  inline def apply(): DateFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormat]
  }
  
  extension [Self <: DateFormat](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setLiveSearch(value: Boolean): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
    
    inline def setLiveSearchUndefined: Self = StObject.set(x, "liveSearch", js.undefined)
    
    inline def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
    
    inline def setWeekOffset(value: Double): Self = StObject.set(x, "weekOffset", value.asInstanceOf[js.Any])
    
    inline def setWeekOffsetUndefined: Self = StObject.set(x, "weekOffset", js.undefined)
  }
}
