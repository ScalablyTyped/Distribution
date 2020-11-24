package typings.dynamodb.modelMod.Model

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOperation extends js.Object {
  
  def apply(data: String, callback: Callback): Unit = js.native
  def apply(data: String, options: String, callback: Callback): Unit = js.native
  def apply(data: String, options: js.Object, callback: Callback): Unit = js.native
  def apply(data: js.Object, callback: Callback): Unit = js.native
  def apply(data: js.Object, options: String, callback: Callback): Unit = js.native
  def apply(data: js.Object, options: js.Object, callback: Callback): Unit = js.native
  def apply(hashKey: String): js.Promise[_] = js.native
  def apply(hashKey: String, options: String): js.Promise[_] = js.native
  def apply(hashKey: String, options: js.Object): js.Promise[_] = js.native
  def apply(hashKey: String, rangeKey: String, options: js.Object): js.Promise[_] = js.native
  def apply(hashKey: String, rangeKey: String, options: js.Object, callback: Callback): Unit = js.native
}
