package typings
package fullcalendarLib.fullcalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar", JSImport.Namespace)
@js.native
object fullcalendarModMembers extends js.Object {
  val EventSourceParser: fullcalendarLib.Anon_Calendar = js.native
  val Promise: fullcalendarLib.Anon_Construct = js.native
  val internalApiVersion: /* 12 */ scala.Double = js.native
  val moment: js.Any = js.native
  val version: /* <%= version %> */ java.lang.String = js.native
  def applyAll(functions: js.Any, thisObj: js.Any, args: js.Any): js.Any = js.native
  def capitaliseFirstLetter(str: js.Any): js.Any = js.native
  def compareByFieldSpec(obj1: js.Any, obj2: js.Any, fieldSpec: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any, end: js.Any): js.Any = js.native
  def cssToStr(cssProps: js.Any): java.lang.String = js.native
  def datepickerLocale(localeCode: js.Any, dpLocaleCode: js.Any, dpOptions: js.Any): scala.Unit = js.native
  def debounce(func: js.Any, wait: js.Any): js.Function0[_] = js.native
  def debounce(func: js.Any, wait: js.Any, immediate: scala.Boolean): js.Function0[_] = js.native
  def defineThemeSystem(themeName: js.Any, themeClass: js.Any): scala.Unit = js.native
  def defineView(viewName: js.Any, viewConfig: js.Any): scala.Unit = js.native
  def divideDurationByDuration(dur1: js.Any, dur2: js.Any): scala.Double = js.native
  def divideRangeByDuration(start: js.Any, end: js.Any, dur: js.Any): scala.Double = js.native
  def durationHasTime(dur: js.Any): scala.Boolean = js.native
  def flexibleCompare(a: js.Any, b: js.Any): scala.Double = js.native
  def formatDate(date: js.Any, formatStr: js.Any): js.Any = js.native
  def formatRange(date1: js.Any, date2: js.Any, formatStr: js.Any, separator: js.Any, isRTL: js.Any): js.Any = js.native
  def getClientRect(el: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getClientRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getContentRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getOuterRect(el: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getOuterRect(el: js.Any, origin: js.Any): fullcalendarLib.Anon_Bottom = js.native
  def getScrollbarWidths(el: js.Any): js.Any = js.native
  def getViewConfig(viewName: js.Any): js.Any = js.native
  def htmlEscape(s: js.Any): java.lang.String = js.native
  def intersectRects(rect1: js.Any, rect2: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.Anon_BottomLeft = js.native
  def isInt(n: js.Any): scala.Boolean = js.native
  def locale(localeCode: js.Any, newFcOptions: js.Any): scala.Unit = js.native
  def log(args: js.Any*): js.Any = js.native
  def multiplyDuration(dur: js.Any, n: js.Any): momentLib.momentMod.momentNs.Duration = js.native
  def parseFieldSpecs(input: js.Any): js.Array[_] = js.native
  def preventDefault(ev: js.Any): scala.Unit = js.native
  def proxy(obj: js.Any, methodName: js.Any): js.Function0[_] = js.native
  def queryMostGranularFormatUnit(formatStr: js.Any): js.Any = js.native
  def removeExact(array: js.Any, exactVal: js.Any): scala.Double = js.native
  def warn(args: js.Any*): js.Any = js.native
}

