package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatcher extends js.Object {
  def createContext(context: js.Object): DispatcherContext = js.native
  def getStoreName(store: StoreClass): java.lang.String = js.native
  def getStoreName(store: java.lang.String): java.lang.String = js.native
  def isRegistered(store: StoreClass): scala.Boolean = js.native
  def isRegistered(store: java.lang.String): scala.Boolean = js.native
  def registerStore(store: StoreClass): scala.Unit = js.native
}

