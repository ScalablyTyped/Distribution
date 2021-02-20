package typings.dynamodb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.mod.^
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dynamodb", "AWS")
  @js.native
  val AWS: js.Any = js.native
  
  @JSImport("dynamodb", "Model")
  @js.native
  class Model_ protected () extends Model {
    def this(attrs: js.Any) = this()
  }
  object Model_ {
    
    @JSImport("dynamodb", "Model.after")
    @js.native
    val after: js.Any = js.native
    
    @JSImport("dynamodb", "Model.batchGetItems")
    @js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb", "Model.batchGetItems")
    @js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @JSImport("dynamodb", "Model.before")
    @js.native
    val before: js.Any = js.native
    
    @JSImport("dynamodb", "Model.config")
    @js.native
    def config(config: Dynamodb): js.Any = js.native
    
    @JSImport("dynamodb", "Model.create")
    @js.native
    val create: CreateOperation = js.native
    
    @JSImport("dynamodb", "Model.createTable")
    @js.native
    def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb", "Model.createTable")
    @js.native
    def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    @JSImport("dynamodb", "Model.deleteTable")
    @js.native
    def deleteTable(): js.Promise[_] = js.native
    @JSImport("dynamodb", "Model.deleteTable")
    @js.native
    def deleteTable(callback: Callback): Unit = js.native
    
    @JSImport("dynamodb", "Model.describeTable")
    @js.native
    def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb", "Model.describeTable")
    @js.native
    def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
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
    val log: ^ = js.native
    
    @JSImport("dynamodb", "Model.parallelScan")
    @js.native
    def parallelScan(totalSegments: Double): ParallelScan = js.native
    
    @JSImport("dynamodb", "Model.query")
    @js.native
    def query(hashKey: String): Query = js.native
    
    @JSImport("dynamodb", "Model.scan")
    @js.native
    def scan(): Scan = js.native
    
    @JSImport("dynamodb", "Model.tableName")
    @js.native
    def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
    @JSImport("dynamodb", "Model.tableName")
    @js.native
    def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
    
    @JSImport("dynamodb", "Model.update")
    @js.native
    val update: UpdateOperation = js.native
    
    @JSImport("dynamodb", "Model.updateTable")
    @js.native
    def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    @JSImport("dynamodb", "Model.updateTable")
    @js.native
    def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  }
  
  @JSImport("dynamodb", "Set")
  @js.native
  def Set(data: js.Array[_], `type`: String): DynamoDbSet = js.native
  
  @JSImport("dynamodb", "createTables")
  @js.native
  val createTables: CreateTables_ = js.native
  
  @JSImport("dynamodb", "define")
  @js.native
  def define(name: String, config: DefineConfig): TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
  
  @JSImport("dynamodb", "documentClient")
  @js.native
  def documentClient(): DocumentClient = js.native
  @JSImport("dynamodb", "documentClient")
  @js.native
  def documentClient(docClient: DocumentClient): DocumentClient = js.native
  
  @JSImport("dynamodb", "dynamoDriver")
  @js.native
  def dynamoDriver(): DynamoDB = js.native
  @JSImport("dynamodb", "dynamoDriver")
  @js.native
  def dynamoDriver(driver: DynamoDB): DynamoDB = js.native
  
  @JSImport("dynamodb", "log")
  @js.native
  val log: ^ = js.native
  
  @JSImport("dynamodb", "model")
  @js.native
  def model(name: String): TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
  @JSImport("dynamodb", "model")
  @js.native
  def model(name: String, model: Model): TypeofModel with (Instantiable1[/* attrs */ js.Any, Model]) = js.native
  
  @JSImport("dynamodb", "reset")
  @js.native
  def reset(): Unit = js.native
  
  object types {
    
    @JSImport("dynamodb", "types.binarySet")
    @js.native
    def binarySet(): AnySchema = js.native
    
    @JSImport("dynamodb", "types.numberSet")
    @js.native
    def numberSet(): AnySchema = js.native
    
    @JSImport("dynamodb", "types.stringSet")
    @js.native
    def stringSet(): AnySchema = js.native
    
    @JSImport("dynamodb", "types.timeUUID")
    @js.native
    def timeUUID(): AnySchema = js.native
    
    @JSImport("dynamodb", "types.uuid")
    @js.native
    def uuid(): AnySchema = js.native
  }
  
  type CreateTablesOptions = StringDictionary[ReadCapacity]
  
  @js.native
  trait CreateTables_ extends StObject {
    
    def apply(): js.Promise[_] = js.native
    def apply(callback: Callback): Unit = js.native
    def apply(options: CreateTablesOptions): js.Promise[_] = js.native
    def apply(options: CreateTablesOptions, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait DefineConfig extends StObject {
    
    var createdAt: js.UndefOr[Boolean | String] = js.native
    
    var hashKey: String = js.native
    
    var indexes: js.UndefOr[js.Array[IndexDefinition]] = js.native
    
    var rangeKey: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[StringDictionary[AnySchema | StringDictionary[AnySchema]]] = js.native
    
    var tableName: js.UndefOr[String | js.Function0[String]] = js.native
    
    var timestamps: js.UndefOr[Boolean] = js.native
    
    var updatedAt: js.UndefOr[Boolean | String] = js.native
  }
  object DefineConfig {
    
    @scala.inline
    def apply(hashKey: String): DefineConfig = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineConfig]
    }
    
    @scala.inline
    implicit class DefineConfigMutableBuilder[Self <: DefineConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: Boolean | String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      @scala.inline
      def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexes(value: js.Array[IndexDefinition]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      @scala.inline
      def setIndexesVarargs(value: IndexDefinition*): Self = StObject.set(x, "indexes", js.Array(value :_*))
      
      @scala.inline
      def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      @scala.inline
      def setSchema(value: StringDictionary[AnySchema | StringDictionary[AnySchema]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setTableName(value: String | js.Function0[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameFunction0(value: () => String): Self = StObject.set(x, "tableName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      @scala.inline
      def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
      
      @scala.inline
      def setUpdatedAt(value: Boolean | String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    }
  }
  
  @js.native
  trait IndexDefinition extends StObject {
    
    var hashKey: String = js.native
    
    var name: String = js.native
    
    var projection: js.UndefOr[Projection] = js.native
    
    var rangeKey: js.UndefOr[String] = js.native
    
    var `type`: local | global = js.native
  }
  object IndexDefinition {
    
    @scala.inline
    def apply(hashKey: String, name: String, `type`: local | global): IndexDefinition = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexDefinition]
    }
    
    @scala.inline
    implicit class IndexDefinitionMutableBuilder[Self <: IndexDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      @scala.inline
      def setType(value: local | global): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
