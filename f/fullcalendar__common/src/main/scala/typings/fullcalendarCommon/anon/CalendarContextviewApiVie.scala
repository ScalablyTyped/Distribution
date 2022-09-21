package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.BaseOptionsRefined
import typings.fullcalendarCommon.mod.CalendarApi
import typings.fullcalendarCommon.mod.CalendarData
import typings.fullcalendarCommon.mod.CalendarListeners
import typings.fullcalendarCommon.mod.DateEnv
import typings.fullcalendarCommon.mod.Emitter
import typings.fullcalendarCommon.mod.PluginHooks
import typings.fullcalendarCommon.mod.ViewApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.CalendarContext & {  viewApi :@fullcalendar/common.@fullcalendar/common.ViewApi | undefined} */
trait CalendarContextviewApiVie extends StObject {
  
  var calendarApi: CalendarApi
  
  var dateEnv: DateEnv
  
  def dispatch(action: Action): scala.Unit
  
  var emitter: Emitter[CalendarListeners]
  
  def getCurrentData(): CalendarData
  
  var options: BaseOptionsRefined
  
  var pluginHooks: PluginHooks
  
  var viewApi: js.UndefOr[ViewApi] = js.undefined
}
object CalendarContextviewApiVie {
  
  inline def apply(
    calendarApi: CalendarApi,
    dateEnv: DateEnv,
    dispatch: Action => scala.Unit,
    emitter: Emitter[CalendarListeners],
    getCurrentData: () => CalendarData,
    options: BaseOptionsRefined,
    pluginHooks: PluginHooks
  ): CalendarContextviewApiVie = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), emitter = emitter.asInstanceOf[js.Any], getCurrentData = js.Any.fromFunction0(getCurrentData), options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarContextviewApiVie]
  }
  
  extension [Self <: CalendarContextviewApiVie](x: Self) {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Action => scala.Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentData(value: () => CalendarData): Self = StObject.set(x, "getCurrentData", js.Any.fromFunction0(value))
    
    inline def setOptions(value: BaseOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPluginHooks(value: PluginHooks): Self = StObject.set(x, "pluginHooks", value.asInstanceOf[js.Any])
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
    
    inline def setViewApiUndefined: Self = StObject.set(x, "viewApi", js.undefined)
  }
}
