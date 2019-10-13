package typings.dynamodb.dynamodbMod

import org.scalablytyped.runtime.Instantiable1
import typings.bunyan.bunyanMod.^
import typings.dynamodb.Anon_Dynamodb
import typings.dynamodb.TypeofModel
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.modelMod.Model.CreateOperation
import typings.dynamodb.modelMod.Model.DestroyOperation
import typings.dynamodb.modelMod.Model.GetItemsOperation
import typings.dynamodb.modelMod.Model.GetOperation
import typings.dynamodb.modelMod.Model.UpdateOperation
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", "Model")
@js.native
class Model protected ()
  extends typings.dynamodb.modelMod.Model {
  def this(attrs: js.Any) = this()
}

@JSImport("dynamodb", "Model")
@js.native
object Model extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: CreateOperation = js.native
  val destroy: DestroyOperation = js.native
  val get: GetOperation = js.native
  val getItems: GetItemsOperation = js.native
  val itemFactory: TypeofModel with (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) = js.native
  val log: ^ = js.native
  val update: UpdateOperation = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def config(config: Anon_Dynamodb): js.Any = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def deleteTable(): js.Promise[_] = js.native
  def deleteTable(callback: Callback): Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def parallelScan(totalSegments: Double): ParallelScan = js.native
  def query(hashKey: String): Query = js.native
  def scan(): Scan = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}

@JSImport("dynamodb", "model")
@js.native
object model extends js.Object {
  def apply(name: String): TypeofModel with (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) = js.native
  def apply(name: String, model: typings.dynamodb.modelMod.Model): TypeofModel with (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) = js.native
}

