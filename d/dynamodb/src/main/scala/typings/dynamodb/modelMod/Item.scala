package typings.dynamodb.modelMod

import typings.dynamodb.callbackMod.Callback
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynamodb/Model", "Item")
@js.native
class Item protected () extends EventEmitter {
  def this(attrs: js.Object, table: js.Any) = this()
  
  def destroy(options: js.Any): js.Promise[_] = js.native
  def destroy(options: js.Any, callback: Callback): Unit = js.native
  
  def get(name: String): js.Any = js.native
  
  def save(): js.Promise[_] = js.native
  def save(callback: Callback): Unit = js.native
  
  def set(params: js.Any): this.type = js.native
  
  def toJSON(): js.Object = js.native
  
  def update(options: js.Any): js.Promise[_] = js.native
  def update(options: js.Any, callback: Callback): Unit = js.native
}
