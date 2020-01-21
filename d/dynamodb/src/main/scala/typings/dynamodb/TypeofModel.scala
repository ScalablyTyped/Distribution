package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.mod.^
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.modelMod.Model.OperationOptions
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofModel extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val log: ^ = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def config(config: AnonDynamodb): js.Any = js.native
  def create(doc: js.Any): js.Promise[_] = js.native
  def create(doc: js.Any, callback: Callback): Unit = js.native
  def create(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
  def create(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def deleteTable(): js.Promise[_] = js.native
  def deleteTable(callback: Callback): Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  def destroy(data: String, callback: Callback): Unit = js.native
  def destroy(data: String, options: OperationOptions, callback: Callback): Unit = js.native
  def destroy(data: StringDictionary[js.Any], callback: Callback): Unit = js.native
  def destroy(data: StringDictionary[js.Any], options: OperationOptions, callback: Callback): Unit = js.native
  def destroy(hashKey: String): js.Promise[_] = js.native
  def destroy(hashKey: String, options: String): js.Promise[_] = js.native
  def destroy(hashKey: String, options: OperationOptions): js.Promise[_] = js.native
  def destroy(hashKey: String, rangeKey: String, callback: Callback): Unit = js.native
  def destroy(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[_] = js.native
  def destroy(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback): Unit = js.native
  def get(data: String, callback: Callback): Unit = js.native
  def get(data: String, options: String, callback: Callback): Unit = js.native
  def get(data: String, options: js.Object, callback: Callback): Unit = js.native
  def get(data: js.Object, callback: Callback): Unit = js.native
  def get(data: js.Object, options: String, callback: Callback): Unit = js.native
  def get(data: js.Object, options: js.Object, callback: Callback): Unit = js.native
  def get(hashKey: String): js.Promise[_] = js.native
  def get(hashKey: String, options: String): js.Promise[_] = js.native
  def get(hashKey: String, options: js.Object): js.Promise[_] = js.native
  def get(hashKey: String, rangeKey: String, options: js.Object): js.Promise[_] = js.native
  def get(hashKey: String, rangeKey: String, options: js.Object, callback: Callback): Unit = js.native
  def getItems(keys: js.Array[_]): js.Promise[_] = js.native
  def getItems(keys: js.Array[_], callback: Callback): Unit = js.native
  def getItems(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
  def getItems(keys: js.Array[_], options: js.Any, callback: Callback): Unit = js.native
  def parallelScan(totalSegments: Double): ParallelScan = js.native
  def query(hashKey: String): Query = js.native
  def scan(): Scan = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
  def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
  def update(item: js.Any): js.Promise[_] = js.native
  def update(item: js.Any, callback: Callback): Unit = js.native
  def update(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
  def update(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
  def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
}

