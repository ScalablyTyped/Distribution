package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.anon.ReadCapacity
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.dynamoDBMod.DocumentClient
import typings.dynamodb.dynamoDBMod.DynamoDB
import typings.dynamodb.dynamoDBMod.DynamoDbSet
import typings.dynamodb.dynamoDBMod.Projection
import typings.dynamodb.dynamodbStrings.global
import typings.dynamodb.dynamodbStrings.local
import typings.dynamodb.modelMod.Model
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
  val AWS: Any = js.native
  
  @JSImport("dynamodb", "Model")
  @js.native
  open class Model_[T] protected () extends Model[T] {
    def this(attrs: T) = this()
  }
  
  inline def Set(data: js.Array[Any], `type`: String): DynamoDbSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[DynamoDbSet]
  
  @JSImport("dynamodb", "createTables")
  @js.native
  val createTables: CreateTables_ = js.native
  
  inline def define(name: String, config: DefineConfig[Any]): Model[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model[Any]]
  
  inline def define_T[T](name: String, config: DefineConfig[T]): Model[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model[T]]
  
  inline def documentClient(): DocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("documentClient")().asInstanceOf[DocumentClient]
  inline def documentClient(docClient: DocumentClient): DocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("documentClient")(docClient.asInstanceOf[js.Any]).asInstanceOf[DocumentClient]
  
  inline def dynamoDriver(): DynamoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")().asInstanceOf[DynamoDB]
  inline def dynamoDriver(driver: DynamoDB): DynamoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")(driver.asInstanceOf[js.Any]).asInstanceOf[DynamoDB]
  
  @JSImport("dynamodb", "log")
  @js.native
  val log: typings.bunyan.mod.^ = js.native
  
  inline def model(name: String): Model[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[Model[Any]]
  inline def model(name: String, model: Model[Any]): Model[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Model[Any]]
  
  inline def model_T[T](name: String): Model[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[Model[T]]
  inline def model_T[T](name: String, model: Model[T]): Model[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Model[T]]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  object types {
    
    @JSImport("dynamodb", "types")
    @js.native
    val ^ : js.Any = js.native
    
    inline def binarySet(): AnySchema[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("binarySet")().asInstanceOf[AnySchema[Any]]
    
    inline def numberSet(): AnySchema[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("numberSet")().asInstanceOf[AnySchema[Any]]
    
    inline def stringSet(): AnySchema[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSet")().asInstanceOf[AnySchema[Any]]
    
    inline def timeUUID(): AnySchema[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUUID")().asInstanceOf[AnySchema[Any]]
    
    inline def uuid(): AnySchema[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[AnySchema[Any]]
  }
  
  type CreateTablesOptions = StringDictionary[ReadCapacity]
  
  @js.native
  trait CreateTables_ extends StObject {
    
    def apply(): js.Promise[Any] = js.native
    def apply(callback: Callback[Any]): Unit = js.native
    def apply(options: CreateTablesOptions): js.Promise[Any] = js.native
    def apply(options: CreateTablesOptions, callback: Callback[Any]): Unit = js.native
  }
  
  trait DefineConfig[T] extends StObject {
    
    var createdAt: js.UndefOr[Boolean | String] = js.undefined
    
    var hashKey: String
    
    var indexes: js.UndefOr[js.Array[IndexDefinition]] = js.undefined
    
    var rangeKey: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[StringDictionary[AnySchema[Any] | StringDictionary[AnySchema[Any]]]] = js.undefined
    
    var tableName: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var timestamps: js.UndefOr[Boolean] = js.undefined
    
    var updatedAt: js.UndefOr[Boolean | String] = js.undefined
  }
  object DefineConfig {
    
    inline def apply[T](hashKey: String): DefineConfig[T] = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineConfig[T]]
    }
    
    extension [Self <: DefineConfig[?], T](x: Self & DefineConfig[T]) {
      
      inline def setCreatedAt(value: Boolean | String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Array[IndexDefinition]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: IndexDefinition*): Self = StObject.set(x, "indexes", js.Array(value*))
      
      inline def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setSchema(value: StringDictionary[AnySchema[Any] | StringDictionary[AnySchema[Any]]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
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
