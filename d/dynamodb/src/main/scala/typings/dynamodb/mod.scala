package typings.dynamodb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.anon.Dynamodb
import typings.dynamodb.anon.ReadCapacity
import typings.dynamodb.anon.TypeofModel
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.dynamoDBMod.DocumentClient
import typings.dynamodb.dynamoDBMod.DynamoDB
import typings.dynamodb.dynamoDBMod.DynamoDbSet
import typings.dynamodb.dynamoDBMod.Projection
import typings.dynamodb.dynamodbStrings.global
import typings.dynamodb.dynamodbStrings.local
import typings.dynamodb.modelMod.Model
import typings.dynamodb.modelMod.Model.CreateOperation
import typings.dynamodb.modelMod.Model.DestroyOperation
import typings.dynamodb.modelMod.Model.GetItemsOperation
import typings.dynamodb.modelMod.Model.GetOperation
import typings.dynamodb.modelMod.Model.UpdateOperation
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import typings.joi.mod.AnySchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dynamodb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dynamodb", "AWS")
  @js.native
  val AWS: js.Any = js.native
  
  @JSImport("dynamodb", "Model")
  @js.native
  class Model_ protected () extends Model {
    def this(attrs: js.Any) = this()
  }
  object Model_ {
    
    @JSImport("dynamodb", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dynamodb", "Model.after")
    @js.native
    val after: js.Any = js.native
    
    inline def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("batchGetItems")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    inline def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("batchGetItems")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    @JSImport("dynamodb", "Model.before")
    @js.native
    val before: js.Any = js.native
    
    inline def config(config: Dynamodb): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("dynamodb", "Model.create")
    @js.native
    val create: CreateOperation = js.native
    
    inline def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    inline def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    inline def deleteTable(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")().asInstanceOf[js.Promise[js.Any]]
    inline def deleteTable(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    inline def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    
    @JSImport("dynamodb", "Model.destroy")
    @js.native
    val destroy: DestroyOperation = js.native
    
    @JSImport("dynamodb", "Model.get")
    @js.native
    val get: GetOperation = js.native
    
    @JSImport("dynamodb", "Model.getItems")
    @js.native
    val getItems: GetItemsOperation = js.native
    
    @JSImport("dynamodb", "Model.itemFactory")
    @js.native
    val itemFactory: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Model */ js.Any = js.native
    
    @JSImport("dynamodb", "Model.log")
    @js.native
    val log: typings.bunyan.mod.^ = js.native
    
    inline def parallelScan(totalSegments: Double): ParallelScan = ^.asInstanceOf[js.Dynamic].applyDynamic("parallelScan")(totalSegments.asInstanceOf[js.Any]).asInstanceOf[ParallelScan]
    
    inline def query(hashKey: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(hashKey.asInstanceOf[js.Any]).asInstanceOf[Query]
    
    inline def scan(): Scan = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")().asInstanceOf[Scan]
    
    inline def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tableName")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tableName")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("dynamodb", "Model.update")
    @js.native
    val update: UpdateOperation = js.native
    
    inline def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
    inline def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[js.Any] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTable")(hashKey.asInstanceOf[js.Any], rangeKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | Unit]
  }
  
  inline def Set(data: js.Array[js.Any], `type`: String): DynamoDbSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[DynamoDbSet]
  
  @JSImport("dynamodb", "createTables")
  @js.native
  val createTables: CreateTables_ = js.native
  
  inline def define(name: String, config: DefineConfig): TypeofModel & (Instantiable1[/* attrs */ js.Any, Model]) = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[TypeofModel & (Instantiable1[/* attrs */ js.Any, Model])]
  
  inline def documentClient(): DocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("documentClient")().asInstanceOf[DocumentClient]
  inline def documentClient(docClient: DocumentClient): DocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("documentClient")(docClient.asInstanceOf[js.Any]).asInstanceOf[DocumentClient]
  
  inline def dynamoDriver(): DynamoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")().asInstanceOf[DynamoDB]
  inline def dynamoDriver(driver: DynamoDB): DynamoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")(driver.asInstanceOf[js.Any]).asInstanceOf[DynamoDB]
  
  @JSImport("dynamodb", "log")
  @js.native
  val log: typings.bunyan.mod.^ = js.native
  
  inline def model(name: String): TypeofModel & (Instantiable1[/* attrs */ js.Any, Model]) = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[TypeofModel & (Instantiable1[/* attrs */ js.Any, Model])]
  inline def model(name: String, model: Model): TypeofModel & (Instantiable1[/* attrs */ js.Any, Model]) = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[TypeofModel & (Instantiable1[/* attrs */ js.Any, Model])]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  object types {
    
    @JSImport("dynamodb", "types")
    @js.native
    val ^ : js.Any = js.native
    
    inline def binarySet(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("binarySet")().asInstanceOf[AnySchema]
    
    inline def numberSet(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("numberSet")().asInstanceOf[AnySchema]
    
    inline def stringSet(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSet")().asInstanceOf[AnySchema]
    
    inline def timeUUID(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUUID")().asInstanceOf[AnySchema]
    
    inline def uuid(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[AnySchema]
  }
  
  type CreateTablesOptions = StringDictionary[ReadCapacity]
  
  @js.native
  trait CreateTables_ extends StObject {
    
    def apply(): js.Promise[js.Any] = js.native
    def apply(callback: Callback): Unit = js.native
    def apply(options: CreateTablesOptions): js.Promise[js.Any] = js.native
    def apply(options: CreateTablesOptions, callback: Callback): Unit = js.native
  }
  
  trait DefineConfig extends StObject {
    
    var createdAt: js.UndefOr[Boolean | String] = js.undefined
    
    var hashKey: String
    
    var indexes: js.UndefOr[js.Array[IndexDefinition]] = js.undefined
    
    var rangeKey: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[StringDictionary[AnySchema | StringDictionary[AnySchema]]] = js.undefined
    
    var tableName: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var timestamps: js.UndefOr[Boolean] = js.undefined
    
    var updatedAt: js.UndefOr[Boolean | String] = js.undefined
  }
  object DefineConfig {
    
    inline def apply(hashKey: String): DefineConfig = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineConfig]
    }
    
    extension [Self <: DefineConfig](x: Self) {
      
      inline def setCreatedAt(value: Boolean | String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Array[IndexDefinition]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: IndexDefinition*): Self = StObject.set(x, "indexes", js.Array(value :_*))
      
      inline def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setSchema(value: StringDictionary[AnySchema | StringDictionary[AnySchema]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTableName(value: String | js.Function0[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameFunction0(value: () => String): Self = StObject.set(x, "tableName", js.Any.fromFunction0(value))
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
      
      inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
      
      inline def setUpdatedAt(value: Boolean | String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    }
  }
  
  trait IndexDefinition extends StObject {
    
    var hashKey: String
    
    var name: String
    
    var projection: js.UndefOr[Projection] = js.undefined
    
    var rangeKey: js.UndefOr[String] = js.undefined
    
    var `type`: local | global
  }
  object IndexDefinition {
    
    inline def apply(hashKey: String, name: String, `type`: local | global): IndexDefinition = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexDefinition]
    }
    
    extension [Self <: IndexDefinition](x: Self) {
      
      inline def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setType(value: local | global): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
