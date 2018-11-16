package typings
package famousLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/core", "FamousEngine")
@js.native
class FamousEngine () extends js.Object {
  def createScene(): Scene = js.native
}

@JSImport("famous/core", "FamousEngine")
@js.native
object FamousEngine extends js.Object {
  def createScene(): famousLib.coreMod.Scene = js.native
  def getClock(): famousLib.coreMod.Clock = js.native
  def getContext(selector: java.lang.String): famousLib.coreMod.Scene = js.native
  def init(): famousLib.coreMod.FamousEngine = js.native
  def requestUpdate(requester: scala.Double): scala.Unit = js.native
  def requestUpdateOnNextTick(requester: scala.Double): scala.Unit = js.native
}

