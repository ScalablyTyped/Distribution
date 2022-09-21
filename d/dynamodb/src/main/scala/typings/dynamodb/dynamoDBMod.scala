package typings.dynamodb

import org.scalablytyped.runtime.StringDictionary
import typings.dynamodb.dynamodbStrings.ALL
import typings.dynamodb.dynamodbStrings.Binary
import typings.dynamodb.dynamodbStrings.INCLUDE
import typings.dynamodb.dynamodbStrings.KEYS_ONLY
import typings.dynamodb.dynamodbStrings.Number
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamoDBMod {
  
  trait BinarySet
    extends StObject
       with DynamoDbSet {
    
    var `type`: Binary
    
    var values: js.Array[binaryType]
  }
  object BinarySet {
    
    inline def apply(values: js.Array[binaryType]): BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Binary")
      __obj.asInstanceOf[BinarySet]
    }
    
    extension [Self <: BinarySet](x: Self) {
      
      inline def setType(value: Binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[binaryType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: binaryType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type DocumentClient = Any
  
  type DynamoDB = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.dynamodb.dynamoDBMod.StringSet
    - typings.dynamodb.dynamoDBMod.NumberSet
    - typings.dynamodb.dynamoDBMod.BinarySet
  */
  trait DynamoDbSet extends StObject
  object DynamoDbSet {
    
    inline def BinarySet(values: js.Array[binaryType]): typings.dynamodb.dynamoDBMod.BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Binary")
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.BinarySet]
    }
    
    inline def NumberSet(values: js.Array[Double]): typings.dynamodb.dynamoDBMod.NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Number")
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.NumberSet]
    }
    
    inline def StringSet(values: js.Array[String]): typings.dynamodb.dynamoDBMod.StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("String")
      __obj.asInstanceOf[typings.dynamodb.dynamoDBMod.StringSet]
    }
  }
  
  trait GetItemInput extends StObject {
    
    var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
    
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    
    var ExpressionAttributeNames: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var Key: js.Object
    
    var ProjectionExpression: js.UndefOr[String] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[String] = js.undefined
    
    var TableName: String
  }
  object GetItemInput {
    
    inline def apply(Key: js.Object, TableName: String): GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemInput]
    }
    
    extension [Self <: GetItemInput](x: Self) {
      
      inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExpressionAttributeNames(value: StringDictionary[String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setKey(value: js.Object): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setReturnConsumedCapacity(value: String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberSet
    extends StObject
       with DynamoDbSet {
    
    var `type`: Number
    
    var values: js.Array[Double]
  }
  object NumberSet {
    
    inline def apply(values: js.Array[Double]): NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Number")
      __obj.asInstanceOf[NumberSet]
    }
    
    extension [Self <: NumberSet](x: Self) {
      
      inline def setType(value: Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait Projection extends StObject {
    
    var NonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.undefined
  }
  object Projection {
    
    inline def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    extension [Self <: Projection](x: Self) {
      
      inline def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
      
      inline def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
    }
  }
  
  trait StringSet
    extends StObject
       with DynamoDbSet {
    
    var `type`: typings.dynamodb.dynamodbStrings.String
    
    var values: js.Array[String]
  }
  object StringSet {
    
    inline def apply(values: js.Array[String]): StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("String")
      __obj.asInstanceOf[StringSet]
    }
    
    extension [Self <: StringSet](x: Self) {
      
      inline def setType(value: typings.dynamodb.dynamodbStrings.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type binaryType = Buffer | js.Object | js.typedarray.ArrayBuffer | js.typedarray.DataView | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | Stream
}
