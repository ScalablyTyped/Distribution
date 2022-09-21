package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.AvailableLocaleData
import typings.fullcalendarCommon.anon.Extra
import typings.fullcalendarCommon.anon.RequiredRefinedOptionsFro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "CalendarDataManager")
@js.native
open class CalendarDataManager protected () extends StObject {
  def this(props: CalendarDataManagerProps) = this()
  
  def _computeCurrentViewData(
    viewType: String,
    optionsData: CalendarOptionsData,
    optionOverrides: CalendarOptions,
    dynamicOptionOverrides: CalendarOptions
  ): CalendarCurrentViewData = js.native
  
  def _computeOptionsData(
    optionOverrides: CalendarOptions,
    dynamicOptionOverrides: CalendarOptions,
    calendarApi: CalendarApi
  ): CalendarOptionsData = js.native
  
  def _handleAction(action: Action): Unit = js.native
  
  /* private */ var actionRunner: Any = js.native
  
  /* private */ var buildDateEnv: Any = js.native
  
  /* private */ var buildDateProfileGenerator: Any = js.native
  
  /* private */ var buildEventUiBases: Any = js.native
  
  /* private */ var buildEventUiBySource: Any = js.native
  
  /* private */ var buildLocale: Any = js.native
  
  /* private */ var buildPluginHooks: Any = js.native
  
  /* private */ var buildTheme: Any = js.native
  
  /* private */ var buildTitle: Any = js.native
  
  /* private */ var buildViewApi: Any = js.native
  
  /* private */ var buildViewSpecs: Any = js.native
  
  /* private */ var buildViewUiProps: Any = js.native
  
  /* private */ var computeCurrentViewData: Any = js.native
  
  /* private */ var computeOptionsData: Any = js.native
  
  var currentCalendarOptionsInput: CalendarOptions = js.native
  
  /* private */ var currentCalendarOptionsRefined: Any = js.native
  
  var currentCalendarOptionsRefiners: Any = js.native
  
  /* private */ var currentViewOptionsInput: Any = js.native
  
  /* private */ var currentViewOptionsRefined: Any = js.native
  
  /* private */ var data: Any = js.native
  
  def dispatch(action: Action): Unit = js.native
  
  var emitter: Emitter[RequiredRefinedOptionsFro] = js.native
  
  def getCurrentData(): CalendarData = js.native
  
  /* private */ var organizeRawLocales: Any = js.native
  
  /* private */ var parseContextBusinessHours: Any = js.native
  
  /* private */ var parseToolbars: Any = js.native
  
  def processRawCalendarOptions(optionOverrides: CalendarOptions, dynamicOptionOverrides: CalendarOptions): AvailableLocaleData = js.native
  
  def processRawViewOptions(
    viewSpec: ViewSpec,
    pluginHooks: PluginHooks,
    localeDefaults: CalendarOptions,
    optionOverrides: CalendarOptions,
    dynamicOptionOverrides: CalendarOptions
  ): Extra = js.native
  
  /* private */ var props: Any = js.native
  
  def resetOptions(optionOverrides: CalendarOptions): Unit = js.native
  def resetOptions(optionOverrides: CalendarOptions, append: Boolean): Unit = js.native
  
  /* private */ var state: Any = js.native
  
  def updateData(): Unit = js.native
}
