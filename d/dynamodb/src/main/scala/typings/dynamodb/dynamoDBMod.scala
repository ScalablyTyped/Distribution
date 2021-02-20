package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.dynamodbStrings.ALL
import typings.dynamodb.dynamodbStrings.Binary
import typings.dynamodb.dynamodbStrings.INCLUDE
import typings.dynamodb.dynamodbStrings.KEYS_ONLY
import typings.dynamodb.dynamodbStrings.Number
import typings.dynamodb.dynamodbStrings.String
import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamoDBMod {
  
  @js.native
  trait BinarySet extends DynamoDbSet {
    
    var `type`: Binary = js.native
    
    var values: js.Array[binaryType] = js.native
  }
  object BinarySet {
    
    @scala.inline
    def apply(`type`: Binary, values: js.Array[binaryType]): BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinarySet]
    }
    
    @scala.inline
    implicit class BinarySetMutableBuilder[Self <: BinarySet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[binaryType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: binaryType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type DocumentClient = js.Any
  
  type DynamoDB = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.dynamodb.dynamoDBMod.StringSet
    - typings.dynamodb.dynamoDBMod.NumberSet
    - typings.dynamodb.dynamoDBMod.BinarySet
  */
  trait DynamoDbSet extends StObject
  object DynamoDbSet {
    
    @scala.inline
    def BinarySet(`type`: Binary, values: js.Array[binaryType]): typings.dynamodb.dynamoDBMod.BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.BinarySet]
    }
    
    @scala.inline
    def NumberSet(`type`: Number, values: js.Array[Double]): typings.dynamodb.dynamoDBMod.NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.NumberSet]
    }
    
    @scala.inline
    def StringSet(`type`: String, values: js.Array[java.lang.String]): typings.dynamodb.dynamoDBMod.StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.StringSet]
    }
  }
  
  @js.native
  trait GetItemInput extends StObject {
    
    var AttributesToGet: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    var ConsistentRead: js.UndefOr[Boolean] = js.native
    
    var ExpressionAttributeNames: js.UndefOr[StringDictionary[java.lang.String]] = js.native
    
    var Key: js.Object = js.native
    
    var ProjectionExpression: js.UndefOr[java.lang.String] = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[java.lang.String] = js.native
    
    var TableName: java.lang.String = js.native
  }
  object GetItemInput {
    
    @scala.inline
    def apply(Key: js.Object, TableName: java.lang.String): GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemInput]
    }
    
    @scala.inline
    implicit class GetItemInputMutableBuilder[Self <: GetItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: js.Array[java.lang.String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: java.lang.String*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: StringDictionary[java.lang.String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKey(value: js.Object): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpression(value: java.lang.String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: java.lang.String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setTableName(value: java.lang.String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberSet extends DynamoDbSet {
    
    var `type`: Number = js.native
    
    var values: js.Array[Double] = js.native
  }
  object NumberSet {
    
    @scala.inline
    def apply(`type`: Number, values: js.Array[Double]): NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSet]
    }
    
    @scala.inline
    implicit class NumberSetMutableBuilder[Self <: NumberSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Projection extends StObject {
    
    var NonKeyAttributes: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | java.lang.String] = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonKeyAttributes(value: js.Array[java.lang.String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: java.lang.String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | java.lang.String): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
    }
  }
  
  @js.native
  trait StringSet extends DynamoDbSet {
    
    var `type`: String = js.native
    
    var values: js.Array[java.lang.String] = js.native
  }
  object StringSet {
    
    @scala.inline
    def apply(`type`: String, values: js.Array[java.lang.String]): StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringSet]
    }
    
    @scala.inline
    implicit class StringSetMutableBuilder[Self <: StringSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[java.lang.String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type binaryType = Buffer | js.Object | ArrayBuffer | DataView | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | Stream
}
