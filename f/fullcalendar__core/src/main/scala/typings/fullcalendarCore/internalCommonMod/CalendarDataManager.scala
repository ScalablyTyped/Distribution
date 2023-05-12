package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.AvailableLocaleData
import typings.fullcalendarCore.anon.RawOptions
import typings.fullcalendarCore.anon.RequiredRefinedOptionsFro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDataManager extends StObject {
  
  def _computeCurrentViewData(
    viewType: String,
    optionsData: CalendarOptionsData,
    optionOverrides: CalendarOptions,
    dynamicOptionOverrides: CalendarOptions
  ): CalendarCurrentViewData = js.native
  
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
  
  def computeOptionsData(
    optionOverrides: CalendarOptions,
    dynamicOptionOverrides: CalendarOptions,
    calendarApi: CalendarImpl
  ): CalendarOptionsData = js.native
  
  var currentCalendarOptionsInput: CalendarOptions = js.native
  
  /* private */ var currentCalendarOptionsRefined: Any = js.native
  
  var currentCalendarOptionsRefiners: Any = js.native
  
  /* private */ var currentViewOptionsInput: Any = js.native
  
  /* private */ var currentViewOptionsRefined: Any = js.native
  
  /* private */ var data: Any = js.native
  
  def dispatch(action: Action): Unit = js.native
  
  var emitter: Emitter[RequiredRefinedOptionsFro] = js.native
  
  def getCurrentData(): CalendarData = js.native
  
  /* private */ var optionsForHandling: Any = js.native
  
  /* private */ var optionsForRefining: Any = js.native
  
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
  ): RawOptions = js.native
  
  /* private */ var props: Any = js.native
  
  def resetOptions(optionOverrides: CalendarOptions): Unit = js.native
  def resetOptions(optionOverrides: CalendarOptions, changedOptionNames: js.Array[String]): Unit = js.native
  
  /* private */ var stableCalendarOptionsData: Any = js.native
  
  /* private */ var stableDynamicOptionOverrides: Any = js.native
  
  /* private */ var stableOptionOverrides: Any = js.native
  
  /* private */ var state: Any = js.native
  
  def updateData(): Unit = js.native
}
