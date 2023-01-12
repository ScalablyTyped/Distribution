package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NowTimerState extends StObject {
  
  var nowDate: js.Date
  
  var todayRange: DateRange
}
object NowTimerState {
  
  inline def apply(nowDate: js.Date, todayRange: DateRange): NowTimerState = {
    val __obj = js.Dynamic.literal(nowDate = nowDate.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowTimerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NowTimerState] (val x: Self) extends AnyVal {
    
    inline def setNowDate(value: js.Date): Self = StObject.set(x, "nowDate", value.asInstanceOf[js.Any])
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
