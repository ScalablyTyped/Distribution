package typings.dynamodb.modelMod.Model

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItemsOperation extends js.Object {
  
  def apply(keys: js.Array[_]): js.Promise[_] = js.native
  def apply(keys: js.Array[_], callback: Callback): Unit = js.native
  def apply(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
  def apply(keys: js.Array[_], options: js.Any, callback: Callback): Unit = js.native
}
