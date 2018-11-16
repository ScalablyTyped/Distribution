package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model
  extends ScalablyTyped.runtime.Instantiable1[/* attrs */ ScalablyTyped.runtime.StringDictionary[js.Any], Item] {
  def after(action: LifeCycleAction, listner: js.Function1[/* item */ Item, scala.Unit]): scala.Unit = js.native
  def batchGetItems(
    items: js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String] | java.lang.String],
    callback: js.Function2[/* err */ nodeLib.Error, /* items */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def batchGetItems(
    items: js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String] | java.lang.String],
    options: GetItemOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* items */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def before(
    action: LifeCycleAction,
    listner: js.Function2[
      /* data */ js.Any, 
      /* next */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def config(config: ModelConfig): dynogelsLib.Anon_Name = js.native
  def create(item: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def create(item: js.Any, options: CreateItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def createTable(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createTable(
    options: CreateTablesOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.CreateTableOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def deleteTable(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def describeTable(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DescribeTableOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def destroy(hashKey: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def destroy(hashKey: js.Any, rangeKey: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def destroy(hashKey: js.Any, rangeKey: js.Any, options: DestroyItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def destroy(haskKey: js.Any, options: DestroyItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def get(hashKey: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def get(hashKey: js.Any, rangeKey: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def get(hashKey: js.Any, rangeKey: js.Any, options: GetItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def get(haskKey: js.Any, options: GetItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def getItems(
    items: js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String] | java.lang.String],
    callback: js.Function2[/* err */ nodeLib.Error, /* items */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def getItems(
    items: js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String] | java.lang.String],
    options: GetItemOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* items */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def parallelScan(totalSegments: scala.Double): Scan = js.native
  def query(hashKey: js.Any): Query = js.native
  def scan(): Scan = js.native
  def tableName(): java.lang.String = js.native
  def update(item: js.Any, callback: DynogelsItemCallback): scala.Unit = js.native
  def update(item: js.Any, options: UpdateItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def updateTable(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def updateTable(
    throughput: Throughput,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* data */ awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.UpdateTableOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

