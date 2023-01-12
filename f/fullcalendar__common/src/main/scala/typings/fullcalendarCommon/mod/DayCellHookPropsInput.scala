package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayCellHookPropsInput extends StObject {
  
  var date: js.Date
  
  var dateEnv: DateEnv
  
  var dateProfile: DateProfile
  
  var extraProps: js.UndefOr[Dictionary] = js.undefined
  
  var showDayNumber: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
  
  var viewApi: ViewApi
}
object DayCellHookPropsInput {
  
  inline def apply(date: js.Date, dateEnv: DateEnv, dateProfile: DateProfile, todayRange: DateRange, viewApi: ViewApi): DayCellHookPropsInput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellHookPropsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayCellHookPropsInput] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setExtraProps(value: Dictionary): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
    
    inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
    
    inline def setShowDayNumber(value: Boolean): Self = StObject.set(x, "showDayNumber", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumberUndefined: Self = StObject.set(x, "showDayNumber", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
  }
}
