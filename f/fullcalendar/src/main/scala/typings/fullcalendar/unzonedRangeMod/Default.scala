package typings.fullcalendar.unzonedRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/UnzonedRange", "Default")
@js.native
class Default () extends js.Object {
  def this(startInput: js.Any) = this()
  def this(startInput: js.Any, endInput: js.Any) = this()
  var endMs: Double = js.native
  var isEnd: Boolean = js.native
  var isStart: Boolean = js.native
  var startMs: Double = js.native
  def as(unit: js.Any): Double = js.native
  def constrainDate(date: js.Any): js.Any = js.native
  def containsDate(date: js.Any): Boolean = js.native
  def containsRange(innerRange: js.Any): Boolean = js.native
  def equals(otherRange: js.Any): Boolean = js.native
  def getEnd(): js.Any = js.native
  def getStart(): js.Any = js.native
  def intersect(otherRange: js.Any): js.Any = js.native
  def intersectsWith(otherRange: js.Any): Boolean = js.native
}

@JSImport("fullcalendar/UnzonedRange", JSImport.Default)
@js.native
class default () extends Default {
  def this(startInput: js.Any) = this()
  def this(startInput: js.Any, endInput: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/UnzonedRange", "Default")
@js.native
object Default extends js.Object {
  def invertRanges(ranges: js.Any, constraintRange: js.Any): js.Array[_] = js.native
}

/* static members */
@JSImport("fullcalendar/UnzonedRange", JSImport.Default)
@js.native
object default extends js.Object {
  def invertRanges(ranges: js.Any, constraintRange: js.Any): js.Array[_] = js.native
}

