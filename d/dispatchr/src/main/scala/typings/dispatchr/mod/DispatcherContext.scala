package typings.dispatchr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherContext extends js.Object {
  var dispatcherInterface: DispatcherInterface = js.native
  def dehydrate(): DispatcherState = js.native
  def dispatch(actionName: String, payload: js.Any): Unit = js.native
  def getStore(name: String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  def rehydrate(dispatcherState: DispatcherState): Unit = js.native
  def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
}

