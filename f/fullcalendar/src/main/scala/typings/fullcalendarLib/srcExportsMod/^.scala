package typings
package fullcalendarLib.srcExportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/exports", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val dayIDs: js.Array[java.lang.String] = js.native
  val internalApiVersion: fullcalendarLib.fullcalendarLibNumbers.`12` = js.native
  val moment: js.Any = js.native
  val unitsDesc: js.Array[java.lang.String] = js.native
  val version: fullcalendarLib.fullcalendarLibStrings.`<%= version %>` = js.native
  def allowSelection(el: js.Any): scala.Unit = js.native
  def applyAll(functions: js.Any, thisObj: js.Any, args: js.Any): js.Any = js.native
  def attrsToStr(attrs: js.Any): java.lang.String = js.native
  def capitaliseFirstLetter(str: js.Any): js.Any = js.native
  def compareByFieldSpec(obj1: js.Any, obj2: js.Any, fieldSpec: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def compareNumbers(a: js.Any, b: js.Any): scala.Double = js.native
  def compensateScroll(rowEls: js.Any, scrollbarWidths: js.Any): scala.Unit = js.native
  def computeDurationGreatestUnit(duration: js.Any, durationInput: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any, end: js.Any): js.Any = js.native
  def constrainPoint(point: js.Any, rect: js.Any): fullcalendarLib.Anon_Left = js.native
  def copyOwnProps(src: js.Any, dest: js.Any): scala.Unit = js.native
  def cssToStr(cssProps: js.Any): java.lang.String = js.native
  def datepickerLocale(localeCode: js.Any, dpLocaleCode: js.Any, dpOptions: js.Any): scala.Unit = js.native
  def debounce(func: js.Any, wait: js.Any): js.Function0[_] = js.native
  def debounce(func: js.Any, wait: js.Any, immediate: scala.Boolean): js.Function0[_] = js.native
  def defineThemeSystem(themeName: js.Any, themeClass: js.Any): scala.Unit = js.native
  def defineView(viewName: js.Any, viewConfig: js.Any): scala.Unit = js.native
  def diffByUnit(a: js.Any, b: js.Any, unit: js.Any): momentLib.momentMod.Duration = js.native
  def diffDay(a: js.Any, b: js.Any): momentLib.momentMod.Duration = js.native
  def diffDayTime(a: js.Any, b: js.Any): momentLib.momentMod.Duration = js.native
  def diffPoints(point1: js.Any, point2: js.Any): fullcalendarLib.Anon_Left = js.native
  def disableCursor(): scala.Unit = js.native
  def distributeHeight(els: js.Any, availableHeight: js.Any, shouldRedistribute: js.Any): scala.Unit = js.native
  def divideDurationByDuration(dur1: js.Any, dur2: js.Any): scala.Double = js.native
  def divideRangeByDuration(start: js.Any, end: js.Any, dur: js.Any): scala.Double = js.native
  def durationHasTime(dur: js.Any): scala.Boolean = js.native
  def enableCursor(): scala.Unit = js.native
  def eventDefsToEventInstances(eventDefs: js.Any, unzonedRange: js.Any): js.Array[_] = js.native
  def eventFootprintToComponentFootprint(eventFootprint: js.Any): js.Any = js.native
  def eventInstanceToEventRange(eventInstance: js.Any): fullcalendarLib.eventRangeMod.default = js.native
  def eventInstanceToUnzonedRange(eventInstance: js.Any): js.Any = js.native
  def eventRangeToEventFootprint(eventRange: js.Any): fullcalendarLib.eventFootprintMod.default = js.native
  def firstDefined(args: js.Any*): js.Any = js.native
  def flexibleCompare(a: js.Any, b: js.Any): scala.Double = js.native
  def formatDate(date: js.Any, formatStr: js.Any): js.Any = js.native
  def formatRange(date1: js.Any, date2: js.Any, formatStr: js.Any, separator: js.Any, isRTL: js.Any): js.Any = js.native
  def getClientRect(el: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getClientRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getContentRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getEvIsTouch(ev: js.Any): scala.Boolean = js.native
  def getEvX(ev: js.Any): js.Any = js.native
  def getEvY(ev: js.Any): js.Any = js.native
  def getMomentLocaleData(localeCode: js.Any): momentLib.momentMod.Locale = js.native
  def getOuterRect(el: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getOuterRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getRectCenter(rect: js.Any): fullcalendarLib.Anon_Left = js.native
  def getScrollParent(el: js.Any): js.Any = js.native
  def getScrollbarWidths(el: js.Any): js.Any = js.native
  def getThemeSystemClass(themeSetting: js.Any): js.Any = js.native
  def getViewConfig(viewName: js.Any): js.Any = js.native
  def hasOwnProp(obj: js.Any, name: js.Any): js.Any = js.native
  def htmlEscape(s: js.Any): java.lang.String = js.native
  def intersectRects(rect1: js.Any, rect2: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.Anon_BottomLeft = js.native
  def isArraysEqual(a0: js.Any, a1: js.Any): scala.Boolean = js.native
  def isInt(n: js.Any): scala.Boolean = js.native
  def isNativeDate(input: js.Any): scala.Boolean = js.native
  def isPrimaryMouseButton(ev: js.Any): scala.Boolean = js.native
  def isTimeString(str: js.Any): scala.Boolean = js.native
  def locale(localeCode: js.Any, newFcOptions: js.Any): scala.Unit = js.native
  def log(args: js.Any*): js.Any = js.native
  def matchCellWidths(els: js.Any): scala.Double = js.native
  def mergeProps(propObjs: js.Any): js.Object = js.native
  def mergeProps(propObjs: js.Any, complexProps: js.Any): js.Object = js.native
  def multiplyDuration(dur: js.Any, n: js.Any): momentLib.momentMod.Duration = js.native
  def parseFieldSpecs(input: js.Any): js.Array[_] = js.native
  def populateInstanceComputableOptions(options: js.Any): scala.Unit = js.native
  def preventDefault(ev: js.Any): scala.Unit = js.native
  def preventSelection(el: js.Any): scala.Unit = js.native
  def proxy(obj: js.Any, methodName: js.Any): js.Function0[_] = js.native
  def queryMostGranularFormatUnit(formatStr: js.Any): js.Any = js.native
  def removeExact(array: js.Any, exactVal: js.Any): scala.Double = js.native
  def removeMatching(array: js.Any, testFunc: js.Any): scala.Double = js.native
  def stripHtmlEntities(text: js.Any): js.Any = js.native
  def subtractInnerElHeight(outerEl: js.Any, innerEl: js.Any): js.Any = js.native
  def uncompensateScroll(rowEls: js.Any): scala.Unit = js.native
  def undistributeHeight(els: js.Any): scala.Unit = js.native
  def warn(args: js.Any*): js.Any = js.native
}

