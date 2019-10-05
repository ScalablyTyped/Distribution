package typings.dynamodb.modelMod.Model

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOperation extends js.Object {
  def apply(item: js.Any): js.Promise[_] = js.native
  def apply(item: js.Any, callback: Callback): Unit = js.native
  def apply(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
  def apply(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
}

