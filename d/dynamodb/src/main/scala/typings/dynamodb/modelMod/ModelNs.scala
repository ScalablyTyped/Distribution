package typings.dynamodb.modelMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.bunyanMod.^
import typings.dynamodb.Anon_Dynamodb
import typings.dynamodb.TypeofModel
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.modelMod.ModelNs.CreateOperation
import typings.dynamodb.modelMod.ModelNs.DestroyOperation
import typings.dynamodb.modelMod.ModelNs.GetItemsOperation
import typings.dynamodb.modelMod.ModelNs.GetOperation
import typings.dynamodb.modelMod.ModelNs.OperationOptions
import typings.dynamodb.modelMod.ModelNs.UpdateOperation
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Model")
@js.native
object ModelNs extends js.Object {
  @js.native
  trait CreateOperation extends js.Object {
    def apply(doc: js.Any): js.Promise[_] = js.native
    def apply(doc: js.Any, callback: Callback): Unit = js.native
    def apply(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
    def apply(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait DestroyOperation extends js.Object {
    def apply(data: String, callback: Callback): Unit = js.native
    def apply(data: String, options: OperationOptions, callback: Callback): Unit = js.native
    def apply(data: StringDictionary[js.Any], callback: Callback): Unit = js.native
    def apply(data: StringDictionary[js.Any], options: OperationOptions, callback: Callback): Unit = js.native
    def apply(hashKey: String): js.Promise[_] = js.native
    def apply(hashKey: String, options: String): js.Promise[_] = js.native
    def apply(hashKey: String, options: OperationOptions): js.Promise[_] = js.native
    def apply(hashKey: String, rangeKey: String, callback: Callback): Unit = js.native
    def apply(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[_] = js.native
    def apply(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait GetItemsOperation extends js.Object {
    def apply(keys: js.Array[_]): js.Promise[_] = js.native
    def apply(keys: js.Array[_], callback: Callback): Unit = js.native
    def apply(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
    def apply(keys: js.Array[_], options: js.Any, callback: Callback): Unit = js.native
  }
  
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
  
  trait OperationOptions extends js.Object {
    var ConditionExpression: js.UndefOr[js.Any] = js.undefined
    var ExpressionAttributeNames: js.UndefOr[js.Any] = js.undefined
    var ExpressionAttributeValues: js.UndefOr[js.Any] = js.undefined
    var ReturnValues: js.UndefOr[String | Boolean] = js.undefined
    var UpdateExpression: js.UndefOr[js.Any] = js.undefined
    var expected: js.UndefOr[js.Any] = js.undefined
    var overwrite: js.UndefOr[Boolean] = js.undefined
  }
  
  trait OperationResult extends js.Object {
    def get(name: String): js.Any
  }
  
  @js.native
  trait UpdateOperation extends js.Object {
    def apply(item: js.Any): js.Promise[_] = js.native
    def apply(item: js.Any, callback: Callback): Unit = js.native
    def apply(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
    def apply(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
  }
  
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: CreateOperation = js.native
  val destroy: DestroyOperation = js.native
  val get: GetOperation = js.native
  val getItems: GetItemsOperation = js.native
  val itemFactory: TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
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

