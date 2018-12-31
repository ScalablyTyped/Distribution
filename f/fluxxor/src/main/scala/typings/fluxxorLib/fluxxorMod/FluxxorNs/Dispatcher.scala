package typings
package fluxxorLib.fluxxorMod.FluxxorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatcher extends js.Object {
  def addStore(name: java.lang.String, store: Store): scala.Unit
  def dispatch(action: js.Function): scala.Unit
  def doDispatchLoop(action: js.Function): scala.Unit
  def waitForStores(store: Store, stores: js.Array[java.lang.String], fn: js.Function): scala.Unit
}

