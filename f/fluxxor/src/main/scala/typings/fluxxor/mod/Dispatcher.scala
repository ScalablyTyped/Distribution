package typings.fluxxor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluxxor", "Dispatcher")
@js.native
class Dispatcher protected () extends js.Object {
  def this(stores: js.Any) = this()
  
  def addStore(name: String, store: Store): Unit = js.native
  
  def dispatch(action: js.Function): Unit = js.native
  
  def doDispatchLoop(action: js.Function): Unit = js.native
  
  def waitForStores(store: Store, stores: js.Array[String], fn: js.Function): Unit = js.native
}
