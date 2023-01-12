package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.fullcalendarCommonStrings.long
import typings.fullcalendarCommon.fullcalendarCommonStrings.lowercase
import typings.fullcalendarCommon.fullcalendarCommonStrings.narrow
import typings.fullcalendarCommon.fullcalendarCommonStrings.numeric
import typings.fullcalendarCommon.fullcalendarCommonStrings.short
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeFormatterOptions
  extends StObject
     with DateTimeFormatOptions {
  
  var meridiem: js.UndefOr[lowercase | short | narrow | Boolean] = js.undefined
  
  var omitCommas: js.UndefOr[Boolean] = js.undefined
  
  var omitZeroMinute: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var week: js.UndefOr[long | short | narrow | numeric] = js.undefined
}
object NativeFormatterOptions {
  
  inline def apply(): NativeFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeFormatterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeFormatterOptions] (val x: Self) extends AnyVal {
    
    inline def setMeridiem(value: lowercase | short | narrow | Boolean): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    inline def setMeridiemUndefined: Self = StObject.set(x, "meridiem", js.undefined)
    
    inline def setOmitCommas(value: Boolean): Self = StObject.set(x, "omitCommas", value.asInstanceOf[js.Any])
    
    inline def setOmitCommasUndefined: Self = StObject.set(x, "omitCommas", js.undefined)
    
    inline def setOmitZeroMinute(value: Boolean): Self = StObject.set(x, "omitZeroMinute", value.asInstanceOf[js.Any])
    
    inline def setOmitZeroMinuteUndefined: Self = StObject.set(x, "omitZeroMinute", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setWeek(value: long | short | narrow | numeric): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
