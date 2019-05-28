package typings
package dynamodbLib.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Model")
@js.native
object ModelNs extends js.Object {
  @js.native
  trait CreateOperation extends js.Object {
    def apply(doc: js.Any): js.Promise[_] = js.native
    def apply(doc: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
    def apply(doc: js.Any, params: OperationOptions, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  }
  
  @js.native
  trait DestroyOperation extends js.Object {
    def apply(data: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: java.lang.String, options: OperationOptions, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(
      data: org.scalablytyped.runtime.StringDictionary[js.Any],
      callback: dynamodbLib.callbackMod.Callback
    ): scala.Unit = js.native
    def apply(
      data: org.scalablytyped.runtime.StringDictionary[js.Any],
      options: OperationOptions,
      callback: dynamodbLib.callbackMod.Callback
    ): scala.Unit = js.native
    def apply(hashKey: java.lang.String): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, options: OperationOptions): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, options: java.lang.String): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, rangeKey: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(hashKey: java.lang.String, rangeKey: java.lang.String, options: OperationOptions): js.Promise[_] = js.native
    def apply(
      hashKey: java.lang.String,
      rangeKey: java.lang.String,
      options: OperationOptions,
      callback: dynamodbLib.callbackMod.Callback
    ): scala.Unit = js.native
  }
  
  @js.native
  trait GetItemsOperation extends js.Object {
    def apply(keys: js.Array[_]): js.Promise[_] = js.native
    def apply(keys: js.Array[_], callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
    def apply(keys: js.Array[_], options: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  }
  
  @js.native
  trait GetOperation extends js.Object {
    def apply(data: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: java.lang.String, options: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: java.lang.String, options: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: js.Object, options: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(data: js.Object, options: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(hashKey: java.lang.String): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, options: java.lang.String): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, options: js.Object): js.Promise[_] = js.native
    def apply(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Object): js.Promise[_] = js.native
    def apply(
      hashKey: java.lang.String,
      rangeKey: java.lang.String,
      options: js.Object,
      callback: dynamodbLib.callbackMod.Callback
    ): scala.Unit = js.native
  }
  
  trait OperationOptions extends js.Object {
    var ConditionExpression: js.UndefOr[js.Any] = js.undefined
    var ExpressionAttributeNames: js.UndefOr[js.Any] = js.undefined
    var ExpressionAttributeValues: js.UndefOr[js.Any] = js.undefined
    var ReturnValues: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var UpdateExpression: js.UndefOr[js.Any] = js.undefined
    var expected: js.UndefOr[js.Any] = js.undefined
    var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait OperationResult extends js.Object {
    def get(name: java.lang.String): js.Any
  }
  
  @js.native
  trait UpdateOperation extends js.Object {
    def apply(item: js.Any): js.Promise[_] = js.native
    def apply(item: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
    def apply(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
    def apply(item: js.Any, options: OperationOptions, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  }
  
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: CreateOperation = js.native
  val destroy: DestroyOperation = js.native
  val get: GetOperation = js.native
  val getItems: GetItemsOperation = js.native
  val itemFactory: dynamodbLib.TypeofModel with (org.scalablytyped.runtime.Instantiable1[/* attrs */ js.Any, dynamodbLib.modelMod.Model]) = js.native
  val log: bunyanLib.bunyanMod.^ = js.native
  val update: UpdateOperation = js.native
  def batchGetItems(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] | scala.Unit = js.native
  def batchGetItems(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): js.Promise[_] | scala.Unit = js.native
  def config(config: dynamodbLib.Anon_Dynamodb): js.Any = js.native
  def createTable(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] | scala.Unit = js.native
  def createTable(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): js.Promise[_] | scala.Unit = js.native
  def deleteTable(): js.Promise[_] = js.native
  def deleteTable(callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def describeTable(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] | scala.Unit = js.native
  def describeTable(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): js.Promise[_] | scala.Unit = js.native
  def parallelScan(totalSegments: scala.Double): dynamodbLib.scanMod.ParallelScan = js.native
  def query(hashKey: java.lang.String): dynamodbLib.queryMod.Query = js.native
  def scan(): dynamodbLib.scanMod.Scan = js.native
  def tableName(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def tableName(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def updateTable(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] | scala.Unit = js.native
  def updateTable(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): js.Promise[_] | scala.Unit = js.native
}

