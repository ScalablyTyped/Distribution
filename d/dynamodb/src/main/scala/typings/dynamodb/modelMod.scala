package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.mod.^
import typings.dynamodb.anon.CapacityUnits
import typings.dynamodb.anon.Dynamodb
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.modelMod.Model.OperationOptions
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("dynamodb/Model", "Item")
  @js.native
  open class Item[T] protected () extends EventEmitter {
    def this(attrs: T, table: Any) = this()
    
    def destroy(options: Any): js.Promise[Item[T]] = js.native
    def destroy(options: Any, callback: Callback[Item[T]]): Unit = js.native
    
    def get(name: String): Any = js.native
    
    def save(): js.Promise[T] = js.native
    def save(callback: Callback[T]): Unit = js.native
    
    def set(params: Any): this.type = js.native
    
    def toJSON(): T = js.native
    
    def update(options: Any): js.Promise[Item[T]] = js.native
    def update(options: Any, callback: Callback[Item[T]]): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined  */ @JSImport("dynamodb/Model", "Model")
  @js.native
  open class Model[T] protected () extends Item[T] {
    def this(attrs: T) = this()
    
    var after: Any = js.native
    
    var attrs: T = js.native
    
    def batchGetItems(hashKey: String, rangeKey: String, options: Any): js.Promise[Any] | Unit = js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: Any, callback: Callback[Any]): js.Promise[Any] | Unit = js.native
    
    var before: Any = js.native
    
    def config(config: Dynamodb): Any = js.native
    
    def create(doc: T): js.Promise[Model[T]] = js.native
    def create(doc: T, callback: Callback[Model[T]]): Unit = js.native
    def create(doc: T, params: OperationOptions): js.Promise[Model[T]] = js.native
    def create(doc: T, params: OperationOptions, callback: Callback[Model[T]]): Unit = js.native
    def create(doc: js.Array[T]): js.Promise[js.Array[Model[T]]] = js.native
    def create(doc: js.Array[T], callback: Callback[js.Array[Model[T]]]): Unit = js.native
    def create(doc: js.Array[T], params: OperationOptions): js.Promise[js.Array[Model[T]]] = js.native
    def create(doc: js.Array[T], params: OperationOptions, callback: Callback[js.Array[Model[T]]]): Unit = js.native
    
    def createTable(hashKey: String, rangeKey: String, options: Any): js.Promise[Any] | Unit = js.native
    def createTable(hashKey: String, rangeKey: String, options: Any, callback: Callback[Any]): js.Promise[Any] | Unit = js.native
    
    def deleteTable(): js.Promise[Any] = js.native
    def deleteTable(callback: Callback[Any]): Unit = js.native
    
    def describeTable(hashKey: String, rangeKey: String, options: Any): js.Promise[Any] | Unit = js.native
    def describeTable(hashKey: String, rangeKey: String, options: Any, callback: Callback[Any]): js.Promise[Any] | Unit = js.native
    
    def destroy(data: String, callback: Callback[Any]): Unit = js.native
    def destroy(data: String, options: OperationOptions, callback: Callback[Any]): Unit = js.native
    def destroy(data: StringDictionary[Any], callback: Callback[Any]): Unit = js.native
    def destroy(data: StringDictionary[Any], options: OperationOptions, callback: Callback[Any]): Unit = js.native
    def destroy(hashKey: String): js.Promise[Any] = js.native
    def destroy(hashKey: String, options: String): js.Promise[Any] = js.native
    def destroy(hashKey: String, options: OperationOptions): js.Promise[Any] = js.native
    def destroy(hashKey: String, rangeKey: String, callback: Callback[Any]): Unit = js.native
    def destroy(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[Any] = js.native
    def destroy(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback[Any]): Unit = js.native
    
    def get(data: String, callback: Callback[Model[T]]): Unit = js.native
    def get(data: String, options: String, callback: Callback[Model[T]]): Unit = js.native
    def get(data: String, options: js.Object, callback: Callback[Model[T]]): Unit = js.native
    def get(data: js.Object, callback: Callback[Model[T]]): Unit = js.native
    def get(data: js.Object, options: String, callback: Callback[Model[T]]): Unit = js.native
    def get(data: js.Object, options: js.Object, callback: Callback[Model[T]]): Unit = js.native
    def get(hashKey: String, options: String): js.Promise[Model[T]] = js.native
    def get(hashKey: String, options: js.Object): js.Promise[Model[T]] = js.native
    def get(hashKey: String, rangeKey: String, options: js.Object): js.Promise[Model[T]] = js.native
    def get(hashKey: String, rangeKey: String, options: js.Object, callback: Callback[Model[T]]): Unit = js.native
    
    def getItems(keys: js.Array[Any]): js.Promise[js.Array[Model[T]]] = js.native
    def getItems(keys: js.Array[Any], callback: Callback[js.Array[Model[T]]]): Unit = js.native
    def getItems(keys: js.Array[Any], options: Any): js.Promise[js.Array[Model[T]]] = js.native
    def getItems(keys: js.Array[Any], options: Any, callback: Callback[js.Array[Model[T]]]): Unit = js.native
    
    var itemFactory: Model[T] = js.native
    
    var log: ^ = js.native
    
    def parallelScan(totalSegments: Double): ParallelScan[T] = js.native
    
    def query(hashKey: String): Query[T] = js.native
    
    def scan(): Scan[T] = js.native
    
    var table: Any = js.native
    
    def tableName(hashKey: String, rangeKey: String, options: Any): js.Promise[Any] = js.native
    def tableName(hashKey: String, rangeKey: String, options: Any, callback: Callback[Any]): Unit = js.native
    
    def update(item: Any, options: OperationOptions): js.Promise[Model[T]] = js.native
    def update(item: Any, options: OperationOptions, callback: Callback[Model[T]]): Unit = js.native
    
    def updateTable(hashKey: String, rangeKey: String, options: Any): js.Promise[Any] | Unit = js.native
    def updateTable(hashKey: String, rangeKey: String, options: Any, callback: Callback[Any]): js.Promise[Any] | Unit = js.native
  }
  object Model {
    
    trait OperationOptions extends StObject {
      
      var ConditionExpression: js.UndefOr[Any] = js.undefined
      
      var ExpressionAttributeNames: js.UndefOr[Any] = js.undefined
      
      var ExpressionAttributeValues: js.UndefOr[Any] = js.undefined
      
      var ReturnValues: js.UndefOr[String | Boolean] = js.undefined
      
      var UpdateExpression: js.UndefOr[Any] = js.undefined
      
      var expected: js.UndefOr[Any] = js.undefined
      
      var overwrite: js.UndefOr[Boolean] = js.undefined
    }
    object OperationOptions {
      
      inline def apply(): OperationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OperationOptions]
      }
      
      extension [Self <: OperationOptions](x: Self) {
        
        inline def setConditionExpression(value: Any): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
        
        inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
        
        inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
        
        inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
        
        inline def setExpressionAttributeNames(value: Any): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
        
        inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
        
        inline def setExpressionAttributeValues(value: Any): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
        
        inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
        
        inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
        
        inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
        
        inline def setReturnValues(value: String | Boolean): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
        
        inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
        
        inline def setUpdateExpression(value: Any): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
        
        inline def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
      }
    }
  }
  
  trait Page[T] extends StObject {
    
    var ConsumedCapacity: js.UndefOr[CapacityUnits] = js.undefined
    
    var Count: Double
    
    var Items: js.Array[Model[T]]
    
    var LastEvaluatedKey: js.UndefOr[Any] = js.undefined
    
    var ScannedCount: js.UndefOr[Double] = js.undefined
  }
  object Page {
    
    inline def apply[T](Count: Double, Items: js.Array[Model[T]]): Page[T] = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page[T]]
    }
    
    extension [Self <: Page[?], T](x: Self & Page[T]) {
      
      inline def setConsumedCapacity(value: CapacityUnits): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Model[T]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Model[T]*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Any): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
}
