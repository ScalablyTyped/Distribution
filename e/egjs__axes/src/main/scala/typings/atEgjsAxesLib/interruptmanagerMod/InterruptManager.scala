package typings
package atEgjsAxesLib.interruptmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/InterruptManager", "InterruptManager")
@js.native
class InterruptManager protected () extends js.Object {
  def this(options: atEgjsAxesLib.axesMod.AxesOption) = this()
  var _prevented: js.Any = js.native
  var options: js.Any = js.native
  def isInterrupted(): scala.Boolean = js.native
  def isInterrupting(): scala.Boolean = js.native
  def setInterrupt(prevented: js.Any): scala.Unit = js.native
}

