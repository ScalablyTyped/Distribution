package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", "Dispatcher")
@js.native
class Dispatcher protected ()
  extends fluxxorLib.fluxxorMod.FluxxorNs.Dispatcher {
  def this(stores: js.Any) = this()
  /* CompleteClass */
  override def addStore(name: java.lang.String, store: fluxxorLib.fluxxorMod.FluxxorNs.Store): scala.Unit = js.native
  /* CompleteClass */
  override def dispatch(action: js.Function): scala.Unit = js.native
  /* CompleteClass */
  override def doDispatchLoop(action: js.Function): scala.Unit = js.native
  /* CompleteClass */
  override def waitForStores(store: fluxxorLib.fluxxorMod.FluxxorNs.Store, stores: js.Array[java.lang.String], fn: js.Function): scala.Unit = js.native
}

