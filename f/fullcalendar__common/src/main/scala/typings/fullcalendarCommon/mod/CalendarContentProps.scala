package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarContentProps
  extends StObject
     with CalendarData {
  
  var forPrint: Boolean
  
  var isHeightAuto: Boolean
}
object CalendarContentProps {
  
  inline def apply(
    availableRawLocales: Any,
    businessHours: EventStore,
    calendarApi: CalendarApi,
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
    forPrint: Boolean,
    getCurrentData: () => CalendarData,
    isHeightAuto: Boolean,
    localeDefaults: CalendarOptions,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    renderableEventStore: EventStore,
    selectionConfig: EventUi,
    theme: Theme,
    toolbarConfig: Any,
    viewApi: ViewApi,
    viewSpec: ViewSpec,
    viewSpecs: ViewSpecHash,
    viewTitle: String
  ): CalendarContentProps = {
    val __obj = js.Dynamic.literal(availableRawLocales = availableRawLocales.asInstanceOf[js.Any], businessHours = businessHours.asInstanceOf[js.Any], calendarApi = calendarApi.asInstanceOf[js.Any], calendarOptions = calendarOptions.asInstanceOf[js.Any], currentDate = currentDate.asInstanceOf[js.Any], currentViewType = currentViewType.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), dynamicOptionOverrides = dynamicOptionOverrides.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventSources = eventSources.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], getCurrentData = js.Any.fromFunction0(getCurrentData), isHeightAuto = isHeightAuto.asInstanceOf[js.Any], localeDefaults = localeDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], renderableEventStore = renderableEventStore.asInstanceOf[js.Any], selectionConfig = selectionConfig.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toolbarConfig = toolbarConfig.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any], viewSpecs = viewSpecs.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[CalendarContentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarContentProps] (val x: Self) extends AnyVal {
    
    inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
    
    inline def setIsHeightAuto(value: Boolean): Self = StObject.set(x, "isHeightAuto", value.asInstanceOf[js.Any])
  }
}
