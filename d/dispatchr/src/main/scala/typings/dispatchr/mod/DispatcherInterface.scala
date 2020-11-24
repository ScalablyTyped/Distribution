package typings.dispatchr.mod

import typings.dispatchr.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatcherInterface extends js.Object {
  
  def getContext(): DispatcherContext = js.native
  
  def getStore(name: String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  @JSName("getStore")
  var getStore_Original: FnCall = js.native
  
  def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
  @JSName("waitFor")
  var waitFor_Original: js.Function2[/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit], Unit] = js.native
}
