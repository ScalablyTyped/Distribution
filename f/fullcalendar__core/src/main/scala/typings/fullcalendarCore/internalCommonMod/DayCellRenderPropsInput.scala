package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayCellRenderPropsInput extends StObject {
  
  var date: js.Date
  
  var dateEnv: DateEnv
  
  var dateProfile: DateProfile
  
  var extraRenderProps: js.UndefOr[Dictionary] = js.undefined
  
  var isMonthStart: Boolean
  
  var monthStartFormat: DateFormatter
  
  var showDayNumber: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
  
  var viewApi: ViewApi
}
object DayCellRenderPropsInput {
  
  inline def apply(
    date: js.Date,
    dateEnv: DateEnv,
    dateProfile: DateProfile,
    isMonthStart: Boolean,
    monthStartFormat: DateFormatter,
    todayRange: DateRange,
    viewApi: ViewApi
  ): DayCellRenderPropsInput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], isMonthStart = isMonthStart.asInstanceOf[js.Any], monthStartFormat = monthStartFormat.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellRenderPropsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayCellRenderPropsInput] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setExtraRenderProps(value: Dictionary): Self = StObject.set(x, "extraRenderProps", value.asInstanceOf[js.Any])
    
    inline def setExtraRenderPropsUndefined: Self = StObject.set(x, "extraRenderProps", js.undefined)
    
    inline def setIsMonthStart(value: Boolean): Self = StObject.set(x, "isMonthStart", value.asInstanceOf[js.Any])
    
    inline def setMonthStartFormat(value: DateFormatter): Self = StObject.set(x, "monthStartFormat", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumber(value: Boolean): Self = StObject.set(x, "showDayNumber", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumberUndefined: Self = StObject.set(x, "showDayNumber", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
  }
}
