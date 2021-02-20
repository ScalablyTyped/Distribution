package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.mod.^
import typings.dynamodb.anon.Dynamodb
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("dynamodb/Model", "Item")
  @js.native
  class Item protected () extends EventEmitter {
    def this(attrs: js.Object, table: js.Any) = this()
    
    def destroy(options: js.Any): js.Promise[_] = js.native
    def destroy(options: js.Any, callback: Callback): Unit = js.native
    
    def get(name: String): js.Any = js.native
    
    def save(): js.Promise[_] = js.native
    def save(callback: Callback): Unit = js.native
    
    def set(params: js.Any): this.type = js.native
    
    def toJSON(): js.Object = js.native
    
    def update(options: js.Any): js.Promise[_] = js.native
    def update(options: js.Any, callback: Callback): Unit = js.native
  }
  
  @JSImport("dynamodb/Model", "Model")
  @js.native
  class Model protected () extends Item {
    def this(attrs: js.Any) = this()
  }
  object Model {
    
    @JSImport("dynamodb/Model", "Model.after")
    @js.native
    val after: js.Any = js.native
    
    @JSImport("dynamodb/Model", "Model.batchGetItems")
    @js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb/Model", "Model.batchGetItems")
    @js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @JSImport("dynamodb/Model", "Model.before")
    @js.native
    val before: js.Any = js.native
    
    @JSImport("dynamodb/Model", "Model.config")
    @js.native
    def config(config: Dynamodb): js.Any = js.native
    
    @JSImport("dynamodb/Model", "Model.create")
    @js.native
    val create: CreateOperation = js.native
    
    @JSImport("dynamodb/Model", "Model.createTable")
    @js.native
    def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb/Model", "Model.createTable")
    @js.native
    def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @JSImport("dynamodb/Model", "Model.deleteTable")
    @js.native
    def deleteTable(): js.Promise[_] = js.native
    @JSImport("dynamodb/Model", "Model.deleteTable")
    @js.native
    def deleteTable(callback: Callback): Unit = js.native
    
    @JSImport("dynamodb/Model", "Model.describeTable")
    @js.native
    def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb/Model", "Model.describeTable")
    @js.native
    def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @JSImport("dynamodb/Model", "Model.destroy")
    @js.native
    val destroy: DestroyOperation = js.native
    
    @JSImport("dynamodb/Model", "Model.get")
    @js.native
    val get: GetOperation = js.native
    
    @JSImport("dynamodb/Model", "Model.getItems")
    @js.native
    val getItems: GetItemsOperation = js.native
    
    @JSImport("dynamodb/Model", "Model.itemFactory")
    @js.native
    val itemFactory: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Model */ js.Any = js.native
    
    @JSImport("dynamodb/Model", "Model.log")
    @js.native
    val log: ^ = js.native
    
    @JSImport("dynamodb/Model", "Model.parallelScan")
    @js.native
    def parallelScan(totalSegments: Double): ParallelScan = js.native
    
    @JSImport("dynamodb/Model", "Model.query")
    @js.native
    def query(hashKey: String): Query = js.native
    
    @JSImport("dynamodb/Model", "Model.scan")
    @js.native
    def scan(): Scan = js.native
    
    @JSImport("dynamodb/Model", "Model.tableName")
    @js.native
    def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
    @JSImport("dynamodb/Model", "Model.tableName")
    @js.native
    def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
    
    @JSImport("dynamodb/Model", "Model.update")
    @js.native
    val update: UpdateOperation = js.native
    
    @JSImport("dynamodb/Model", "Model.updateTable")
    @js.native
    def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb/Model", "Model.updateTable")
    @js.native
    def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @js.native
    trait CreateOperation extends StObject {
      
      def apply(doc: js.Any): js.Promise[_] = js.native
      def apply(doc: js.Any, callback: Callback): Unit = js.native
      def apply(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
      def apply(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait DestroyOperation extends StObject {
      
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
    trait GetItemsOperation extends StObject {
      
      def apply(keys: js.Array[_]): js.Promise[_] = js.native
      def apply(keys: js.Array[_], callback: Callback): Unit = js.native
      def apply(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
      def apply(keys: js.Array[_], options: js.Any, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait GetOperation extends StObject {
      
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
    
    @js.native
    trait OperationOptions extends StObject {
      
      var ConditionExpression: js.UndefOr[js.Any] = js.native
      
      var ExpressionAttributeNames: js.UndefOr[js.Any] = js.native
      
      var ExpressionAttributeValues: js.UndefOr[js.Any] = js.native
      
      var ReturnValues: js.UndefOr[String | Boolean] = js.native
      
      var UpdateExpression: js.UndefOr[js.Any] = js.native
      
      var expected: js.UndefOr[js.Any] = js.native
      
      var overwrite: js.UndefOr[Boolean] = js.native
    }
    object OperationOptions {
      
      @scala.inline
      def apply(): OperationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OperationOptions]
      }
      
      @scala.inline
      implicit class OperationOptionsMutableBuilder[Self <: OperationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConditionExpression(value: js.Any): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
        
        @scala.inline
        def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
        
        @scala.inline
        def setExpressionAttributeNames(value: js.Any): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
        
        @scala.inline
        def setExpressionAttributeValues(value: js.Any): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
        
        @scala.inline
        def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
        
        @scala.inline
        def setReturnValues(value: String | Boolean): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
        
        @scala.inline
        def setUpdateExpression(value: js.Any): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
      }
    }
    
    @js.native
    trait OperationResult extends StObject {
      
      def get(name: String): js.Any = js.native
    }
    object OperationResult {
      
      @scala.inline
      def apply(get: String => js.Any): OperationResult = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[OperationResult]
      }
      
      @scala.inline
      implicit class OperationResultMutableBuilder[Self <: OperationResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait UpdateOperation extends StObject {
      
      def apply(item: js.Any): js.Promise[_] = js.native
      def apply(item: js.Any, callback: Callback): Unit = js.native
      def apply(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
      def apply(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
    }
  }
}
