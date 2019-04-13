package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store
  extends eventemitter3Lib.eventemitter3Mod.EventEmitter[java.lang.String | js.Symbol] {
  def bindActions(args: (java.lang.String | js.Function)*): scala.Unit = js.native
  def bindActions(args: js.Array[java.lang.String | js.Function]): scala.Unit = js.native
  def waitFor(stores: js.Array[java.lang.String], fn: js.Function): scala.Unit = js.native
}

