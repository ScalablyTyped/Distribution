package typings.dynamodb.modelMod.Model

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Model.batchGetItems")
@js.native
object batchGetItems extends js.Object {
  def apply(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def apply(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}

