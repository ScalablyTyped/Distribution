package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.bunyan.mod.^
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.dynamoDBMod.DynamoDB
import typings.dynamodb.modelMod.Model.OperationOptions
import typings.dynamodb.queryMod.Query
import typings.dynamodb.scanMod.ParallelScan
import typings.dynamodb.scanMod.Scan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttributeNames extends StObject {
    
    var attributeNames: js.Any = js.native
    
    var attributeValues: js.Any = js.native
  }
  object AttributeNames {
    
    @scala.inline
    def apply(attributeNames: js.Any, attributeValues: js.Any): AttributeNames = {
      val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeNames]
    }
    
    @scala.inline
    implicit class AttributeNamesMutableBuilder[Self <: AttributeNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeNames(value: js.Any): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValues(value: js.Any): Self = StObject.set(x, "attributeValues", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dynamodb extends StObject {
    
    var dynamodb: js.UndefOr[DynamoDB] = js.native
    
    var tableName: js.UndefOr[String] = js.native
  }
  object Dynamodb {
    
    @scala.inline
    def apply(): Dynamodb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dynamodb]
    }
    
    @scala.inline
    implicit class DynamodbMutableBuilder[Self <: Dynamodb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamodb(value: DynamoDB): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  @js.native
  trait ReadCapacity extends StObject {
    
    var readCapacity: Double = js.native
    
    var writeCapacity: Double = js.native
  }
  object ReadCapacity {
    
    @scala.inline
    def apply(readCapacity: Double, writeCapacity: Double): ReadCapacity = {
      val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadCapacity]
    }
    
    @scala.inline
    implicit class ReadCapacityMutableBuilder[Self <: ReadCapacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofModel extends StObject {
    
    val after: js.Any = js.native
    
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    def batchGetItems(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    val before: js.Any = js.native
    
    def config(config: Dynamodb): js.Any = js.native
    
    def create(doc: js.Any): js.Promise[_] = js.native
    def create(doc: js.Any, callback: Callback): Unit = js.native
    def create(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
    def create(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
    
    def createTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    def createTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    def deleteTable(): js.Promise[_] = js.native
    def deleteTable(callback: Callback): Unit = js.native
    
    def describeTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    def describeTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
    
    def destroy(data: String, callback: Callback): Unit = js.native
    def destroy(data: String, options: OperationOptions, callback: Callback): Unit = js.native
    def destroy(data: StringDictionary[js.Any], callback: Callback): Unit = js.native
    def destroy(data: StringDictionary[js.Any], options: OperationOptions, callback: Callback): Unit = js.native
    def destroy(hashKey: String): js.Promise[_] = js.native
    def destroy(hashKey: String, options: String): js.Promise[_] = js.native
    def destroy(hashKey: String, options: OperationOptions): js.Promise[_] = js.native
    def destroy(hashKey: String, rangeKey: String, callback: Callback): Unit = js.native
    def destroy(hashKey: String, rangeKey: String, options: OperationOptions): js.Promise[_] = js.native
    def destroy(hashKey: String, rangeKey: String, options: OperationOptions, callback: Callback): Unit = js.native
    
    def get(data: String, callback: Callback): Unit = js.native
    def get(data: String, options: String, callback: Callback): Unit = js.native
    def get(data: String, options: js.Object, callback: Callback): Unit = js.native
    def get(data: js.Object, callback: Callback): Unit = js.native
    def get(data: js.Object, options: String, callback: Callback): Unit = js.native
    def get(data: js.Object, options: js.Object, callback: Callback): Unit = js.native
    def get(hashKey: String): js.Promise[_] = js.native
    def get(hashKey: String, options: String): js.Promise[_] = js.native
    def get(hashKey: String, options: js.Object): js.Promise[_] = js.native
    def get(hashKey: String, rangeKey: String, options: js.Object): js.Promise[_] = js.native
    def get(hashKey: String, rangeKey: String, options: js.Object, callback: Callback): Unit = js.native
    
    def getItems(keys: js.Array[_]): js.Promise[_] = js.native
    def getItems(keys: js.Array[_], callback: Callback): Unit = js.native
    def getItems(keys: js.Array[_], options: js.Any): js.Promise[_] = js.native
    def getItems(keys: js.Array[_], options: js.Any, callback: Callback): Unit = js.native
    
    val log: ^ = js.native
    
    def parallelScan(totalSegments: Double): ParallelScan = js.native
    
    def query(hashKey: String): Query = js.native
    
    def scan(): Scan = js.native
    
    def tableName(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] = js.native
    def tableName(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): Unit = js.native
    
    def update(item: js.Any): js.Promise[_] = js.native
    def update(item: js.Any, callback: Callback): Unit = js.native
    def update(item: js.Any, options: OperationOptions): js.Promise[_] = js.native
    def update(item: js.Any, options: OperationOptions, callback: Callback): Unit = js.native
    
    def updateTable(hashKey: String, rangeKey: String, options: js.Any): js.Promise[_] | Unit = js.native
    def updateTable(hashKey: String, rangeKey: String, options: js.Any, callback: Callback): js.Promise[_] | Unit = js.native
  }
}
