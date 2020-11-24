package typings.dispatchr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatcherContext extends js.Object {
  
  def dehydrate(): DispatcherState = js.native
  
  def dispatch(actionName: String, payload: js.Any): Unit = js.native
  
  var dispatcherInterface: DispatcherInterface = js.native
  
  def getStore(name: String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  
  def rehydrate(dispatcherState: DispatcherState): Unit = js.native
  
  def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
}
