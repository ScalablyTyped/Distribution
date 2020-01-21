package typings.firebasePerformance.apiServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebasePerformance.firebasePerformanceStrings.mark
  - typings.firebasePerformance.firebasePerformanceStrings.measure
  - typings.firebasePerformance.firebasePerformanceStrings.paint
  - typings.firebasePerformance.firebasePerformanceStrings.resource
  - typings.firebasePerformance.firebasePerformanceStrings.frame
  - typings.firebasePerformance.firebasePerformanceStrings.navigation
*/
trait EntryType extends js.Object

object EntryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def frame: typings.firebasePerformance.firebasePerformanceStrings.frame = this.cast("frame")
  @scala.inline
  def mark: typings.firebasePerformance.firebasePerformanceStrings.mark = this.cast("mark")
  @scala.inline
  def measure: typings.firebasePerformance.firebasePerformanceStrings.measure = this.cast("measure")
  @scala.inline
  def navigation: typings.firebasePerformance.firebasePerformanceStrings.navigation = this.cast("navigation")
  @scala.inline
  def paint: typings.firebasePerformance.firebasePerformanceStrings.paint = this.cast("paint")
  @scala.inline
  def resource: typings.firebasePerformance.firebasePerformanceStrings.resource = this.cast("resource")
}

