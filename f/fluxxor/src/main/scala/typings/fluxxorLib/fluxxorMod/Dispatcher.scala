package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", "Dispatcher")
@js.native
class Dispatcher protected () extends js.Object {
  def this(stores: js.Any) = this()
  def addStore(name: java.lang.String, store: Store): scala.Unit = js.native
  def dispatch(action: js.Function): scala.Unit = js.native
  def doDispatchLoop(action: js.Function): scala.Unit = js.native
  def waitForStores(store: Store, stores: js.Array[java.lang.String], fn: js.Function): scala.Unit = js.native
}

