package typings.dynamodb.dynamodbMod

import org.scalablytyped.runtime.Instantiable1
import typings.dynamodb.Anon_Dynamodb
import typings.dynamodb.TypeofModel
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.modelMod.ModelNs.CreateOperation
import typings.dynamodb.modelMod.ModelNs.DestroyOperation
import typings.dynamodb.modelMod.ModelNs.GetItemsOperation
import typings.dynamodb.modelMod.ModelNs.GetOperation
import typings.dynamodb.modelMod.ModelNs.UpdateOperation
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", "Model")
@js.native
object ModelNs extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: CreateOperation = js.native
  val destroy: DestroyOperation = js.native
  val get: GetOperation = js.native
  val getItems: GetItemsOperation = js.native
  val itemFactory: TypeofModel with (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) = js.native
  val log: typings.bunyan.bunyanMod.^ = js.native
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

