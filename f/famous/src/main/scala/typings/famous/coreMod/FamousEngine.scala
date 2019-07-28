package typings.famous.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/core", "FamousEngine")
@js.native
class FamousEngine () extends js.Object {
  def createScene(): Scene = js.native
}

/* static members */
@JSImport("famous/core", "FamousEngine")
@js.native
object FamousEngine extends js.Object {
  def createScene(): Scene = js.native
  def getClock(): Clock = js.native
  def getContext(selector: String): Scene = js.native
  def init(): FamousEngine = js.native
  def requestUpdate(requester: Double): Unit = js.native
  def requestUpdateOnNextTick(requester: Double): Unit = js.native
}

