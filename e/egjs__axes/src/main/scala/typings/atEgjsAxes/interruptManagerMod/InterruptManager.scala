package typings.atEgjsAxes.interruptManagerMod

import typings.atEgjsAxes.axesMod.AxesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/InterruptManager", "InterruptManager")
@js.native
class InterruptManager protected () extends js.Object {
  def this(options: AxesOption) = this()
  var _prevented: js.Any = js.native
  var options: js.Any = js.native
  def isInterrupted(): Boolean = js.native
  def isInterrupting(): Boolean = js.native
  def setInterrupt(prevented: js.Any): Unit = js.native
}

