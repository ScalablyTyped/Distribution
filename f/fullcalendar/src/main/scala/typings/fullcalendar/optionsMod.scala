package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/options", JSImport.Namespace)
@js.native
object optionsMod extends js.Object {
  def mergeOptions(optionObjs: js.Any): js.Object = js.native
  @js.native
  object englishDefaults extends js.Object {
    var dayPopoverFormat: String = js.native
  }
  
  @js.native
  object globalDefaults extends js.Object {
    var agendaEventMinHeight: Double = js.native
    var allDayText: String = js.native
    var aspectRatio: Double = js.native
    var buttonText: AnonDay = js.native
    var columnHeader: Boolean = js.native
    var dayPopoverFormat: String = js.native
    var defaultAllDayEventDuration: AnonDays = js.native
    var defaultTimedEventDuration: String = js.native
    var defaultView: String = js.native
    var dragOpacity: Double = js.native
    var dragRevertDuration: Double = js.native
    var dragScroll: Boolean = js.native
    var dropAccept: String = js.native
    var endParam: String = js.native
    var eventLimit: Boolean = js.native
    var eventLimitClick: String = js.native
    var eventLimitText: String = js.native
    var eventOrder: String = js.native
    var forceEventDuration: Boolean = js.native
    var handleWindowResize: Boolean = js.native
    var header: AnonCenter = js.native
    var isRTL: Boolean = js.native
    var lazyFetching: Boolean = js.native
    var locale: js.Any = js.native
    var longPressDelay: Double = js.native
    var maxTime: String = js.native
    var minTime: String = js.native
    var monthYearFormat: String = js.native
    var nextDayThreshold: String = js.native
    var scrollTime: String = js.native
    var showNonCurrentDates: Boolean = js.native
    var startParam: String = js.native
    var theme: Boolean = js.native
    var timezone: Boolean = js.native
    var timezoneParam: String = js.native
    var titleRangeSeparator: String = js.native
    var unselectAuto: Boolean = js.native
    var weekNumberCalculation: String = js.native
    var weekNumberTitle: String = js.native
    var weekNumbers: Boolean = js.native
    var weekends: Boolean = js.native
    var windowResizeDelay: Double = js.native
  }
  
  @js.native
  object rtlDefaults extends js.Object {
    var buttonIcons: AnonNext = js.native
    var header: AnonCenter = js.native
    var themeButtonIcons: AnonNextNextYear = js.native
  }
  
}

