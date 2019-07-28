package typings.fullcalendar

import typings.fullcalendar.fullcalendarNumbers.`false`
import typings.moment.momentMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/util", JSImport.Namespace)
@js.native
object srcUtilMod extends js.Object {
  val dayIDs: js.Array[String] = js.native
  val unitsDesc: js.Array[String] = js.native
  def allowSelection(el: js.Any): Unit = js.native
  def applyAll(functions: js.Any, thisObj: js.Any, args: js.Any): js.Any = js.native
  def attrsToStr(attrs: js.Any): String = js.native
  def capitaliseFirstLetter(str: js.Any): js.Any = js.native
  def compareByFieldSpec(obj1: js.Any, obj2: js.Any, fieldSpec: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any): js.Any = js.native
  def compareByFieldSpecs(obj1: js.Any, obj2: js.Any, fieldSpecs: js.Any, obj1fallback: js.Any, obj2fallback: js.Any): js.Any = js.native
  def compareNumbers(a: js.Any, b: js.Any): Double = js.native
  def compensateScroll(rowEls: js.Any, scrollbarWidths: js.Any): Unit = js.native
  def computeDurationGreatestUnit(duration: js.Any, durationInput: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any): js.Any = js.native
  def computeGreatestUnit(start: js.Any, end: js.Any): js.Any = js.native
  def constrainPoint(point: js.Any, rect: js.Any): Anon_Left = js.native
  def copyOwnProps(src: js.Any, dest: js.Any): Unit = js.native
  def cssToStr(cssProps: js.Any): String = js.native
  def debounce(func: js.Any, wait: js.Any): js.Function0[_] = js.native
  def debounce(func: js.Any, wait: js.Any, immediate: Boolean): js.Function0[_] = js.native
  def diffByUnit(a: js.Any, b: js.Any, unit: js.Any): Duration = js.native
  def diffDay(a: js.Any, b: js.Any): Duration = js.native
  def diffDayTime(a: js.Any, b: js.Any): Duration = js.native
  def diffPoints(point1: js.Any, point2: js.Any): Anon_Left = js.native
  def disableCursor(): Unit = js.native
  def distributeHeight(els: js.Any, availableHeight: js.Any, shouldRedistribute: js.Any): Unit = js.native
  def divideDurationByDuration(dur1: js.Any, dur2: js.Any): Double = js.native
  def divideRangeByDuration(start: js.Any, end: js.Any, dur: js.Any): Double = js.native
  def durationHasTime(dur: js.Any): Boolean = js.native
  def enableCursor(): Unit = js.native
  def firstDefined(args: js.Any*): js.Any = js.native
  def flexibleCompare(a: js.Any, b: js.Any): Double = js.native
  def getClientRect(el: js.Any): Anon_Bottom = js.native
  def getClientRect(el: js.Any, origin: js.Any): Anon_Bottom = js.native
  def getContentRect(el: js.Any, origin: js.Any): Anon_Bottom = js.native
  def getEvIsTouch(ev: js.Any): Boolean = js.native
  def getEvX(ev: js.Any): js.Any = js.native
  def getEvY(ev: js.Any): js.Any = js.native
  def getOuterRect(el: js.Any): Anon_Bottom = js.native
  def getOuterRect(el: js.Any, origin: js.Any): Anon_Bottom = js.native
  def getRectCenter(rect: js.Any): Anon_Left = js.native
  def getScrollParent(el: js.Any): js.Any = js.native
  def getScrollbarWidths(el: js.Any): js.Any = js.native
  def hasOwnProp(obj: js.Any, name: js.Any): js.Any = js.native
  def htmlEscape(s: js.Any): String = js.native
  def intersectRects(rect1: js.Any, rect2: js.Any): `false` | Anon_BottomLeft = js.native
  def isArraysEqual(a0: js.Any, a1: js.Any): Boolean = js.native
  def isInt(n: js.Any): Boolean = js.native
  def isNativeDate(input: js.Any): Boolean = js.native
  def isPrimaryMouseButton(ev: js.Any): Boolean = js.native
  def isTimeString(str: js.Any): Boolean = js.native
  def log(args: js.Any*): js.Any = js.native
  def matchCellWidths(els: js.Any): Double = js.native
  def mergeProps(propObjs: js.Any): js.Object = js.native
  def mergeProps(propObjs: js.Any, complexProps: js.Any): js.Object = js.native
  def multiplyDuration(dur: js.Any, n: js.Any): Duration = js.native
  def parseFieldSpecs(input: js.Any): js.Array[_] = js.native
  def preventDefault(ev: js.Any): Unit = js.native
  def preventSelection(el: js.Any): Unit = js.native
  def proxy(obj: js.Any, methodName: js.Any): js.Function0[_] = js.native
  def removeExact(array: js.Any, exactVal: js.Any): Double = js.native
  def removeMatching(array: js.Any, testFunc: js.Any): Double = js.native
  def stripHtmlEntities(text: js.Any): js.Any = js.native
  def subtractInnerElHeight(outerEl: js.Any, innerEl: js.Any): js.Any = js.native
  def uncompensateScroll(rowEls: js.Any): Unit = js.native
  def undistributeHeight(els: js.Any): Unit = js.native
  def warn(args: js.Any*): js.Any = js.native
}

