package typings.dynogels.mod

import typings.dynogels.mod.AWS.DynamoDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelConfig extends StObject {
  
  var docClient: js.UndefOr[Any] = js.undefined
  
  var dynamodb: js.UndefOr[DynamoDB] = js.undefined
  
  var tableName: js.UndefOr[String] = js.undefined
}
object ModelConfig {
  
  inline def apply(): ModelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelConfig] (val x: Self) extends AnyVal {
    
    inline def setDocClient(value: Any): Self = StObject.set(x, "docClient", value.asInstanceOf[js.Any])
    
    inline def setDocClientUndefined: Self = StObject.set(x, "docClient", js.undefined)
    
    inline def setDynamodb(value: DynamoDB): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
