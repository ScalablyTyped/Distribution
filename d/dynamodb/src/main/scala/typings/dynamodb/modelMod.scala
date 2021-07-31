package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.anon.Dynamodb
import typings.dynamodb.callbackMod.Callback
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
  class Item protected () extends EventEmitter {
    def this(attrs: js.Object, table: js.Any) = this()
    
    def destroy(options: js.Any): js.Promise[js.Any] = js.native
    def destroy(options: js.Any, callback: Callback): Unit = js.native
    
    def get(name: String): js.Any = js.native
    
    def save(): js.Promise[js.Any] = js.native
    def save(callback: Callback): Unit = js.native
    
    def set(params: js.Any): this.type = js.native
    
    def toJSON(): js.Object = js.native
    
    def update(options: js.Any): js.Promise[js.Any] = js.native
    def update(options: js.Any, callback: Callback): Unit = js.native
  }
  
  @JSImport("dynamodb/Model", "Model")
  @js.native
  class Model protected () extends Item {
    def this(attrs: js.Any) = this()
  }
  object Model {
    
    @JSImport("dynamodb/Model", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dynamodb/Model", "Model.after")
    @js.native
    val after: js.Any = js.native
    
    @scala.inline
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("batchGetItems")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    @scala.inline
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("batchGetItems")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    @JSImport("dynamodb/Model", "Model.before")
    @js.native
    val before: js.Any = js.native
    
    @scala.inline
    def config(config: Dynamodb): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("dynamodb/Model", "Model.create")
    @js.native
    val create: CreateOperation = js.native
    
    @scala.inline
    def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    @scala.inline
    def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    @scala.inline
    def deleteTable(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")().asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def deleteTable(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    @scala.inline
    def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
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
    val log: typings.bunyan.mod.^ = js.native
    
    @scala.inline
    def parallelScan(totalSegments: Double): ParallelScan = ^.asInstanceOf[js.Dynamic].applyDynamic("parallelScan")(totalSegments.asInstanceOf[js.Any]).asInstanceOf[ParallelScan]
    
    @scala.inline
    def query(hashKey: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(hashKey.asInstanceOf[js.Any]).asInstanceOf[Query]
    
    @scala.inline
    def scan(): Scan = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")().asInstanceOf[Scan]
    
    @scala.inline
    def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tableName")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tableName")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("dynamodb/Model", "Model.update")
    @js.native
    val update: UpdateOperation = js.native
    
    @scala.inline
    def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    @scala.inline
    def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    @js.native
    trait CreateOperation extends StObject {
      
      def apply(doc: js.Any): js.Promise[js.Any] = js.native
      def apply(doc: js.Any, callback: Callback): Unit = js.native
      def apply(doc: js.Any, params: OperationOptions): js.Promise[js.Any] = js.native
      def apply(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait DestroyOperation extends StObject {
      
      def apply(data: String, callback: Callback): Unit = js.native
      def apply(data: String, options: OperationOptions, callback: Callback): Unit = js.native
      def apply(data: StringDictionary[js.Any], callback: Callback): Unit = js.native
      def apply(data: StringDictionary[js.Any], options: OperationOptions, callback: Callback): Unit = js.native
      def apply(hashKey: String): js.Promise[js.Any] = js.native
      def apply(hashKey: String, options: String): js.Promise[js.Any] = js.native
      def apply(hashKey: String, options: OperationOptions): js.Promise[js.Any] = js.native
      def apply(hashKey: String, rangeKey: String, callback: Callback): Unit = js.native
      def apply(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[js.Any] = js.native
      def apply(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait GetItemsOperation extends StObject {
      
      def apply(keys: js.Array[js.Any]): js.Promise[js.Any] = js.native
      def apply(keys: js.Array[js.Any], callback: Callback): Unit = js.native
      def apply(keys: js.Array[js.Any], options: js.Any): js.Promise[js.Any] = js.native
      def apply(keys: js.Array[js.Any], options: js.Any, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait GetOperation extends StObject {
      
      def apply(data: String, callback: Callback): Unit = js.native
      def apply(data: String, options: String, callback: Callback): Unit = js.native
      def apply(data: String, options: js.Object, callback: Callback): Unit = js.native
      def apply(data: js.Object, callback: Callback): Unit = js.native
      def apply(data: js.Object, options: String, callback: Callback): Unit = js.native
      def apply(data: js.Object, options: js.Object, callback: Callback): Unit = js.native
      def apply(hashKey: String): js.Promise[js.Any] = js.native
      def apply(hashKey: String, options: String): js.Promise[js.Any] = js.native
      def apply(hashKey: String, options: js.Object): js.Promise[js.Any] = js.native
      def apply(hashKey: String, rangeKey: String, options: js.Object): js.Promise[js.Any] = js.native
      def apply(hashKey: String, rangeKey: String, options: js.Object, callback: Callback): Unit = js.native
    }
    
    trait OperationOptions extends StObject {
      
      var ConditionExpression: js.UndefOr[js.Any] = js.undefined
      
      var ExpressionAttributeNames: js.UndefOr[js.Any] = js.undefined
      
      var ExpressionAttributeValues: js.UndefOr[js.Any] = js.undefined
      
      var ReturnValues: js.UndefOr[String | Boolean] = js.undefined
      
      var UpdateExpression: js.UndefOr[js.Any] = js.undefined
      
      var expected: js.UndefOr[js.Any] = js.undefined
      
      var overwrite: js.UndefOr[Boolean] = js.undefined
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
    
    trait OperationResult extends StObject {
      
      def get(name: String): js.Any
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
      
      def apply(item: js.Any): js.Promise[js.Any] = js.native
      def apply(item: js.Any, callback: Callback): Unit = js.native
      def apply(item: js.Any, options: OperationOptions): js.Promise[js.Any] = js.native
      def apply(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
    }
  }
}
