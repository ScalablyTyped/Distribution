package typings.dynamodb

import typings.dynamodb.dynamoDBMod.DynamoDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeNames extends StObject {
    
    var attributeNames: Any
    
    var attributeValues: Any
  }
  object AttributeNames {
    
    inline def apply(attributeNames: Any, attributeValues: Any): AttributeNames = {
      val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeNames] (val x: Self) extends AnyVal {
      
      inline def setAttributeNames(value: Any): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      inline def setAttributeValues(value: Any): Self = StObject.set(x, "attributeValues", value.asInstanceOf[js.Any])
    }
  }
  
  trait CapacityUnits extends StObject {
    
    var CapacityUnits: Double
    
    var TableName: String
  }
  object CapacityUnits {
    
    inline def apply(CapacityUnits: Double, TableName: String): CapacityUnits = {
      val __obj = js.Dynamic.literal(CapacityUnits = CapacityUnits.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapacityUnits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapacityUnits] (val x: Self) extends AnyVal {
      
      inline def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dynamodb extends StObject {
    
    var dynamodb: js.UndefOr[DynamoDB] = js.undefined
    
    var tableName: js.UndefOr[String] = js.undefined
  }
  object Dynamodb {
    
    inline def apply(): Dynamodb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dynamodb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dynamodb] (val x: Self) extends AnyVal {
      
      inline def setDynamodb(value: DynamoDB): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  trait ReadCapacity extends StObject {
    
    var readCapacity: Double
    
    var writeCapacity: Double
  }
  object ReadCapacity {
    
    inline def apply(readCapacity: Double, writeCapacity: Double): ReadCapacity = {
      val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadCapacity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadCapacity] (val x: Self) extends AnyVal {
      
      inline def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    }
  }
}
