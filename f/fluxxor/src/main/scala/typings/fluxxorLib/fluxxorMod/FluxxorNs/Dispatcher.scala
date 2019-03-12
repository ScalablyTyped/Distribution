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
    addStore: (java.lang.String, Store) => scala.Unit,
    dispatch: js.Function => scala.Unit,
    doDispatchLoop: js.Function => scala.Unit,
    waitForStores: (Store, js.Array[java.lang.String], js.Function) => scala.Unit
  ): Dispatcher = {
    val __obj = js.Dynamic.literal(addStore = js.Any.fromFunction2(addStore), dispatch = js.Any.fromFunction1(dispatch), doDispatchLoop = js.Any.fromFunction1(doDispatchLoop), waitForStores = js.Any.fromFunction3(waitForStores))
  
    __obj.asInstanceOf[Dispatcher]
  }
}

