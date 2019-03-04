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

object Dispatcher {
  @scala.inline
  def apply(
    addStore: js.Function2[java.lang.String, Store, scala.Unit],
    dispatch: js.Function1[js.Function, scala.Unit],
    doDispatchLoop: js.Function1[js.Function, scala.Unit],
    waitForStores: js.Function3[Store, js.Array[java.lang.String], js.Function, scala.Unit]
  ): Dispatcher = {
    val __obj = js.Dynamic.literal(addStore = addStore, dispatch = dispatch, doDispatchLoop = doDispatchLoop, waitForStores = waitForStores)
  
    __obj.asInstanceOf[Dispatcher]
  }
}

