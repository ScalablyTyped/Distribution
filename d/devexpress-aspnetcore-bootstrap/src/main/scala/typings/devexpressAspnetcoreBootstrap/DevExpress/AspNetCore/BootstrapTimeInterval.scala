package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapTimeInterval")
@js.native
class BootstrapTimeInterval protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  def contains(interval: BootstrapTimeInterval): Boolean = js.native
  def equals(interval: BootstrapTimeInterval): Boolean = js.native
  def getAllDay(): Boolean = js.native
  def getDuration(): Double = js.native
  def getEnd(): Date = js.native
  def getStart(): Date = js.native
  def intersectsWith(interval: BootstrapTimeInterval): Boolean = js.native
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean = js.native
  def setAllDay(allDayValue: Boolean): Unit = js.native
  def setDuration(value: Double): Unit = js.native
  def setEnd(value: Date): Unit = js.native
  def setStart(value: Date): Unit = js.native
}

