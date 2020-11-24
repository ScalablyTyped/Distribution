package typings.dispatchr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatcher extends js.Object {
  
  def createContext(context: js.Object): DispatcherContext = js.native
  
  def getStoreName(store: String): String = js.native
  def getStoreName(store: StoreClass): String = js.native
  
  def isRegistered(store: String): Boolean = js.native
  def isRegistered(store: StoreClass): Boolean = js.native
  
  def registerStore(store: StoreClass): Unit = js.native
}
