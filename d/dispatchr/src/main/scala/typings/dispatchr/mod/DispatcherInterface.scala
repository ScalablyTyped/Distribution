package typings.dispatchr.mod

import typings.dispatchr.FnName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherInterface extends js.Object {
  @JSName("getStore")
  var getStore_Original: FnName = js.native
  @JSName("waitFor")
  var waitFor_Original: js.Function2[/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit], Unit] = js.native
  def getContext(): DispatcherContext = js.native
  def getStore(name: String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
}

