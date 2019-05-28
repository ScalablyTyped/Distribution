package typings
package dynamodbLib.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", "Model")
@js.native
object ModelNs extends js.Object {
  val after: js.Any = js.native
  val before: js.Any = js.native
  val create: dynamodbLib.modelMod.ModelNs.CreateOperation = js.native
  val destroy: dynamodbLib.modelMod.ModelNs.DestroyOperation = js.native
  val get: dynamodbLib.modelMod.ModelNs.GetOperation = js.native
  val getItems: dynamodbLib.modelMod.ModelNs.GetItemsOperation = js.native
  val itemFactory: dynamodbLib.TypeofModel with (org.scalablytyped.runtime.Instantiable1[/* attrs */ js.Any, dynamodbLib.modelMod.Model]) = js.native
  val log: bunyanLib.bunyanMod.^ = js.native
  val update: dynamodbLib.modelMod.ModelNs.UpdateOperation = js.native
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

