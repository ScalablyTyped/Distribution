package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarData
  extends StObject
     with CalendarDataBase {
  
  var calendarApi: CalendarImpl
  
  def dispatch(action: Action): Unit
  
  var emitter: Emitter[CalendarListeners]
  
  def getCurrentData(): CalendarData
  
  var viewTitle: String
}
object CalendarData {
  
  inline def apply(
    availableRawLocales: Any,
    businessHours: EventStore,
    calendarApi: CalendarImpl,
    calendarOptions: CalendarOptionsRefined,
    currentDate: js.Date,
    currentViewType: String,
    dateEnv: DateEnv,
    dateProfile: DateProfile,
    dateProfileGenerator: DateProfileGenerator,
    dispatch: Action => Unit,
    dynamicOptionOverrides: CalendarOptions,
    emitter: Emitter[CalendarListeners],
    eventSelection: String,
    eventSources: EventSourceHash,
    eventStore: EventStore,
    eventUiBases: EventUiHash,
    getCurrentData: () => CalendarData,
    localeDefaults: CalendarOptions,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    renderableEventStore: EventStore,
    selectionConfig: EventUi,
    theme: Theme,
    toolbarConfig: Any,
    viewApi: ViewImpl,
    viewSpec: ViewSpec,
    viewSpecs: ViewSpecHash,
    viewTitle: String
  ): CalendarData = {
    val __obj = js.Dynamic.literal(availableRawLocales = availableRawLocales.asInstanceOf[js.Any], businessHours = businessHours.asInstanceOf[js.Any], calendarApi = calendarApi.asInstanceOf[js.Any], calendarOptions = calendarOptions.asInstanceOf[js.Any], currentDate = currentDate.asInstanceOf[js.Any], currentViewType = currentViewType.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), dynamicOptionOverrides = dynamicOptionOverrides.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventSources = eventSources.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], getCurrentData = js.Any.fromFunction0(getCurrentData), localeDefaults = localeDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], renderableEventStore = renderableEventStore.asInstanceOf[js.Any], selectionConfig = selectionConfig.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toolbarConfig = toolbarConfig.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any], viewSpecs = viewSpecs.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[CalendarData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarData] (val x: Self) extends AnyVal {
    
    inline def setCalendarApi(value: CalendarImpl): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Action => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentData(value: () => CalendarData): Self = StObject.set(x, "getCurrentData", js.Any.fromFunction0(value))
    
    inline def setViewTitle(value: String): Self = StObject.set(x, "viewTitle", value.asInstanceOf[js.Any])
  }
}
