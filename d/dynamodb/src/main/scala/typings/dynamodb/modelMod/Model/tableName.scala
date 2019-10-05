package typings.dynamodb.modelMod.Model

import typings.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Model.tableName")
@js.native
object tableName extends js.Object {
  def apply(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
  def apply(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
}

