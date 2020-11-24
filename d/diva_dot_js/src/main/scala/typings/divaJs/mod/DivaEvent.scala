package typings.divaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diva.js", "DivaEvent")
@js.native
class DivaEvent () extends js.Object {
  
  def publish(topic: String, args: js.Object): Unit = js.native
  def publish(topic: String, args: js.Object, scope: js.Object): Unit = js.native
  
  def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Array[_] = js.native
  def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, Unit], instanceID: String): js.Array[_] = js.native
  
  def unsubscribe(handle: js.Array[_]): Boolean = js.native
  def unsubscribe(handle: js.Array[_], completely: Boolean): Boolean = js.native
  
  def unsubscribeAll(instanceID: String): Unit = js.native
}
