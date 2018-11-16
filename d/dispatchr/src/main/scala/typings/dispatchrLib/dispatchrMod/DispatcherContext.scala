package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherContext extends js.Object {
  var dispatcherInterface: DispatcherInterface = js.native
  def dehydrate(): DispatcherState = js.native
  def dispatch(actionName: java.lang.String, payload: js.Any): scala.Unit = js.native
  def getStore(name: java.lang.String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  def rehydrate(dispatcherState: DispatcherState): scala.Unit = js.native
  def waitFor(stores: js.Array[java.lang.String | StoreClass], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

