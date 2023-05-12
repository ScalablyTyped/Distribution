package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarContext extends StObject {
  
  var calendarApi: CalendarImpl
  
  var dateEnv: DateEnv
  
  def dispatch(action: Action): Unit
  
  var emitter: Emitter[CalendarListeners]
  
  def getCurrentData(): CalendarData
  
  var options: BaseOptionsRefined
  
  var pluginHooks: PluginHooks
}
object CalendarContext {
  
  inline def apply(
    calendarApi: CalendarImpl,
    dateEnv: DateEnv,
    dispatch: Action => Unit,
    emitter: Emitter[CalendarListeners],
    getCurrentData: () => CalendarData,
    options: BaseOptionsRefined,
    pluginHooks: PluginHooks
  ): CalendarContext = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), emitter = emitter.asInstanceOf[js.Any], getCurrentData = js.Any.fromFunction0(getCurrentData), options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarContext] (val x: Self) extends AnyVal {
    
    inline def setCalendarApi(value: CalendarImpl): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Action => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentData(value: () => CalendarData): Self = StObject.set(x, "getCurrentData", js.Any.fromFunction0(value))
    
    inline def setOptions(value: BaseOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPluginHooks(value: PluginHooks): Self = StObject.set(x, "pluginHooks", value.asInstanceOf[js.Any])
  }
}
