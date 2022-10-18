package typings.dynogels.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.clientsDynamodbMod.CreateTableOutput
import typings.awsSdk.clientsDynamodbMod.DescribeTableOutput
import typings.awsSdk.clientsDynamodbMod.UpdateTableOutput
import typings.dynogels.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model
  extends StObject
     with Instantiable1[/* attrs */ StringDictionary[Any], Item] {
  
  def after(action: LifeCycleAction, listner: js.Function1[/* item */ Item, Unit]): Unit = js.native
  
  def batchGetItems(
    items: js.Array[String | StringDictionary[String]],
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[Any], Unit]
  ): Unit = js.native
  def batchGetItems(
    items: js.Array[String | StringDictionary[String]],
    options: GetItemOptions,
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[Any], Unit]
  ): Unit = js.native
  
  def before(
    action: LifeCycleAction,
    listner: js.Function2[
      /* data */ Any, 
      /* next */ js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  def config(config: ModelConfig): Name = js.native
  
  def create(item: Any, callback: DynogelsItemCallback): Unit = js.native
  def create(item: Any, options: CreateItemOptions, callback: DynogelsItemCallback): Unit = js.native
  
  def createTable(callback: js.Function2[/* err */ js.Error, /* data */ CreateTableOutput, Unit]): Unit = js.native
  def createTable(
    options: CreateTablesOptions,
    callback: js.Function2[/* err */ js.Error, /* data */ CreateTableOutput, Unit]
  ): Unit = js.native
  
  def deleteTable(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def describeTable(callback: js.Function2[/* err */ js.Error, /* data */ DescribeTableOutput, Unit]): Unit = js.native
  
  def destroy(hashKey: Any, callback: DynogelsItemCallback): Unit = js.native
  def destroy(hashKey: Any, rangeKey: Any, callback: DynogelsItemCallback): Unit = js.native
  def destroy(hashKey: Any, rangeKey: Any, options: DestroyItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def destroy(haskKey: Any, options: DestroyItemOptions, callback: DynogelsItemCallback): Unit = js.native
  
  def get(hashKey: Any, callback: DynogelsItemCallback): Unit = js.native
  def get(hashKey: Any, rangeKey: Any, callback: DynogelsItemCallback): Unit = js.native
  def get(hashKey: Any, rangeKey: Any, options: GetItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def get(haskKey: Any, options: GetItemOptions, callback: DynogelsItemCallback): Unit = js.native
  
  def getItems(
    items: js.Array[String | StringDictionary[String]],
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[Any], Unit]
  ): Unit = js.native
  def getItems(
    items: js.Array[String | StringDictionary[String]],
    options: GetItemOptions,
    callback: js.Function2[/* err */ js.Error, /* items */ js.Array[Any], Unit]
  ): Unit = js.native
  
  def parallelScan(totalSegments: Double): Scan = js.native
  
  def query(hashKey: Any): Query = js.native
  
  def scan(): Scan = js.native
  
  def tableName(): String = js.native
  
  def update(item: Any, callback: DynogelsItemCallback): Unit = js.native
  def update(item: Any, options: UpdateItemOptions, callback: DynogelsItemCallback): Unit = js.native
  
  def updateTable(callback: js.Function2[/* err */ js.Error, /* data */ UpdateTableOutput, Unit]): Unit = js.native
  def updateTable(
    throughput: Throughput,
    callback: js.Function2[/* err */ js.Error, /* data */ UpdateTableOutput, Unit]
  ): Unit = js.native
}
