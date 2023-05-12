package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDataBase
  extends StObject
     with CalendarOptionsData
     with CalendarCurrentViewData
     with CalendarDataManagerState
object CalendarDataBase {
  
  inline def apply(
    availableRawLocales: Any,
    businessHours: EventStore,
    calendarOptions: CalendarOptionsRefined,
    currentDate: js.Date,
    currentViewType: String,
    dateEnv: DateEnv,
    dateProfile: DateProfile,
    dateProfileGenerator: DateProfileGenerator,
    dynamicOptionOverrides: CalendarOptions,
    eventSelection: String,
    eventSources: EventSourceHash,
    eventStore: EventStore,
    eventUiBases: EventUiHash,
    localeDefaults: CalendarOptions,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    renderableEventStore: EventStore,
    selectionConfig: EventUi,
    theme: Theme,
    toolbarConfig: Any,
    viewApi: ViewImpl,
    viewSpec: ViewSpec,
    viewSpecs: ViewSpecHash
  ): CalendarDataBase = {
    val __obj = js.Dynamic.literal(availableRawLocales = availableRawLocales.asInstanceOf[js.Any], businessHours = businessHours.asInstanceOf[js.Any], calendarOptions = calendarOptions.asInstanceOf[js.Any], currentDate = currentDate.asInstanceOf[js.Any], currentViewType = currentViewType.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dynamicOptionOverrides = dynamicOptionOverrides.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventSources = eventSources.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], localeDefaults = localeDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], renderableEventStore = renderableEventStore.asInstanceOf[js.Any], selectionConfig = selectionConfig.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toolbarConfig = toolbarConfig.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any], viewSpecs = viewSpecs.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[CalendarDataBase]
  }
}
