package typings
package dynamodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_After extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val log: bunyanLib.bunyanMod.^ = js.native
  def batchGetItems(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Any): js.Promise[_] | scala.Unit = js.native
  def batchGetItems(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Any,
    callback: dynamodbLib.callbackMod.Callback
  ): js.Promise[_] | scala.Unit = js.native
  def config(config: Anon_Dynamodb): js.Any = js.native
  def create(doc: js.Any): js.Promise[_] = js.native
  def create(doc: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def create(doc: js.Any, params: dynamodbLib.modelMod.ModelNs.OperationOptions): js.Promise[_] = js.native
  def create(
    doc: js.Any,
    params: dynamodbLib.modelMod.ModelNs.OperationOptions,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
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
  def destroy(data: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def destroy(
    data: java.lang.String,
    options: dynamodbLib.modelMod.ModelNs.OperationOptions,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def destroy(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def destroy(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: dynamodbLib.modelMod.ModelNs.OperationOptions,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def destroy(hashKey: java.lang.String): js.Promise[_] = js.native
  def destroy(hashKey: java.lang.String, options: dynamodbLib.modelMod.ModelNs.OperationOptions): js.Promise[_] = js.native
  def destroy(hashKey: java.lang.String, options: java.lang.String): js.Promise[_] = js.native
  def destroy(hashKey: java.lang.String, rangeKey: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def destroy(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: dynamodbLib.modelMod.ModelNs.OperationOptions
  ): js.Promise[_] = js.native
  def destroy(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: dynamodbLib.modelMod.ModelNs.OperationOptions,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def get(data: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(data: java.lang.String, options: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(data: java.lang.String, options: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(data: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(data: js.Object, options: java.lang.String, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(data: js.Object, options: js.Object, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(hashKey: java.lang.String): js.Promise[_] = js.native
  def get(hashKey: java.lang.String, options: java.lang.String): js.Promise[_] = js.native
  def get(hashKey: java.lang.String, options: js.Object): js.Promise[_] = js.native
  def get(hashKey: java.lang.String, rangeKey: java.lang.String, options: js.Object): js.Promise[_] = js.native
  def get(
    hashKey: java.lang.String,
    rangeKey: java.lang.String,
    options: js.Object,
    callback: dynamodbLib.callbackMod.Callback
  ): scala.Unit = js.native
  def getItems(keys: js.Array[_]): js.Promise[_] = js.native
  def getItems(keys: js.Array[_], callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def getItems(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
  def getItems(keys: js.Array[_], options: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
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
  def update(item: js.Any): js.Promise[_] = js.native
  def update(item: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def update(item: js.Any, options: dynamodbLib.modelMod.ModelNs.OperationOptions): js.Promise[_] = js.native
  def update(
    item: js.Any,
    options: dynamodbLib.modelMod.ModelNs.OperationOptions,
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

