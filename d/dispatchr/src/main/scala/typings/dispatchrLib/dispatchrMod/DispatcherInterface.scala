package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherInterface extends js.Object {
  @JSName("getStore")
  var getStore_Original: dispatchrLib.Fn_Name = js.native
  @JSName("waitFor")
  var waitFor_Original: js.Function2[
    /* stores */ js.Array[java.lang.String | StoreClass], 
    /* callback */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  def getContext(): DispatcherContext = js.native
  def getStore(name: java.lang.String): Store[js.Object] = js.native
  def getStore[T /* <: StoreClass */](name: T): T = js.native
  def waitFor(stores: js.Array[java.lang.String | StoreClass], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

